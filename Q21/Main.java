package Q21;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n*2-3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
            }
            for(int j=space;j>=0;j--){
                System.out.print("   ");
            }
            space=space-2;
            
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
