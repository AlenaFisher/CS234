/*Lance Stott*/
import java.util.List;

public class MembershipSys {
    private MembershipManager membershipManager;
    private int memberCounter; 

    public MembershipSys() {
        membershipManager = new MembershipManager();
        memberCounter = 1; 
    }

    public void createMember(String name, String address, String email, String phone, String memberID) {
        membershipManager.createMember(name, address, email, phone, memberID);
    }

    public void deleteMember(String memberID) {
        membershipManager.deleteMember(memberID);
    }

    public void enrollMember(String memberID, List<String> healthRecords, List<String> emergencyContacts, String waiverForm) {
        membershipManager.enrollMember(memberID, healthRecords, emergencyContacts, waiverForm);
    }

    public void renewMembership(String memberID) {
        membershipManager.renewMembership(memberID);
    }

    public void trackMembershipStatus(String memberID) {
        membershipManager.trackMembershipStatus(memberID);
    }

    public void updatePersonalDetails(String memberID, String name, String address, String email, String phone) {
        membershipManager.updatePersonalDetails(memberID, name, address, email, phone);
    }

    public void addHealthRecord(String memberID, String healthRecord) {
        membershipManager.addHealthRecord(memberID, healthRecord);
    }

    public void addEmergencyContact(String memberID, String emergencyContact) {
        membershipManager.addEmergencyContact(memberID, emergencyContact);
    }

    public MembershipManager getMembershipManager() {
        return membershipManager;
    }

    public Member getMember(String memberID) {
        return membershipManager.findMember(memberID);
    }
}