package Q27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        for(int i=1;i<=n;i++){
            int number=1;
            for(int j=i;j<n;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=(i*2-1);k++){
                
                int mid=(((i*2)-1)/2)+1;
                System.out.print(number+"  ");
               
                if(k>=mid){
                   number--;
                }else{
                     number++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
