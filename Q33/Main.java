package Q33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("   ");
            }

            // Print numbers in ascending order
            for (int j = i + 1; j > 0; j--) {
                System.out.printf("%3d", j);
            }

            // Print numbers in descending order
            for (int j = 2; j <= i + 1; j++) {
                System.out.printf("%3d", j);
            }

            System.out.println(); // Move to the next line
        }
    }
}
