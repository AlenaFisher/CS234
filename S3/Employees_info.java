/*Lance Stott*/
import java.util.ArrayList;
import java.util.List;

public class Employees_info {
    private static int nextID = 1;

    private int ID;
    private String employeeName;
    private String role;
    private String email;
    private String phone;
    private String chat;
    private double productivity;
    private double efficiency;
    private double quality;
    private List<Attendance> attendanceRecords;

    public Employees_info(String employeeName, String role, String email, String phone, String chat, double productivity, double efficiency, double quality) {
        this.ID = nextID++;
        this.employeeName = employeeName;
        this.role = role;
        this.email = email;
        this.phone = phone;
        this.chat = chat;
        this.productivity = productivity;
        this.efficiency = efficiency;
        this.quality = quality;
        this.attendanceRecords = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getRole() {
        return role;
    }

    public String displayContactInfo() {
        return "Email: " + email + ", Phone: " + phone + ", Chat: " + chat;
    }

    public double getPerformanceMetric() {
        return (productivity + efficiency + quality) / 3.0;
    }

    public void recordAttendance(String dateString, double hoursWorked) {
        Attendance attendance = new Attendance(dateString, hoursWorked);
        attendanceRecords.add(attendance);
    }

    public void displayAttendanceRecords() {
        if (attendanceRecords.isEmpty()) {
            System.out.println("No attendance records available.");
        } else {
            for (Attendance attendance : attendanceRecords) {
                System.out.println("Date: " + attendance.getDate() + ", Hours Worked: " + attendance.getHoursWorked());
            }
        }
    }

    public double calculateTotalHoursWorked() {
        double totalHours = 0;
        for (Attendance attendance : attendanceRecords) {
            totalHours += attendance.getHoursWorked();
        }
        return totalHours;
    }
}
