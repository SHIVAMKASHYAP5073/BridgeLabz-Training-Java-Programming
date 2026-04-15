import java.util.Scanner;

public class KMtoMIles2 {
    public static void main(String[] args){
        double km;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the DIstance");
        km=sc.nextDouble();
        double miles=km/1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        sc.close();
    
    } 
    
}
