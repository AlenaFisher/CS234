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

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public double getProductivity() {
        return productivity;
    }

    public void setProductivity(double productivity) {
        this.productivity = productivity;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
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
