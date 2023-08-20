package Q17;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n/2;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n;j++){
                if(j<=x||j>n-x){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
            if(i<=n/2){
                x--;
            }else{
                x++;
            }
        }
        sc.close();
        
    }
}
