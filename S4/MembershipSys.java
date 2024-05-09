/*lance stott*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class MembershipSys implements Serializable {
    private MembershipManager membershipManager;
    private int memberCounter;

    public MembershipSys() {
        membershipManager = new MembershipManager();
        memberCounter = 1;
    }

    public void saveMembershipManagerToFile(String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(membershipManager);
            System.out.println("Membership manager data saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving membership manager data: " + e.getMessage());
        }
    }

    public void loadMembershipManagerFromFile(String filename) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            membershipManager = (MembershipManager) inputStream.readObject();
            System.out.println("Membership manager data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error loading membership manager data: " + e.getMessage());
        }
    }

    public void createMember(String name, String address, String email, String phone, String memberID, List<String> healthRecordsList, List<String> emergencyContactsList) {
        membershipManager.createMember(name, address, email, phone, memberID, healthRecordsList, emergencyContactsList);
    }

    public boolean deleteMember(String memberID) {
        return membershipManager.deleteMember(memberID);
    }

    public boolean enrollMember(String memberID, List<String> healthRecords, List<String> emergencyContacts, String waiverForm) {
        return membershipManager.enrollMember(memberID, healthRecords, emergencyContacts, waiverForm);
    }

    public boolean renewMembership(String memberID) {
        return membershipManager.renewMembership(memberID);
    }

    public void trackMembershipStatus(String memberID) {
        membershipManager.trackMembershipStatus(memberID);
    }

    public boolean updatePersonalDetails(String memberID, String name, String address, String email, String phone) {
        return membershipManager.updatePersonalDetails(memberID, name, address, email, phone);
    }

    public boolean addHealthRecord(String memberID, String healthRecord) {
        return membershipManager.addHealthRecord(memberID, healthRecord);
    }

    public boolean addEmergencyContact(String memberID, String emergencyContact) {
        return membershipManager.addEmergencyContact(memberID, emergencyContact);
    }

    public MembershipManager getMembershipManager() {
        return membershipManager;
    }

    public int getMemberCounterAndIncrement() {
        return memberCounter++;
    }

    public Member getMember(String memberID) {
        return membershipManager.findMember(memberID);
    }

    public List<Member> searchMembers(String searchTerm) {
        return membershipManager.searchMembers(searchTerm);
    }
}