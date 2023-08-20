package Q32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        // Upper half of the pattern
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-3d", i);
                if (j < i) {
                    System.out.print("*  ");
                }
            }
            System.out.println(); 
        }
        
        // Lower half of the pattern
        for (int i = n - 1; i >= 1; i--) {
           
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-3d", i);
                if (j < i) {
                    System.out.print("*  ");
                }
            }
            System.out.println(); 
        }
        sc.close();
    }
}