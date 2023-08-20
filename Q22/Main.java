package Q22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*  ");
            }
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("   ");
            }
            if(i==1){
                for(int j=i;j<=n-1;j++){
                System.out.print("*  ");
                }
            }else{
                
             for(int j=i;j<=n;j++){
                System.out.print("*  ");
              }
            }
           
            System.out.println();
        }
        sc.close();
    }
}
