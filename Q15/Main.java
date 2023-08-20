package Q15;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n*2-1;i++){
            if(i<=n){
            for(int k=1;k<i;k++){
                System.out.print("    ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            }else{
                for(int k=i;k<n*2-1;k++){
                    System.out.print("    ");
                }
                for(int j=n;j<=i;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
