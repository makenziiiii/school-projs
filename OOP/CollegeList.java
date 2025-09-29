import java.util.*;

class Person {
    private String name; // instance variables
    private String contactNum;

    public void setName(String n) {
        name = n;   //place holders ung n
    }

    public String getName() {
        return name;
    }

    public void setContactNum(String c) {
        contactNum = c;
    }

    public String getContactNum() {
        return contactNum;
    }

}

class Employee extends Person {

    private double salary;
    private String department;

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String d) {
        department = d;
    }

    public String getDepartment() {
        return department;
    }
}

class Student extends Person {

    private String program;
    private int yearLevel;

    public void setProgram(String p) {
        program = p;
    }

    public String getProgram() {
        return program;
    }

    public void setYearLevel(int y) {
        yearLevel = y;
    }

    public int getYearLevel() {
        return yearLevel;
    }

}

class Faculty extends Employee {

    private boolean status;

    public void setStatus(boolean s) {
        status = s;
    }

    public boolean isRegular() {
        return status;
    }
}

public class CollegeList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press E for Employee, F for Faculty, or  S for Student:");
        char choice = sc.next().charAt(0);

        if (choice == 'E' || choice == 'F') {
            Employee emp = new Employee();

            System.out.print("Enter name: ");
            emp.setName(sc.next());

            System.out.print("Enter contact number: ");
            emp.setContactNum(sc.next());

            System.out.print("Enter salary: ");
            emp.setSalary(sc.nextDouble());

            System.out.print("Enter department: ");
            emp.setDepartment(sc.next());

            System.out.println("\nEmployee Information:");
            System.out.println("Name: " + emp.getName());
            System.out.println("Contact: " + emp.getContactNum());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Department: " + emp.getDepartment());
            
        } else if (choice == 'F' || choice == 'f') {
            Faculty fac = new Faculty();

            System.out.print("Enter name: ");
            fac.setName(sc.next());

            System.out.print("Enter contact number: ");
            fac.setContactNum(sc.next());

            System.out.print("Enter salary: ");
            fac.setSalary(sc.nextDouble());

            System.out.print("Enter department: ");
            fac.setDepartment(sc.next());

            System.out.print("Is regular/tenured? (Y/N): ");
            char ans = sc.next().charAt(0);
            fac.setStatus(ans == 'Y' || ans == 'y');

            System.out.println("\nFaculty Information:");
            System.out.println("Name: " + fac.getName());
            System.out.println("Contact: " + fac.getContactNum());
            System.out.println("Salary: " + fac.getSalary());
            System.out.println("Department: " + fac.getDepartment());
            System.out.println("Regular: " + fac.isRegular());
        } else if (choice == 'S' || choice == 's') {
            Student stu = new Student();

            System.out.print("Enter name: ");
            stu.setName(sc.next());

            System.out.print("Enter contact number: ");
            stu.setContactNum(sc.next());

            System.out.print("Enter program: ");
            stu.setProgram(sc.next());

            System.out.print("Enter year level (1-4): ");
            stu.setYearLevel(sc.nextInt());

            System.out.println("\nStudent Information:");
            System.out.println("Name: " + stu.getName());
            System.out.println("Contact: " + stu.getContactNum());
            System.out.println("Program: " + stu.getProgram());
            System.out.println("Year Level: " + stu.getYearLevel());
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
