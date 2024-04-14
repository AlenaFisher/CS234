/*Lance Stott*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MembershipMenu {
    private static int memberCounter = 1;

    public static void main(String[] args) {
        MembershipSys membershipSys = new MembershipSys();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-Welcome to the Membership System Menu-");
            System.out.println("1. Create New Member");
            System.out.println("2. Access Member Information");
            System.out.println("3. Update Member Details");
            System.out.println("4. Renew Membership");
            System.out.println("5. Delete Member");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createNewMember(membershipSys, scanner);
                    break;
                case 2:
                    accessMemberInformation(membershipSys, scanner);
                    break;
                case 3:
                    updateMemberDetails(membershipSys, scanner);
                    break;
                case 4:
                    renewMembership(membershipSys, scanner);
                    break;
                case 5:
                    deleteMember(membershipSys, scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }
    }

    private static void createNewMember(MembershipSys membershipSys, Scanner scanner) {
        System.out.println("\nCreate New Member:");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Health Records (separated by commas): ");
        List<String> healthRecords = new ArrayList<>(Arrays.asList(scanner.nextLine().split(",")));
        System.out.print("Enter Emergency Contacts (separated by commas): ");
        List<String> emergencyContacts = new ArrayList<>(Arrays.asList(scanner.nextLine().split(",")));
        System.out.print("Enter Waiver Form: ");
        String waiverForm = scanner.nextLine();

        String memberID = "M" + String.format("%03d", memberCounter); 
        memberCounter++; 

        membershipSys.createMember(name, address, email, phone, memberID);
        membershipSys.enrollMember(memberID, healthRecords, emergencyContacts, waiverForm);
        System.out.println("New member created successfully with ID: " + memberID); 
    }

    private static void accessMemberInformation(MembershipSys membershipSys, Scanner scanner) {
        System.out.println("\nAccess Member Information:");
        System.out.print("Enter Member ID: ");
        String memberID = scanner.nextLine();

        Member member = membershipSys.getMember(memberID);
        if (member != null) {
            System.out.println("Member Information:");
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

    private static void updateMemberDetails(MembershipSys membershipSys, Scanner scanner) {
        System.out.println("\nUpdate Member Details:");
        System.out.print("Enter Member ID: ");
        String memberID = scanner.nextLine();

        Member member = membershipSys.getMember(memberID);
        if (member != null) {
            System.out.print("Enter New Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter New Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter New Email: ");
            String email = scanner.nextLine();
            System.out.print("Enter New Phone: ");
            String phone = scanner.nextLine();

            membershipSys.updatePersonalDetails(memberID, name, address, email, phone);
            System.out.println("Member details updated successfully.");
        } else {
            System.out.println("Member not found.");
        }
    }

    private static void renewMembership(MembershipSys membershipSys, Scanner scanner) {
        System.out.println("\nRenew Membership:");
        System.out.print("Enter Member ID: ");
        String memberID = scanner.nextLine();

        membershipSys.renewMembership(memberID);
    }

    private static void deleteMember(MembershipSys membershipSys, Scanner scanner) {
        System.out.println("\nDelete Member:");
        System.out.print("Enter Member ID: ");
        String memberID = scanner.nextLine();

        membershipSys.deleteMember(memberID);
    }
}