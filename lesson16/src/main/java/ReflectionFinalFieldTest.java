import java.lang.reflect.Field;

public class ReflectionFinalFieldTest {
    private final int x = 0;

    @Override
    public String toString() {
        return "" + x;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ReflectionFinalFieldTest o = new ReflectionFinalFieldTest();
        System.out.println(o + " " + o.x);

        Field xField = o.getClass().getDeclaredField("x");
        xField.setAccessible(true);
        xField.set(o, 5);
        System.out.println(o + " " + o.x);
    }
}
