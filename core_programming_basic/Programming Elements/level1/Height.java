import java.util.Scanner;
public class Height{
    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
     System.out.print("Enter height in cm: ");
        double cm = sc.nextDouble();
        double totalinch=cm/2.54;
        int feet=(int)(totalinch/12);
        double inch=totalinch%12;
         System.out.println("Your Height in cm is " + cm +
                " while in feet is " + feet + " and inches is " + inch);

       sc.close();
    }
    
}
