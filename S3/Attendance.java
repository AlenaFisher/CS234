/*Lance Stott*/
class Attendance {
    private String date;
    private double hoursWorked;

    public Attendance(String dateString, double hoursWorked) {
        this.date = dateString;
        this.hoursWorked = hoursWorked;
    }

    public String getDate() {
        return date;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}