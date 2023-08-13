package Operators_And_Numbers;

public class BitwiseAND {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        int z;

        // Predicted result of bitwise AND: 1 (binary: 0001)
        z = x & y;

        System.out.println("x: " + x + ", Binary: " + Integer.toBinaryString(x));
        System.out.println("y: " + y + ", Binary: " + Integer.toBinaryString(y));
        System.out.println("z (x & y): " + z + ", Binary: " + Integer.toBinaryString(z));
    }
}
