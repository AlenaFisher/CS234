/**
 * @author  Alena Fisher
 * 5/7/2024
 */
public class Appointment {
    // Creating instance variables
    private String name;
    private String date;
    private String time;
    private String memberID;
    private String appointmentType;
    private String location;

    public Appointment(String name, String date, String time, String memberID, String appointmentType, String location) {
        /**
         * This method receives 'name', 'date', 'time', 'memberID', 'appointmentType', and 'location' as explicit parameters and assigns them to the instance variables
         */
        this.name = name;
        this.date = date;
        this.time = time;
        this.memberID = memberID;
        this.appointmentType = appointmentType;
        this.location = location;
    }

    public String getName() {
        /**
         * This method returns the name
         */
        return name;
    }

    public String getAppDate() {
        /**
         * This method returns the appointment date
         */
        return date;
    }

    public String getAppTime() {
        /**
         * This method returns the appointment time
         */
        return time;
    }

    public String getMemberID() {
        /**
         * This method returns the member ID
         */
        return memberID;
    }

    public String getAppointmentType() {
        /**
         * This method returns the appointment type
         */
        return appointmentType;
    }

    public String getLocation() {
        /**
         * This method returns the location
         */
        return location;
    }

    public void setName(String name) {
        /**
         * This method receives 'name' as an explicit parameter and assigns it to the instance variables
         */
        this.name = name;
    }

    public void setAppDate(String date) {
        /**
         * This method receives 'date' as an explicit parameter and assigns it to the instance variables
         */
        this.date = date;
    }

    public void setAppTime(String time) {
        /**
         * This method receives 'time' as an explicit parameter and assigns it to the instance variables
         */
        this.time = time;
    }
    public void setMemberID(String memberID) {
        /**
         * This method receives 'memberID' as an explicit parameter and assigns it to the instance variables
         */
        this.memberID = memberID;
    }

    public void setAppointmentType(String appointmentType) {
        /**
         * This method receives 'appointmentType' as an explicit parameter and assigns it to the instance variables
         */
        this.appointmentType = appointmentType;
    }

    public void setLocation(String location) {
        /**
         * This method receives 'location' as an explicit parameter and assigns it to the instance variables
         */
        this.location = location;
    }

}
