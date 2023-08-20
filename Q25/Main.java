package Q25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number=1;
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("   ");
            }
            for(int k=0;k<(i*2-1);k++){
                System.out.print(number+"  ");
                number++;
            }
            System.out.println();
        }
        sc.close();
    }
}
