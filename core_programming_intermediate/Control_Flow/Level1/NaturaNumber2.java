package core_programming_intermediate.Control_Flow.Level1;


import java.util.Scanner;

public class NaturaNumber2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // check natural number
        if (n <= 0) {
            System.out.println("Not a natural number");
            
        }

        // 🔹 While loop se sum
        int sumLoop = 0;
        int i = 1;

        while (i <= n) {
            sumLoop = sumLoop + i;
            i++;
        }

        // 🔹 Formula se sum
        int sumFormula = n * (n + 1) / 2;

        // 🔹 Results print
        System.out.println("Sum using while loop = " + sumLoop);
        System.out.println("Sum using formula = " + sumFormula);

        // 🔹 Compare
        if (sumLoop == sumFormula) {
            System.out.println("Both results are correct ✅");
        } else {
            System.out.println("Mismatch ❌");
        }
        sc.close();
    }
}