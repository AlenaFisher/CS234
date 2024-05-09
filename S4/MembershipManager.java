/*lance stott*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MembershipManager implements Serializable {
    private List<Member> members;

    public MembershipManager() {
        members = new ArrayList<>();
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public void createMember(String name, String address, String email, String phone, String memberID, List<String> healthRecords, List<String> emergencyContacts) {
        Member member = new Member(name, address, email, phone, memberID, healthRecords, emergencyContacts);
        members.add(member);
        System.out.println("New member profile created with ID: " + memberID);
    }

    public boolean deleteMember(String memberID) {
        Member member = findMember(memberID);
        if (member != null) {
            members.remove(member);
            System.out.println("Member profile deleted.");
            return true;
        } else {
            System.out.println("Member not found.");
            return false;
        }
    }

    public boolean enrollMember(String memberID, List<String> healthRecords, List<String> emergencyContacts, String waiverForm) {
        Member member = findMember(memberID);
        if (member != null) {
            member.enroll(healthRecords, emergencyContacts, waiverForm);
            return true;
        } else {
            System.out.println("Member not found.");
            return false;
        }
    }

    public boolean renewMembership(String memberID) {
        Member member = findMember(memberID);
        if (member != null) {
            member.renewMembership();
            return true;
        } else {
            System.out.println("Member not found.");
            return false;
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

    public boolean updatePersonalDetails(String memberID, String name, String address, String email, String phone) {
        Member member = findMember(memberID);
        if (member != null) {
            member.updatePersonalDetails(name, address, email, phone);
            return true;
        } else {
            System.out.println("Member not found.");
            return false;
        }
    }

    public boolean addHealthRecord(String memberID, String healthRecord) {
        Member member = findMember(memberID);
        if (member != null) {
            member.addHealthRecord(healthRecord);
            return true;
        } else {
            System.out.println("Member not found.");
            return false;
        }
    }

    public boolean addEmergencyContact(String memberID, String emergencyContact) {
        Member member = findMember(memberID);
        if (member != null) {
            member.addEmergencyContact(emergencyContact);
            return true;
        } else {
            System.out.println("Member not found.");
            return false;
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

    public List<Member> getMembers() {
        return members;
    }

    public List<Member> searchMembers(String searchTerm) {
        List<Member> searchResults = new ArrayList<>();
        for (Member member : members) {
            if (member.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchResults.add(member);
            }
        }
        return searchResults;
    }
}