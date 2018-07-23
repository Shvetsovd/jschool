public class Task {
    public static int add(int a, int b){
        long result = (long) a + b;
        if (result > Integer.MAX_VALUE){
            throw new IllegalArgumentException("Integer overflow!");
        }
        return (int)result;
    }
}
