package Q26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=(i*2-1);k++){
                System.out.print(k+"  ");
            
            }
            System.out.println();
        }
        sc.close();
    }
}

