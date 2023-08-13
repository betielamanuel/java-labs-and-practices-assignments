package Operators_And_Numbers;

public class BinaryShift {
    public static void main(String[] args) {
        int x = 2;
        System.out.println("Binary: "+Integer.toBinaryString(x));

        x = x << 1;
        System.out.println("Decimal: " + x + " || Binary: " + Integer.toBinaryString(x));

        // For value 9
        int y = 9;
        System.out.println("Binary: "+Integer.toBinaryString(x));

        y = y << 1;
        System.out.println("Decimal: " + y + " || Binary: " + Integer.toBinaryString(y));

        // For value 17
        int z = 17;
        System.out.println("Binary: "+Integer.toBinaryString(x));

        z = z << 1;
        System.out.println("Decimal: " + z + " || Binary: " + Integer.toBinaryString(z));

        // For value 88
        int w = 88;
        System.out.println("Binary: "+Integer.toBinaryString(x));

        w = w << 1;
        System.out.println("Decimal: " + w + " || Binary: " + Integer.toBinaryString(w));
    }
}