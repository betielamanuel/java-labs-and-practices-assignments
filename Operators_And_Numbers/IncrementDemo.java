package Operators_And_Numbers;

public class IncrementDemo {
    public static void main(String[] args) {
        int number = 5;

        // Using simple addition
        System.out.println("Original value: " + number);
        number = number + 1;
        System.out.println("After increment using addition: " + number);

        // Using compound assignment (+=)
        number += 1;
        System.out.println("After increment using compound assignment: " + number);

        // Using the prefix increment operator (++)
        ++number;
        System.out.println("After increment using prefix increment operator: " + number);

        // Repeating the process
        System.out.println("\nRepeating the process multiple times:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Original value: " + number);
            number += 1;
            System.out.println("After increment using compound assignment: " + number);
        }
    }
}

