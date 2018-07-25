package ru.sbt.jschool;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

public class MarshalToXML {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(CarType.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        CarType carType = new CarType();
        carType.setManufacturer("bmw");
        carType.setColor("black");
        carType.setBirthDay(LocalDate.of(2018, 01,01));

        File file = new File("src/main/resources/marshal.xml");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(new ObjectFactory().createCar(carType), file);

        //System.out.println(sw.toString());
    }
}
