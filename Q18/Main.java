package Q18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=2;
        
        for(int i=1;i<=n*2-1;i++){
            if(i<=n){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int k=0;k<(i*2-1);k++){
                System.out.print("* ");
            }
            }else{
                for(int j=n;j<i;j++){
                     System.out.print("  ");
                }
                for(int k=h;k<=n*2-h;k++){
                    System.out.print("* ");
                }
                h++;
            }
            System.out.println();
        }
        sc.close();
    }
}
