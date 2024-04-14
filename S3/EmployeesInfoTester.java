/*Lance Stott*/
import java.util.Date;

public class EmployeesInfoTester {
    public static void main(String[] args) {

        Employees_info employee = new Employees_info("Mike", "Manager", "Mike@example.com", "(111)222-3333", "Mike_chat", 85, 90, 95);


        System.out.println("Employee Information Tester:");


        System.out.println("\nView Profile:");
        viewProfile(employee);


        System.out.println("\nRecord Attendance:");
        recordAttendance(employee, new Date(), 8.0);


        System.out.println("\nView Attendance Records:");
        viewAttendanceRecords(employee);


        System.out.println("\nCalculate Total Hours Worked:");
        calculateTotalHoursWorked(employee);


        System.out.println("\nCalculate Productivity:");
        calculateProductivity(employee);


        System.out.println("\nView Updated Profile:");
        viewProfile(employee);
    }


    private static void recordAttendance(Employees_info employee, Date date, double hoursWorked) {
		// filler for the tester
		
	}


	private static void viewProfile(Employees_info employee) {
        System.out.println("ID: " + employee.getID() +
                ", Name: " + employee.getEmployeeName() +
                ", Role: " + employee.getRole() +
                ", Contact Info: " + employee.displayContactInfo() +
                ", Productivity: " + employee.getPerformanceMetric());
    }


    private static void viewAttendanceRecords(Employees_info employee) {
        employee.displayAttendanceRecords(); // shows no attendance, menu will demonstrate
    }


    private static void calculateTotalHoursWorked(Employees_info employee) {
        double totalHours = employee.calculateTotalHoursWorked();
        System.out.println("Total hours worked by " + employee.getEmployeeName() + ": " + totalHours);
    }


    private static void calculateProductivity(Employees_info employee) {
        double productivity = employee.getPerformanceMetric();
        System.out.println("Productivity of " + employee.getEmployeeName() + ": " + productivity);
    }
}