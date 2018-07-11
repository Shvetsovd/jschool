import java.util.Random;

public class Cube {
    private final Random r;
    private final int borderNumber;

    public Cube(int borderNumber) {
        this.r = new Random();
        this.borderNumber = borderNumber;
    }
    public int throwCube(){
        return r.nextInt(borderNumber) + 1;
    }
}

class CubeTest{
    public static void main(String[] args) {
        int result = 0;
        Cube cube1 = new Cube(6);
        Cube cube2 = new Cube(6);

        for (int i = 0; i < 1; i++) {
            result += cube1.throwCube();
            result += cube2.throwCube();
        }
        System.out.println("sum = " + result);
    }
}
