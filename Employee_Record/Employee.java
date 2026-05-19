package Employee_Record;
import java.util.HashMap;
import java.util.Scanner;

 class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

 class Main {
    public static void main(String[] args) {

        HashMap<Integer, Employee> map = new HashMap<>();

        map.put(101, new Employee(101, "Shivam", "IT"));
        map.put(102, new Employee(102, "Kashyap", "HR"));
        map.put(103, new Employee(103, "Rahul", "Finance"));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID to search: ");
        int searchId = sc.nextInt();

        if (map.containsKey(searchId)) {
            System.out.println("Employee Found:");
            map.get(searchId).display();
        } else {
            System.out.println("Employee not found");
        }

        sc.close();
    }
} 
    

