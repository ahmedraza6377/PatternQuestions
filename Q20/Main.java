package Q20;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c1=(n-1)/2;
        int c2=3*n/2-1;
        int i;
        int j;
        for( i=0;i<n;i++){
            
            for(j=0;j<n;j++){
                if(i+j==c1||i-j==c1||j-i==c1||i+j==c2){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            
            System.out.println();
            
        }
        sc.close();
        
    }
}
