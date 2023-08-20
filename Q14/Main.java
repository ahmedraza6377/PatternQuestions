package Q14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n*2-1;i++){
            if(i<=n){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            }else{
                 for(int k=n;k<i;k++){
                System.out.print("  ");
            }
            for(int j=i;j<n*2;j++){
                System.out.print("* ");
            }
            }
            System.out.println();
        }
        sc.close();
    }
}
