import java.util.Scanner;
//class object constructor
public class Student {
    String USN;
    String Name;
    String Branch;
    long phone;

    public Student(String USN, String name, String branch, long phone) {
        this.USN = USN;
        this.Name = name;
        this.Branch = branch;
        this.phone = phone;
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("USN Number: " + USN);
        System.out.println("Name: " + Name);
        System.out.println("Department: " + Branch);
        System.out.println("Phone number: " + phone);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter usn number: ");
            String usn = sc.nextLine();
            System.out.print("Enter branch: ");
            String branch = sc.nextLine();
            System.out.print("Enter phone no: ");
            long phone = sc.nextLong();
            sc.nextLine();

            students[i] = new Student(usn, name, branch, phone);
        }

        System.out.println("\n===== STUDENT INFORMATION =====");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}
