package fith;

import java.time.LocalDate;

public class SchoolJaxbUtils {
    public static LocalDate fromXML(String s){
        return LocalDate.parse(s);
    }
    public static String toXML(LocalDate date){
        return date.toString();
    }
}
