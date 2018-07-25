package ru.sbt.jschool;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.transform.stream.StreamSource;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnmarshalFromXML {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(CarType.class);
        JAXBElement<CarType> unmarshal = jaxbContext.createUnmarshaller().unmarshal(
                new StreamSource(
                        new FileReader("src/main/resources/Marshal.xml")), CarType.class);
        System.out.println(unmarshal.getValue().getManufacturer());
    }
}
