//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.25 at 10:02:44 PM MSK 
//


package ru.sbt.jschool;

import java.time.LocalDate;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, LocalDate>
{


    public LocalDate unmarshal(String value) {
        return (fith.SchoolJaxbUtils.fromXML(value));
    }

    public String marshal(LocalDate value) {
        return (fith.SchoolJaxbUtils.toXML(value));
    }

}
