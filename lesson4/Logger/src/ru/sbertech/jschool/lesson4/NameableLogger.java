package ru.sbertech.jschool.lesson4;

public class NameableLogger extends Logger{
    private final String name;

    public NameableLogger(int level, String name) {
        super(level);
        this.name = name;
    }

    @Override
    protected String buildLogMessage(String message) {
        return String.format("%s: %s", name, super.buildLogMessage(message));
    }

    @Override
    public String toString() {
        return "NameableLogger{" +
                "name='" + name + '\''+
                super.toString() +
                "} " ;
    }
}
