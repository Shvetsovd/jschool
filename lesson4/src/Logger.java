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
    public void log(int level, String message){
        if (level <= this.level){
            System.out.println(String.format("%s %s %s: %s",
                    messageCounter,
                    LocalDateTime.now(),
                    level,
                    message));
        }
    }

    @Override
    public String toString() {
        return "Logger{" +
                "level=" + level +
                ", messageNumber=" + messageCounter +
                '}';
    }
}
