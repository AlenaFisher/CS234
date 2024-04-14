/*Lance Stott*/
import java.util.*;

public class MembershipManager {
    private List<Member> members;

    public MembershipManager() {
        members = new ArrayList<>();
    }

    public void createMember(String name, String address, String email, String phone, String memberID) {
        Member member = new Member(name, address, email, phone, memberID);
        members.add(member);
        System.out.println("New member profile created with ID: " + memberID);
    }

    public void deleteMember(String memberID) {
        members.removeIf(member -> member.getMemberID().equals(memberID));
        System.out.println("Member profile deleted.");
    }

    public void enrollMember(String memberID, List<String> healthRecords, List<String> emergencyContacts, String waiverForm) {
        Member member = findMember(memberID);
        if (member != null) {
            member.enroll(healthRecords, emergencyContacts, waiverForm);
        } else {
            System.out.println("Member not found.");
        }
    }

    public void renewMembership(String memberID) {
        Member member = findMember(memberID);
        if (member != null) {
            member.renewMembership();
        } else {
            System.out.println("Member not found.");
        }
    }

    public void trackMembershipStatus(String memberID) {
        Member member = findMember(memberID);
        if (member != null) {
            member.trackMembershipStatus();
        } else {
            System.out.println("Member not found.");
        }
    }

    public void updatePersonalDetails(String memberID, String name, String address, String email, String phone) {
        Member member = findMember(memberID);
        if (member != null) {
            member.updatePersonalDetails(name, address, email, phone);
        } else {
            System.out.println("Member not found.");
        }
    }

    public void addHealthRecord(String memberID, String healthRecord) {
        Member member = findMember(memberID);
        if (member != null) {
            member.addHealthRecord(healthRecord);
        } else {
            System.out.println("Member not found.");
        }
    }

    public void addEmergencyContact(String memberID, String emergencyContact) {
        Member member = findMember(memberID);
        if (member != null) {
            member.addEmergencyContact(emergencyContact);
        } else {
            System.out.println("Member not found.");
        }
    }

    public Member findMember(String memberID) {
        for (Member member : members) {
            if (member.getMemberID().equals(memberID)) {
                return member;
            }
        }
        return null;
    }
}