//Main.java
/*
    Name: Ranveer Singh
    PRN: 23070126102
    Batch: AIML 23-27 B1
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search Student by Position");
            System.out.println("6. Update Student Details");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sm.addStudent(sc);
                    break;
                case 2:
                    sm.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter PRN to search: ");
                    sm.searchByPrn(sc.next());
                    break;
                case 4:
                    System.out.print("Enter Name to search: ");
                    sm.searchByName(sc.next());
                    break;
                case 5:
                    System.out.print("Enter position (index) to search: ");
                    sm.searchByPosition(sc.nextInt());
                    break;
                case 6:
                    System.out.print("Enter PRN to update: ");
                    sm.updateStudent(sc.next(), sc);
                    break;
                case 7:
                    System.out.print("Enter PRN to delete: ");
                    sm.deleteStudent(sc.next());
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);

        sc.close();
    }
}
