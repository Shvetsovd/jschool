package ru.sbertech.jschool.lesson4.test;

import ru.sbertech.jschool.lesson4.Logger;
import ru.sbertech.jschool.lesson4.NameableLogger;
import ru.sbertech.jschool.lesson4.RepeatableLogger;

import java.util.Arrays;
import java.util.List;

import static ru.sbertech.jschool.lesson4.Logger.*;

/**
 * Created by Dim on 11.07.2018.
 */
public class LoggerTest {
    public static void main(String[] args) {
        final List<Integer> levels = Arrays.asList(ERROR, INFO, DEBUG);
        final String msg = "message";
        final String name = "name";
        final int repeats = 3;

        //foreach logger level
        for (Integer level : levels) {
            final List<Logger> loggers = Arrays.asList(
                    new Logger(level),
                    new NameableLogger(level, name),
                    new RepeatableLogger(level, repeats));

            //foreach type of loggers
            for (Logger logger : loggers) {

                //foreach message level
                for (Integer l : levels) {
                    logger.log(l, msg);
                    System.out.println("---");
                }
            }
        }
    }
}
