package ru.sbertech.jschool.lesson4;

/**
 * Created by Dim on 11.07.2018.
 */
public class RepeatableLogger extends Logger {
    private final int repeats;

    public RepeatableLogger(int level, int repeats) {
        super(level);
        if (repeats < 0){
            throw new IllegalArgumentException("Negative repeats count: " + repeats);
        }
        this.repeats = repeats;
    }

    @Override
    public void log(int level, String message) {
        if (!isForLogging(level)){
            return;
        }
        for (int i = 0; i < repeats; i++) {
            super.log(level, message);
        }
    }

    @Override
    public String toString() {
        return "RepeatableLogger{" +
                "repeats=" + repeats +
                super.toString() +
                "} " ;
    }
}
