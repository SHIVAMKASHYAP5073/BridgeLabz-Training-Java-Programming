package core_programming_intermediate.Control_Flow.Level1;


import java.util.*;
class Vote{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the Age of person:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("The Person's age is "+age+" and can vote");
        }
        else{
            System.out.println("the person age is "+ age+ "and can not vote");
        }
        sc.close();

    }
}