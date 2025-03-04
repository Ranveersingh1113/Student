
# Student Management System (Java)

## Overview
This is a **menu-driven Java program** that demonstrates the concepts of **classes, array of objects, instance members, and constructors** in Java. It allows users to **add, display, search, update, and delete students** using an `ArrayList`. 

## Features Implemented
- **Encapsulation:** The `Student` class uses private attributes with getter and setter methods.
- **Array of Objects:** Uses `ArrayList<Student>` to store student records dynamically.
- **Instance Members & Constructors:** Each student is created using a constructor with attributes like PRN, name, DoB, and marks.
- **Modular Structure:** Separate methods handle different operations for better readability and maintainability.
- **Menu-driven Interface:** Allows users to interact and perform operations easily.

---

## Files in the Repository
### 1. `Student.java`
Defines the **Student class** with the following attributes:
- `prn`: Unique PRN of the student.
- `name`: Name of the student.
- `dob`: Date of Birth of the student.
- `marks`: Marks obtained.

#### Methods in `Student.java`
| Method | Description |
|--------|------------|
| `Student(String prn, String name, String dob, double marks)` | Constructor to initialize student details. |
| `getPrn()`, `setPrn(String prn)` | Getter and setter for PRN. |
| `getName()`, `setName(String name)` | Getter and setter for Name. |
| `getDob()`, `setDob(String dob)` | Getter and setter for Date of Birth. |
| `getMarks()`, `setMarks(double marks)` | Getter and setter for Marks. |
| `displayStudent()` | Displays student details. |

---

### 2. `StudentManagement.java`
Handles all student-related operations using an `ArrayList<Student>`. 

#### Methods in `StudentManagement.java`
| Method | Description |
|--------|------------|
| `addStudent(Scanner sc)` | Adds a new student to the list. |
| `displayStudents()` | Displays all students in the list. |
| `searchByPrn(String prn)` | Searches for a student using PRN. |
| `searchByName(String name)` | Searches for a student using name. |
| `searchByPosition(int index)` | Retrieves a student by position in the list. |
| `updateStudent(String prn, Scanner sc)` | Updates student details (Name, DoB, Marks). |
| `deleteStudent(String prn)` | Deletes a student by PRN. |

---

### 3. `Main.java`
Contains the **menu-driven program** for user interaction.

#### Menu Options
1. **Add Student**
2. **Display All Students**
3. **Search Student by PRN**
4. **Search Student by Name**
5. **Search Student by Position**
6. **Update Student Details**
7. **Delete Student**
8. **Exit**

---


