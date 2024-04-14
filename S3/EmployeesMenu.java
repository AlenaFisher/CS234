/*Lance Stott*/
import java.util.Scanner;

public class EmployeesMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the sport's club employee management system");

        Employees_info[] employees = new Employees_info[5]; 
        int employeeCount = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Record Attendance");
            System.out.println("3. View Attendance Records");
            System.out.println("4. Calculate Total Hours Worked");
            System.out.println("5. View Employee Information");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addEmployee(scanner, employees, employeeCount);
                    employeeCount++;
                    break;
                case 2:
                    recordAttendance(scanner, employees, employeeCount);
                    break;
                case 3:
                    viewAttendanceRecords(scanner, employees, employeeCount);
                    break;
                case 4:
                    calculateTotalHoursWorked(scanner, employees, employeeCount);
                    break;
                case 5:
                    viewEmployeeInfo(scanner, employees, employeeCount);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    private static void addEmployee(Scanner scanner, Employees_info[] employees, int employeeCount) {
        if (employeeCount < employees.length) {
            System.out.println("\nAdding Employee Profile:");
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee role: ");
            String role = scanner.nextLine();
            System.out.print("Enter employee email: ");
            String email = scanner.nextLine();
            System.out.print("Enter employee phone number: ");
            String phone = scanner.nextLine();
            System.out.print("Enter employee chat ID: ");
            String chat = scanner.nextLine();
            System.out.print("Enter productivity: ");
            double productivity = scanner.nextDouble();
            System.out.print("Enter efficiency: ");
            double efficiency = scanner.nextDouble();
            System.out.print("Enter quality: ");
            double quality = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            employees[employeeCount] = new Employees_info(name, role, email, phone, chat, productivity, efficiency, quality);
            System.out.println("Profile added successfully.");
        } else {
            System.out.println("Maximum number of profiles reached.");
        }
    }

    private static void recordAttendance(Scanner scanner, Employees_info[] employees, int employeeCount) {
        if (employeeCount == 0) {
            System.out.println("No employee profiles available.");
            return;
        }
        System.out.println("\nRecord Attendance:");
        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Employees_info employee = findEmployeeByID(employees, employeeCount, employeeID);
        if (employee != null) {
            System.out.print("Enter date (dd-MM-yyyy): ");
            String dateString = scanner.nextLine();
            System.out.print("Enter hours worked: ");
            double hoursWorked = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            employee.recordAttendance(dateString, hoursWorked);
            System.out.println("Attendance recorded successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void viewAttendanceRecords(Scanner scanner, Employees_info[] employees, int employeeCount) {
        if (employeeCount == 0) {
            System.out.println("No employee profiles available.");
            return;
        }
        System.out.println("\nView Attendance Records:");
        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); 

        Employees_info employee = findEmployeeByID(employees, employeeCount, employeeID);
        if (employee != null) {
            employee.displayAttendanceRecords();
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void calculateTotalHoursWorked(Scanner scanner, Employees_info[] employees, int employeeCount) {
        if (employeeCount == 0) {
            System.out.println("No employee profiles available.");
            return;
        }
        System.out.println("\nCalculate Total Hours Worked:");
        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); 

        Employees_info employee = findEmployeeByID(employees, employeeCount, employeeID);
        if (employee != null) {
            double totalHours = employee.calculateTotalHoursWorked();
            System.out.println("Total hours worked by " + employee.getEmployeeName() + ": " + totalHours);
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void viewEmployeeInfo(Scanner scanner, Employees_info[] employees, int employeeCount) {
        if (employeeCount == 0) {
            System.out.println("No employee profiles available.");
            return;
        }
        System.out.println("\nView Employee Information:");
        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); 
        Employees_info employee = findEmployeeByID(employees, employeeCount, employeeID);
        if (employee != null) {
            System.out.println("Employee ID: " + employee.getID());
            System.out.println("Name: " + employee.getEmployeeName());
            System.out.println("Role: " + employee.getRole());
            System.out.println("Contact Info: " + employee.displayContactInfo());
            System.out.println("Productivity: " + employee.getPerformanceMetric());
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static Employees_info findEmployeeByID(Employees_info[] employees, int employeeCount, int ID) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getID() == ID) {
                return employees[i];
            }
        }
        return null;
    }
}