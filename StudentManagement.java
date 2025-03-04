//StudentManagement.java
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    // Add a student
    public void addStudent(Scanner sc) {
        System.out.print("Enter PRN: ");
        String prn = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
        String dob = sc.next();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student newStudent = new Student(prn, name, dob, marks);
        students.add(newStudent);
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            s.displayStudent();
        }
    }

    // Search student by PRN
    public void searchByPrn(String prn) {
        for (Student s : students) {
            if (s.getPrn().equalsIgnoreCase(prn)) {
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    // Search student by Name
    public void searchByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student with name " + name + " not found.");
    }

    // Search student by position (index)
    public void searchByPosition(int index) {
        if (index >= 0 && index < students.size()) {
            students.get(index).displayStudent();
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Update student details
    public void updateStudent(String prn, Scanner sc) {
        for (Student s : students) {
            if (s.getPrn().equalsIgnoreCase(prn)) {
                System.out.print("Enter new Name: ");
                s.setName(sc.next());
                System.out.print("Enter new Date of Birth (DD/MM/YYYY): ");
                s.setDob(sc.next());
                System.out.print("Enter new Marks: ");
                s.setMarks(sc.nextDouble());
                System.out.println("Student details updated successfully!");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    // Delete a student
    public void deleteStudent(String prn) {
        for (Student s : students) {
            if (s.getPrn().equalsIgnoreCase(prn)) {
                students.remove(s);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }
}
