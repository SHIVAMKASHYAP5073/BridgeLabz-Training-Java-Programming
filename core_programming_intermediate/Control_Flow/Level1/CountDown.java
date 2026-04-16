package core_programming_intermediate.Control_Flow.Level1;


import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take input
        System.out.print("Enter countdown number: ");
        int counter = sc.nextInt();

        // while loop countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--;   // decrement
        }

        System.out.println("🚀 Launch!");
        sc.close();
    }
}