/*Lance Stott*/
import java.util.*;

public class Member {
    private String memberID;
    private String name;
    private String address;
    private String email;
    private String phone;
    private List<String> healthRecords;
    private List<String> emergencyContacts;
    private String waiverForm;
    private boolean isMember;
    private Date membershipExpiryDate;

    public Member(String name, String address, String email, String phone, String memberID) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.memberID = memberID;
        this.healthRecords = new ArrayList<>();
        this.emergencyContacts = new ArrayList<>();
        this.isMember = false;
        this.membershipExpiryDate = null;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public List<String> getHealthRecords() {
        return healthRecords;
    }

    public List<String> getEmergencyContacts() {
        return emergencyContacts;
    }

    public String getWaiverForm() {
        return waiverForm;
    }

    public void setWaiverForm(String waiverForm) {
        this.waiverForm = waiverForm;
    }

    public boolean isMember() {
        return isMember;
    }

    public Date getMembershipExpiryDate() {
        return membershipExpiryDate;
    }

    public void enroll(List<String> healthRecords, List<String> emergencyContacts, String waiverForm) {
        this.healthRecords.addAll(healthRecords);
        this.emergencyContacts.addAll(emergencyContacts);
        this.waiverForm = waiverForm;
        this.isMember = true;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        this.membershipExpiryDate = calendar.getTime();
        System.out.println("New member enrolled successfully.");
    }

    public void renewMembership() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        this.membershipExpiryDate = calendar.getTime();
        System.out.println("Membership renewed successfully. New expiry date: " + membershipExpiryDate);
    }

    public void trackMembershipStatus() {
        if (isMember) {
            Date currentDate = new Date();
            if (membershipExpiryDate != null && currentDate.after(membershipExpiryDate)) {
                System.out.println("Membership expired. Please renew.");
            } else {
                System.out.println("Membership is active. Expiry date: " + membershipExpiryDate);
            }
        } else {
            System.out.println("Not a member.");
        }
    }

    public void updatePersonalDetails(String name, String address, String email, String phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        System.out.println("Personal details updated successfully.");
    }

    public void addHealthRecord(String healthRecord) {
        healthRecords.add(healthRecord);
        System.out.println("Health record added successfully.");
    }

    public void addEmergencyContact(String emergencyContact) {
        emergencyContacts.add(emergencyContact);
        System.out.println("Emergency contact added successfully.");
    }
}