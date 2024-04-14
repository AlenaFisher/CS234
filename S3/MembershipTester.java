/*Lance Stott*/
import java.util.Arrays;

public class MembershipTester {
    public static void main(String[] args) {

        MembershipSys membershipSys = new MembershipSys();


        membershipSys.createMember("example", "example", "example@example.com", "example", "M001");


        membershipSys.enrollMember("M001", Arrays.asList("example"), Arrays.asList("Emergency Contact: example"), "Waiver Form: Signed");


        displayMemberInfo(membershipSys, "M001");
    }

    private static void displayMemberInfo(MembershipSys membershipSys, String memberID) {
        System.out.println("Member Information:");
        System.out.println("Member ID: " + memberID);
        Member member = membershipSys.getMembershipManager().findMember(memberID);
        if (member != null) {
            System.out.println("Name: " + member.getName());
            System.out.println("Address: " + member.getAddress());
            System.out.println("Email: " + member.getEmail());
            System.out.println("Phone: " + member.getPhone());
            System.out.println("Health Records: " + member.getHealthRecords());
            System.out.println("Emergency Contacts: " + member.getEmergencyContacts());
            System.out.println("Waiver Form: " + member.getWaiverForm());
            System.out.println("Membership Expiry Date: " + member.getMembershipExpiryDate());
        } else {
            System.out.println("Member not found.");
        }
    }
}