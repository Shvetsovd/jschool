import java.util.Objects;

public class NameableLogger extends Logger{
    private final String name;

    public NameableLogger(int level, String name) {
        super(level);
        this.name = name;
    }

    @Override
    public void log(int level, String message) {
        System.out.print(String.format("%s: ", name));
        super.log(level, message);
    }

    @Override
    public String toString() {
        return "NameableLogger{" +
                "name='" + name + '\'' +
                super.toString() +
                '}';
    }

    public static void main(String[] args) {
        NameableLogger logger = new NameableLogger(ERROR, "Error Logger");
        logger.log(ERROR, "blablabla");
        System.out.println(logger);
    }
}
