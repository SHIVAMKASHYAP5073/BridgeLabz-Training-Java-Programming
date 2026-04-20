import java.util.*;

public class StudentManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] roll = new int[n];
        String[] name = new String[n];

        int[] m1 = new int[n];
        int[] m2 = new int[n];
        int[] m3 = new int[n];

        double[] percent = new double[n];

        String[] g1 = new String[n];
        String[] g2 = new String[n]; 
        String[] g3 = new String[n]; 

        String[] finalGrade = new String[n];

        for(int i = 0; i < n; i++) {

            System.out.print("\nEnter Roll No: ");
            roll[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Math marks: ");
            m1[i] = sc.nextInt();

            System.out.print("Enter Science marks: ");
            m2[i] = sc.nextInt();

            System.out.print("Enter English marks: ");
            m3[i] = sc.nextInt();

            
            g1[i] = getGrade(m1[i]);
            g2[i] = getGrade(m2[i]);
            g3[i] = getGrade(m3[i]);

            int total = m1[i] + m2[i] + m3[i];
            percent[i] = total / 3.0;

            
            if(m1[i] < 34 || m2[i] < 34 || m3[i] < 34) {
                finalGrade[i] = "FAIL";
            } else {
                finalGrade[i] = getGrade((int)percent[i]);
            }
        }

        
        System.out.println("\n------ RESULT ------");

        for(int i = 0; i < n; i++) {
            System.out.println("\nRoll: " + roll[i] + " | Name: " + name[i]);

            System.out.println("Math: " + m1[i] + " Grade: " + g1[i]);
            System.out.println("Science: " + m2[i] + " Grade: " + g2[i]);
            System.out.println("English: " + m3[i] + " Grade: " + g3[i]);

            System.out.println("Percentage: " + percent[i]);
            System.out.println("Final Result: " + finalGrade[i]);
        }
    }

    
    static String getGrade(int marks) {
        if(marks >= 90) return "A+";
        else if(marks >= 80) return "A";
        else if(marks >= 70) return "B";
        else if(marks >= 60) return "C";
        else if(marks >= 34) return "D";
        else return "F";
    }
}