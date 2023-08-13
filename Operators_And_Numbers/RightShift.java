package Operators_And_Numbers;

public class RightShift {
    public static void main(String[] args) {
        int x;

        //For value 150
        x = 150;
        System.out.println("Original value: " + x + " || Binary: " + Integer.toBinaryString(x));

        // Shifting right by 2 positions
        x = x >> 2;
        System.out.println("After right shift: " + x + " || Binary: " + Integer.toBinaryString(x));

        // For value 225
        x = 225;
        System.out.println("Original value: " + x + ", Binary: " + Integer.toBinaryString(x));

        // Shifting right by 2 positions
        x = x >> 2;
        System.out.println("After right shift: " + x + ", Binary: " + Integer.toBinaryString(x));

        // For value 1555
        x = 1555;
        System.out.println("Original value: " + x + ", Binary: " + Integer.toBinaryString(x));

        // Shifting right by 2 positions
        x = x >> 2;
        System.out.println("After right shift: " + x + ", Binary: " + Integer.toBinaryString(x));

        // For value 32456
        x = 32456;
        System.out.println("Original value: " + x + ", Binary: " + Integer.toBinaryString(x));

        // Shifting right by 2 positions
        x = x >> 2;
        System.out.println("After right shift: " + x + ", Binary: " + Integer.toBinaryString(x));
    }
}
