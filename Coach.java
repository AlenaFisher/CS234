/**
 * @author  Alena Fisher
 */
import java.util.ArrayList;

public class Coach {
    // Creating instance variables
    private String name;
    private String title;
    private String department;
    private String officeLocation;
    private String phoneNumber;
    private String email;

    public Coach(String name, String title, String department, String officeLocation, String phoneNumber, String email) {
        /**
         * This method receives 'name', 'title', 'department', 'officeLocation', 'phoneNumber', and 'email' as explicit parameters and assigns them to the instance variables
         */
        this.name = name;
        this.title = title;
        this.department = department;
        this.officeLocation = officeLocation;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getCoachName() {
        /**
         * This method returns the coach's name
         */
        return name;
    }

    public String getOfficeLocation() {
        /**
         * This method returns the coach's office location
         */
        return officeLocation;
    }

    public String getTitle() {
        /**
         * This method returns the coach's title
         */
        return title;
    }

    public String getDepartment() {
        /**
         * This method returns the coach's department
         */
        return department;
    }

    public String getPhoneNumber() {
        /**
         * This method returns the coach's phone number
         */
        return phoneNumber;
    }

    public String getEmail() {
        /**
         * This method returns the coach's email address
         */
        return email;
    }

    public void setCoachName(String name) {
        /**
         * This method receives 'name' as an explicit parameter and assigns it to the instance variable
         */
        this.name = name;
    }

    public void setOfficeLocation(String officeLocation) {
        /**
         * This method receives 'officeLocation' as an explicit parameter and assigns it to the instance variable
         */
        this.officeLocation = officeLocation;
    }

    public void setTitle(String title) {
        /**
         * This method receives 'title' as an explicit parameter and assigns it to the instance variable
         */
        this.title = title;
    }

    public void setDepartment(String department) {
        /**
         * This method receives 'department' as an explicit parameter and assigns it to the instance variable
         */
        this.department = department;
    }

    public void setPhoneNumber(String phoneNumber) {
        /**
         * This method receives 'phoneNumber' as an explicit parameter and assigns it to the instance variable
         */
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        /**
         * This method receives 'email' as an explicit parameter and assigns it to the instance variable
         */
        this.email = email;
    }
}