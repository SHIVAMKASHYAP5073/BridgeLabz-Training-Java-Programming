package core_programming_intermediate.Control_Flow.Level1;


import java.util.Scanner;
class Largest{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1=sc.nextInt();
        System.out.println("Enter Second Number:");
        int n2=sc.nextInt();
        System.out.println("Enter third number:");
        int n3=sc.nextInt();
        boolean largest= (n1>n2) && (n1>n3);
        System.out.println("Is the first number the largest?"+largest);
        largest= (n2>n1) && (n2>n3);
        System.out.println("Is the second number the largest?"+largest);
        largest=(n3>n1) && (n3>n2);
        System.out.println("Is the third number the largest?"+largest);
        sc.close();
       
    }
}
