package ru.sbertech.jschool.lesson4;

import java.time.LocalDateTime;

public class Logger {
    public static final int ERROR = 0;
    public static final int INFO = 10;
    public static final int DEBUG = 20;

    private final int level;
    private int messageCounter;

    public Logger(int level) {
        this.level = level;
    }

    public void log(int level, String message) {
        if (isForLogging(level)) {
            System.out.println(buildLogMessage(message));
        }
    }

    protected String buildLogMessage(String message) {
        return String.format("%s %s %s: %s",
                messageCounter++,
                LocalDateTime.now(),
                level,
                message);
    }

    protected boolean isForLogging(int level) {
        return level <= this.level;
    }

    @Override
    public String toString() {
        return "Logger{" +
                "level=" + level +
                ", messageCounter=" + messageCounter +
                '}';
    }
}
