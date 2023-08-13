package Operators_And_Numbers;

public class BitwiseOR {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        int z;

        z = x | y;

        System.out.println("x: " + x + ", Binary: " + Integer.toBinaryString(x));
        System.out.println("y: " + y + ", Binary: " + Integer.toBinaryString(y));
        System.out.println("z (x | y): " + z + ", Binary: " + Integer.toBinaryString(z));
    }
}
