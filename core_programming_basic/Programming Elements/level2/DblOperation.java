import java.util.Scanner;
public class DblOperation {
    


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a=sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b=sc.nextDouble();
        System.out.println("Enter the value of c:");
        double c=sc.nextDouble();

        double result= a + b *c;
        double result1=a * b + c;
        double result3=c + a / b;
        double result4= a % b + c;
        System.out.println("The result of the IntOperation are" + result + "," + result1 + ","+ result3 + "," + "and" + result4);
        sc.close();


        


    }
    
    
}

    

