package core_programming_intermediate.Control_Flow.Level1;


import java.util.*;
class NaturalNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= sc.nextInt();
        if( n >=0){
            int sum= n * (n+1) / 2;

            System.out.println("the sum of " + n + " Natural Number is"+ sum);
             
        }
        else{
            System.out.println("it is not a natural number");
        }
        sc.close();

    }
    
}
