package core_programming_intermediate.Control_Flow.Level1;


import java.util.Scanner;

public class FiveDivisible {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("Number is Divisible by 5");
        }else{
            System.out.println("Number is Divisible by 5");
        }
        sc.close();

    }
    
}
