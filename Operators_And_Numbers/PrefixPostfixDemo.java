package Operators_And_Numbers;

public class PrefixPostfixDemo {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        // Using prefix increment
        int sumPrefix = ++x + y;
        System.out.println("Using prefix increment:");
        System.out.println("sum: " + sumPrefix);

        // Resetting x
        x = 5;

        // Using postfix increment
        int sumPostfix = x++ + y;
        System.out.println("\nUsing postfix increment:");
        System.out.println("sum: " + sumPostfix);
    }
}


