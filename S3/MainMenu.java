/**
 * CS234 Stage III
 * 
 */
import java.util.*;

public class MainMenu {
    // Declaring static variables
    static String appointmentType;
    static Teams baseballTeams = new Teams();
    static Teams basketballTeams = new Teams();
    static int choice;
    static GameSchedule courtSchedule = new GameSchedule();
    static String date;
    static String department;
    static CoachDirectory directory = new CoachDirectory();
    static String email;
    static int employeeCount = 0;
    static Employees_info[] employees = new Employees_info[5];
    static String equipmentType;
    static boolean exit = false;
    static GameSchedule fieldSchedule = new GameSchedule();
    static boolean found; 
    static String gameDate;
    static String gameTime;
    static String gametype; 
    static Teams Hockeyteams = new Teams(); 
    static Scanner in = new Scanner(System.in);
    static Inventory inventory = new Inventory();
    static LinkedList<Item> items = new LinkedList<>();
    static String location;
    static int memberCounter = 1;
    static String memberID;
    static MembershipSys membershipSys = new MembershipSys();
    static String name;
    static String newAppType;
    static String newDate;
    static String newEquipmentType;
    static String newLocation;
    static String newName;
    static int newQuantity;
    static String newTime;
    static String officeLocation;
    static String phoneNumber;
    static int quantity;
    static GameSchedule rinkSchedule = new GameSchedule();
    static SalesManager salesManager = new SalesManager(); 
    static Scanner scanner = new Scanner(System.in);
    static Schedule schedule = new Schedule();
    static Teams softballTeams = new Teams();
    static Club SportsClub = new Club();
    static String team1;
    static String team2;
    static String time;
    static String title;
    static Teams volleyballTeams = new Teams();

    private static void addEmployee(Scanner scanner, Employees_info[] employees, int employeeCount) {
        if (employeeCount < employees.length) {
            System.out.println("\nAdding Employee Profile:");
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee role: ");
            String role = scanner.nextLine();
            System.out.print("Enter employee email: ");
            String email = scanner.nextLine();
            System.out.print("Enter employee phone number: ");
            String phone = scanner.nextLine();
            System.out.print("Enter employee chat ID: ");
            String chat = scanner.nextLine();
            System.out.print("Enter productivity: ");
            double productivity = scanner.nextDouble();
            System.out.print("Enter efficiency: ");
            double efficiency = scanner.nextDouble();
            System.out.print("Enter quality: ");
            double quality = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            employees[employeeCount] = new Employees_info(name, role, email, phone, chat, productivity, efficiency, quality);
            System.out.println("Profile added successfully.");
        } else {
            System.out.println("Maximum number of profiles reached.");
        }
    }

    private static void recordAttendance(Scanner scanner, Employees_info[] employees, int employeeCount) {
        if (employeeCount == 0) {
            System.out.println("No employee profiles available.");
            return;
        }
        System.out.println("\nRecord Attendance:");
        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Employees_info employee = findEmployeeByID(employees, employeeCount, employeeID);
        if (employee != null) {
            System.out.print("Enter date (dd-MM-yyyy): ");
            String dateString = scanner.nextLine();
            System.out.print("Enter hours worked: ");
            double hoursWorked = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            employee.recordAttendance(dateString, hoursWorked);
            System.out.println("Attendance recorded successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }


    private static void viewAttendanceRecords(Scanner scanner, Employees_info[] employees, int employeeCount) {
        if (employeeCount == 0) {
            System.out.println("No employee profiles available.");
            return;
        }
        System.out.println("\nView Attendance Records:");
        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); 

        Employees_info employee = findEmployeeByID(employees, employeeCount, employeeID);
        if (employee != null) {
            employee.displayAttendanceRecords();
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void calculateTotalHoursWorked(Scanner scanner, Employees_info[] employees, int employeeCount) {
        if (employeeCount == 0) {
            System.out.println("No employee profiles available.");
            return;
        }
        System.out.println("\nCalculate Total Hours Worked:");
        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); 

        Employees_info employee = findEmployeeByID(employees, employeeCount, employeeID);
        if (employee != null) {
            double totalHours = employee.calculateTotalHoursWorked();
            System.out.println("Total hours worked by " + employee.getEmployeeName() + ": " + totalHours);
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void viewEmployeeInfo(Scanner scanner, Employees_info[] employees, int employeeCount) {
        if (employeeCount == 0) {
            System.out.println("No employee profiles available.");
            return;
        }
        System.out.println("\nView Employee Information:");
        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); 
        Employees_info employee = findEmployeeByID(employees, employeeCount, employeeID);
        if (employee != null) {
            System.out.println("Employee ID: " + employee.getID());
            System.out.println("Name: " + employee.getEmployeeName());
            System.out.println("Role: " + employee.getRole());
            System.out.println("Contact Info: " + employee.displayContactInfo());
            System.out.println("Productivity: " + employee.getPerformanceMetric());
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static Employees_info findEmployeeByID(Employees_info[] employees, int employeeCount, int ID) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getID() == ID) {
                return employees[i];
            }
        }
        return null;
    }

    public static void employeesMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add Employee");
        System.out.println("2. Record Attendance");
        System.out.println("3. View Attendance Records");
        System.out.println("4. Calculate Total Hours Worked");
        System.out.println("5. View Employee Information");
        System.out.println("6. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                addEmployee(scanner, employees, employeeCount);
                employeeCount++;
                break;
            case 2:
                recordAttendance(scanner, employees, employeeCount);
                break;
            case 3:
                viewAttendanceRecords(scanner, employees, employeeCount);
                break;
            case 4:
                calculateTotalHoursWorked(scanner, employees, employeeCount);
                break;
            case 5:
                viewEmployeeInfo(scanner, employees, employeeCount);
                break;
            case 6:
                Menu();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
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

    public static void membershipMenu() {
        System.out.println("-Welcome to the Membership System Menu-");
        System.out.println("1. Create New Member");
        System.out.println("2. Access Member Information");
        System.out.println("3. Update Member Details");
        System.out.println("4. Renew Membership");
        System.out.println("5. Delete Member");
        System.out.println("6. Back to Main Menu");
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
                Menu();
                return;
            default:
                System.out.println("Invalid choice. Please enter a number from 1 to 6.");
        }
    }

    public static void addAppointment() {
        /**
         * This method gets the memberand appointment information and creates a new appointment that is stored in the system schedule
         */
        System.out.println("Schedule an Appointment");

        System.out.print("\nEnter member ID: ");
        in.nextLine();
        memberID = in.nextLine();

        System.out.print("\nEnter member's name: ");
        name = in.nextLine();

        System.out.print("\nEnter appointment date: ");
        date = in.nextLine();

        System.out.print("\nEnter appointment time: ");
        time = in.nextLine();

        System.out.print("\nEnter appointment type: ");
        appointmentType = in.nextLine();

        System.out.print("\nEnter location: ");
        location = in.nextLine();

        Appointment app = new Appointment(name, date, time, memberID, appointmentType, location);
        schedule.addAppointment(app);
        System.out.println("Appointment created successfully!");
                                
    }

    public static void displayApp() {
        /**
         * This method takes the member ID and if an appointment exists, it prints the appointment information
         */
        System.out.println("Display Appointment Information");
        System.out.print("\nEnter member ID to display appointment: ");
        in.nextLine();
        memberID = in.nextLine();

        schedule.displayAppInfo(memberID);
    }

    public static void updateApp() {
        /**
         * This method takes the member ID and if an appointment exists for that member, it gets the new appointment information, and updates and stores it in the schedule
         */
        System.out.println("Modify an Appointment");
        System.out.print("\nEnter member ID to modify appointment: ");
        in.nextLine();
        memberID = in.nextLine();

        found = schedule.appExists(memberID);

        if(found) {
            System.out.print("\nEnter the new name: ");
            newName = in.nextLine();

            System.out.print("\nEnter the new appointment date: ");
            newDate = in.nextLine();

            System.out.print("\nEnter the new appointment time: ");
            newTime = in.nextLine();

            System.out.print("\nEnter the new appointment type: ");
            newAppType = in.nextLine();

            System.out.print("\nEnter the new location: ");
            newLocation = in.nextLine();

            schedule.updateAppInfo(newName, newDate, newTime, memberID, newAppType, newLocation);
            System.out.println("Appointment information updated!");

        }
    }

    public static void deleteApp() {
        /**
         * This method takes the member ID and if an appointment exists for that member, it is removed from the schedule
         */
        System.out.println("Delete an Appointment");
        System.out.print("\nEnter member ID to delete appointment: ");
        in.nextLine();
        memberID = in.nextLine();

        found = schedule.appExists(memberID);

        if(found) {
            schedule.removeAppointment(memberID);
            System.out.println("Appointment deleted successfuly.");
        }
    }

    public static void schedulingMenu() {
        /**
         * This submenu provides options for the scheduling menu to create, display, update, and remove an appointment
         */
        System.out.println("Schedule Management");
        System.out.println("1. Schedule an Appointment\n2. Display Appointment Information\n3. Modify an Appointment\n4. Delete an Appointment\n5. Back to Main Menu");
        System.out.print("\nEnter your choice: ");
        choice = in.nextInt();

        switch(choice) {
            case 1:
                do {
                    addAppointment();
                } while(memberID.length() < 0);
                break;

            case 2:
                do {
                    displayApp();
                    schedulingMenu();
                } while(memberID.length() < 0);
                break;

            case 3:
                do {
                    updateApp();
                    schedulingMenu();
                } while(memberID.length() < 0);
                break;

            case 4:
                do {
                    deleteApp();
                    schedulingMenu();
                } while(memberID.length() < 0);
                break;

            case 5:
                Menu();
                break;
            
            default:
                System.out.println("That is not a valid choice. Please try again.");
        }

    }

    public static void addCoach() {
        /**
         * This method gathers all necessary information for a coach and adds them to the list of coaches
         */
        System.out.println("Add Coach");

        System.out.print("\nEnter coach name: ");
        in.nextLine();
        name = in.nextLine();

        System.out.print("\nEnter coach title: ");
        title = in.nextLine();

        System.out.print("\nEnter coach's department: ");
        department = in.nextLine();

        System.out.print("\nEnter coach's office location: ");
        officeLocation = in.nextLine();

        System.out.print("\nEnter coach's phone number (no spaces or dashes): ");
        phoneNumber = in.nextLine();

        System.out.print("\nEnter coaches email address: ");
        email = in.nextLine();

        // TEST //
        Coach coach = new Coach(name, title, department, officeLocation, phoneNumber, email);
        directory.addCoach(coach);

        System.out.println("Coach added successfully.");
    }

    public static void searchCoach() {
        /**
         * This method takes the coaches name and searches for it in the system
         * If the coach exists, the coach's information is displayed
         * If the coach does not exist, a message is printed
         */
        System.out.println("Search for a Coach");
        System.out.print("\nEnter coach's name to search: ");
        in.nextLine();
        name = in.nextLine();

        directory.displayCoachInfo(name);
    }

    public static void updateCoach() {
        /**
         * This method takes a name and searches for it in the system
         * If the coach exists, the updated information is gathered and stored
         * If the coach does not exist, a message is printed
         */
        System.out.println("Modify Coach Information");
        System.out.print("\nEnter coach name to modify: ");
        in.nextLine();
        name = in.nextLine();

        found = directory.coachExists(name);

        if(found) {
            System.out.print("\nEnter new title: ");
            title = in.nextLine();

            System.out.print("\nEnter new department: ");
            department = in.nextLine();

            System.out.print("\nEnter new office location: ");
            officeLocation = in.nextLine();

            System.out.print("\nEnter new phone number: ");
            phoneNumber = in.nextLine();

            System.out.print("\nEnter new email address: ");
            email = in.nextLine();

            directory.updateCoachInfo(name, title, department, officeLocation, phoneNumber, email);
            System.out.println("Coach information updated.");
        }

        else {
            System.out.println("Coach " + name + " is not in the system.");
        }
    }

    public static void removeCoach() {
        /**
         * This method takes a name and searches for it in the system
         * If the name is found, it is removed from the system
         * If the name is not found, a message is printed
         */
        System.out.println("Remove a Coach");
        System.out.print("\nEnter coach's name to remove: ");
        in.nextLine();
        name = in.nextLine();

        found = directory.coachExists(name);

        if(found) {
            directory.removeCoach(name);
            System.out.println("Coach removed successfully");
        }

        else {
            System.out.println("Coach " + name + " is not in the system.");
        }
    }

    public static void coachMenu() {
        /**
         * This method provides a submenu to add, remove, display, and update a coach's information
         */
        System.out.println("Coach Management");
        System.out.println("1. Add a Coach\n2. Search for a Coach\n3. Modify Coach Information\n4. Remove Coach\n5. Back to Main Menu");
        System.out.print("\nEnter your choice: ");
        choice = in.nextInt();

        switch(choice) {
            case 1:
                do {
                    addCoach();
                    coachMenu();
                } while(name.length() < 0);
                break;

            case 2:
                do {
                    searchCoach();
                    coachMenu();
                } while(name.length() < 0);
                break;

            case 3:
                do {
                    updateCoach();
                    coachMenu();
                } while(name.length() < 0);
                break;

            case 4:
                do {
                    removeCoach();
                    coachMenu();
                } while(name.length() < 0);
                break;

            case 5:
                Menu();
                break;
            
            default:
                System.out.println("That is not a valid choice. Please try again.");
        }
    }

    public static void addHockeyGame() {
        /**
         * This method gets the information for a hockey game and adds it to the game schedule
         */
        Hockeyteams.displayTeamNames();
        System.out.println("Choose the first team: ");
        in.nextLine();
        team1 = in.nextLine();

        System.out.println("Choose the second team: ");
        team2 = in.nextLine();

        System.out.println("Enter the game date: ");
        gameDate = in.nextLine();

        System.out.println("Enter the game time: ");
        gameTime = in.nextLine();

        System.out.println("Enter the location: ");
        location = in.nextLine();

        Game game = new Game(team1, team2, gameDate, gameTime, location);
        rinkSchedule.addGame(game);
        System.out.println("Game added successfully");
    }

    public static void rinkMenu() {
        /**
         * This method provides a submenu to add a game, display the game schedule, or display team information
         */
        System.out.println("Rink Management");
        System.out.println("1. Schedule a Game\n2. Display Game Schedule\n3. Display Team Information\n4. Back to Main Menu");
        System.out.print("\nEnter your choice: ");
        choice = in.nextInt();

        switch(choice) {
            case 1:
                do {
                    addHockeyGame();
                } while(team1.length() < 0);
                break;
            
            case 2:
                rinkSchedule.displayGameSchedule();
                rinkMenu();
                break;

            case 3:
                Hockeyteams.displayTeamInfo();
                rinkMenu();
                break;
            
            case 4:
                Menu();
                break;

            default:
                System.out.println("That is not a valid option. Please try again.");

        }
    }

    public static void addCourtGame() {
        /**
         * This method allows the user to add either a volleyball or a basketball game to the game schedule
         */
        System.out.println("Enter game type [volleyball or basketball]: ");
        in.nextLine();
        gametype = in.nextLine();

        if(gametype.equalsIgnoreCase("volleyball")) {
            volleyballTeams.displayTeamNames();
            System.out.print("\nChoose the first team: ");
            team1 = in.nextLine();

            System.out.print("\nChoose the second team: ");
            team2 = in.nextLine();

            System.out.print("\nEnter the game date: ");
            gameDate = in.nextLine();

            System.out.print("\nEnter the game time: ");
            gameTime = in.nextLine();

            System.out.print("\nEnter the location: ");
            location = in.nextLine();

            Game game = new Game(team1, team2, gameDate, gameTime, location);
            courtSchedule.addGame(game);
        }
        
        else if(gametype.equalsIgnoreCase("basketball")) {
            basketballTeams.displayTeamNames();
            System.out.print("\nChoose the first team: ");
            team1 = in.nextLine();

            System.out.print("\nChoose the second team: ");
            team2 = in.nextLine();

            System.out.print("\nEnter the game date: ");
            gameDate = in.nextLine();

            System.out.print("\nEnter the game time: ");
            gameTime = in.nextLine();

            System.out.print("\nEnter the location: ");
            location = in.nextLine();

            Game game = new Game(team1, team2, gameDate, gameTime, location);
            courtSchedule.addGame(game);
        }
    }


    public static void courtMenu() {
        /**
         * This method provides a submenu to schedule a game, display the game schedule, or display team information
         */
        System.out.println("Court Management");
        System.out.println("1. Schedule a Game\n2. Display Game Schedule\n3. Display Team Information\n4. Back to Main Menu");
        System.out.print("\nEnter your choice: ");
        choice = in.nextInt();

        switch(choice) {
            case 1:
                do {
                    addCourtGame();
                } while(team1.length() < 0);
                break;
            
            case 2:
                courtSchedule.displayGameSchedule();
                break;

            case 3:
                do {
                    System.out.print("\nEnter gametype [volleyball or basketball]: ");
                    gametype = in.nextLine();

                    if(gametype.equalsIgnoreCase("volleyball")) {
                        volleyballTeams.displayTeamInfo();
                    }

                    else if(gametype.equalsIgnoreCase("basketball")) {
                        basketballTeams.displayTeamInfo();
                    }
                } while(gametype.length() < 0);
                break;

            case 4:
                Menu();
                break;
            
            default:
                System.out.println("That is not a valid input. Please try again.");
        }
    }

    public static void addFieldGame() {
        /**
         * This method allows the user to add either a baseball or softball game to the game schedule
         */
        System.out.println("Enter game type [baseball or softball]: ");
        in.nextLine();
        gametype = in.nextLine();

        if(gametype.equalsIgnoreCase("baseball")) {
            baseballTeams.displayTeamNames();
            System.out.print("\nChoose the first team: ");
            team1 = in.nextLine();

            System.out.print("\nChoose the second team: ");
            team2 = in.nextLine();

            System.out.print("\nEnter the game date: ");
            gameDate = in.nextLine();

            System.out.print("\nEnter the game time: ");
            gameTime = in.nextLine();

            System.out.print("\nEnter the location: ");
            location = in.nextLine();

            Game game = new Game(team1, team2, gameDate, gameTime, location);
            fieldSchedule.addGame(game);
        }
        
        else if(gametype.equalsIgnoreCase("softball")) {
            baseballTeams.displayTeamNames();
            System.out.print("\nChoose the first team: ");
            team1 = in.nextLine();

            System.out.print("\nChoose the second team: ");
            team2 = in.nextLine();

            System.out.print("\nEnter the game date: ");
            gameDate = in.nextLine();

            System.out.print("\nEnter the game time: ");
            gameTime = in.nextLine();

            System.out.print("\nEnter the location: ");
            location = in.nextLine();

            Game game = new Game(team1, team2, gameDate, gameTime, location);
            fieldSchedule.addGame(game);
        }
    }


    public static void fieldMenu() {
        /**
         * This method provides a submenu to schedule a game, display the game schedule, and display team information
         */
        System.out.println("Field Management");
        System.out.println("1. Schedule a Game\n2. Display Game Schedule\n3. Display Team Information\n4. Back to Main Menu");
        System.out.print("\nEnter your choice: ");
        choice = in.nextInt();

        switch(choice) {
            case 1:
                do {
                    addFieldGame();
                } while(team1.length() < 0);
                break;
            
            case 2:
                fieldSchedule.displayGameSchedule();
                break;

            case 3:
                do {
                    System.out.print("\nEnter gametype [baseball or softball]: ");
                    gametype = in.nextLine();

                    if(gametype.equalsIgnoreCase("baseball")) {
                        baseballTeams.displayTeamInfo();
                    }

                    else if(gametype.equalsIgnoreCase("softball")) {
                        softballTeams.displayTeamInfo();
                    }
                } while(gametype.length() < 0);
                break;

            case 4:
                Menu();
                break;
            
            default:
                System.out.println("That is not a valid input. Please try again.");
        }
    }

    public static void addEquipment() {
        /**
         * This method takes an equipmentType and its quantity and adds it to the system
         */

        System.out.println("Add Equipment");
        System.out.print("\nEnter equipment name: ");
        in.nextLine();
        equipmentType = in.nextLine();
        do {
            System.out.print("\nEnter the quantity: ");
            quantity = in.nextInt();

            // Tests if quantity is less then or equal to zero
            if(quantity<= 0) {
                System.out.println("Quantity can't be zero or less than zero.");
            }

            else {
                continue;
            }
        } while(quantity <=0);
        
        Equipment equipment = new Equipment(equipmentType, quantity);
        SportsClub.addEquipment(equipment);
        System.out.println("Equipment added succesfully");
    }

    public static void displayEquipment() {
        /**
         * This method displays the equipment information that is stored in the system
         */
        System.out.println("Display Equipment");
        System.out.print("\nEnter equipment to display: ");

        in.nextLine();
        equipmentType = in.nextLine();

        SportsClub.displayInformation(equipmentType);
    }

    public static void updateEquipment() {
        /**
         * This method takes an equipment name and searches for it in the system
         * If it exists, the updated information is gathered and stored
         * If it does not exists, a message is printed
         */
        System.out.println("Update Equipment");
        System.out.print("\nEnter equipment to update: ");

        in.nextLine();
        equipmentType = in.nextLine();

        found = SportsClub.equipmentExists(equipmentType);
        if(found) {
            SportsClub.displayInformation(equipmentType);

            System.out.print("\nEnter the new equipment type: ");
            newEquipmentType = in.nextLine();

            System.out.print("\nEnter the new quantity: ");
            newQuantity = in.nextInt();

            SportsClub.updateInformation(newEquipmentType, newQuantity);
        }

        else {
            System.out.println("Equipment does not exist");
        }
    }

    public static void deleteEquipment() {
        /**
         * This method takes an equipment name and quantity and searches for it in the system
         * If it exists, the equipment name and quantity is removed from the system
         * If it does not exist, a message is printed
         */
        System.out.println("Delete Equipment");
        System.out.print("\nEnter equipment to delete: ");

        in.nextLine();
        equipmentType = in.nextLine();

        System.out.print("\nEnter the equipment quantity to delete: ");
        quantity = in.nextInt();

        found = SportsClub.equipmentExists(equipmentType);
        if(found) {
            SportsClub.removeEquipment(equipmentType, quantity);

            System.out.println("Equipment removed successfully");
        }

        else {
            System.out.println("Equipment " + equipmentType + " does not exist in the system.");
        }

    }

    
    public static void equipmentMenu() {
        /**
         * This method provides a submenu to add, display, update, and remove equipment in the system
         */
        do {
            System.out.println("\nEquipment Management"); 
            System.out.println("1. Add Equipment\n2. Display Equipment\n3. Update Equipment\n4. Delete Equipment\n5. Back to Main Menu");
            System.out.print("\nEnter your choice: ");
            choice = in.nextInt();

            switch(choice) {
                case 1:
                    do {
                        addEquipment();
                    } while(equipmentType.length() < 0); 
                    break;
                
                case 2:
                    do {
                        displayEquipment();
                        equipmentMenu();
                    } while(equipmentType.length() < 0);
                    break;

                case 3:
                    do {
                        updateEquipment();
                    } while(equipmentType.length() < 0);
                    break;

                case 4:
                    do {
                        deleteEquipment();
                    } while(equipmentType.length() < 0);
                    break;

                case 5:
                    Menu();
                    break;

                // default
            }
        } while(choice > 5 || choice < 0);
    }

    //Method to manage inventory operations
    private static void inventoryManagement(Scanner scanner) {
        int choice;
        //Displaying inventory management options and processing user choice
        do {
            System.out.println("\nInventory Management:");
            System.out.println("1. Add new item");
            System.out.println("2. Remove item");
            System.out.println("3. Display inventory");
            System.out.println("4. Exit to main menu");
            System.out.print("Enter your choice: ");
            //Reading user choice
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //Calling method to add item
                    addItem(scanner);
                    break;
                case 2:
                    //Calling method to remove item
                    removeItem(scanner);
                    break;
                case 3:
                    //Calling method to display inventory
                    displayInventory();
                    break;
                case 4:
                    //Exiting to main menu
                    Menu();
                    break;
                default:
                    //Handling invaild input
                    System.out.println("Invalid choice. Please try again.");
            }
            //Repeating until user chooses to exit to main menu
        } while (choice != 4);
    }


    //Method to add a new item to the inventory
    private static void addItem(Scanner scanner) {
        System.out.print("Enter item name: ");
        //Reading item name
        String name = scanner.next();
        System.out.print("Enter item price: ");
        //Reeading item price
        float price = scanner.nextFloat();
        //Creating a new item object
        Item item = new Item(0, name, price);
        //Adding the item to the inventory
        inventory.addItem(item);
        //Confirming item addition
        System.out.println("Item added successfully.");
    }


    //Method to remove an item from the inventory
    private static void removeItem(Scanner scanner) {
        System.out.print("Enter item ID to remove: ");
        //Reading item ID to remove
        int id = scanner.nextInt();
        //Removing the item if found in the inventory
        if (inventory.removeItem(id)) {
            //Confirming item removal
            System.out.println("Item removed successfully.");
        } else {
            //Displaying message if item not found
            System.out.println("Item not found.");
        }
    }

    //Method to diaplay the inventory
    private static void displayInventory() {
        //Displaying the inventory
        inventory.displayInventory();
    }

    //Method to manage sales operations
    private static void salesManagement(Scanner scanner) {
        int choice;
        //Displaying sales management options and processing user choice
        do {
            System.out.println("\nSales Management:");
            System.out.println("1. Create new sale");
            System.out.println("2. Add item to sale");
            System.out.println("3. Remove item from sale");
            System.out.println("4. Calculate total cost");
            System.out.println("5. Exit to main menu");
            System.out.print("Enter your choice: ");
            //Reading user choice
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //Calling method to create a new sale
                    createSale();
                    break;
                case 2:
                    //Calling method to add item to sale
                    addItemToSale(scanner);
                    break;
                case 3:
                    //Calling method to remove item from sale
                    removeItemFromSale(scanner);
                    break;
                case 4:
                    //Calling method to calculate total cost of sale
                    calculateTotalCost();
                    break;
                case 5:
                    //Exiting to main menu
                    System.out.println("Exiting to main menu...");
                    break;
                default:
                    //Handling invaild input
                    System.out.println("Invalid choice. Please try again.");
            }
        //Repeating until user chooses to exit to main menu
        } while (choice != 5);
    }

    //Method to create a new sale
    private static void createSale() {
        //Creating a new sale object
        Sales sale = new Sales();
        //Adding the sale to the sales manager
        salesManager.addSale(sale);
        //Displaying the created sale ID
        System.out.println("Sale created with ID: " + sale.getSaleID());
    }

    //Method to add an item to a sale
    private static void addItemToSale(Scanner scanner) {
        System.out.print("Enter sale ID: ");
        //Reading sale ID
        int saleID = scanner.nextInt();
        //Finding the sale with the given ID
        Sales sale = salesManager.findSale(saleID);
        if (sale != null) {
            System.out.print("Enter item ID to add: ");
            //Reading item ID to add
            int itemID = scanner.nextInt();
            //Finding the item in the inventory
            Item item = inventory.findItem(itemID);
            if (item != null) {
                //Adding the item to the sale
                sale.addItem(item);
                //Confirming item addition
                System.out.println("Item added to sale.");
            } else {
                //Displaying message if item not found
                System.out.println("Item not found in inventory.");
            }
        } else {
            //Displaying message if sale not found
            System.out.println("Sale not found.");
        }
    }

    //Method to remove an item from a sale
    private static void removeItemFromSale(Scanner scanner) {
        System.out.print("Enter sale ID: ");
        //Reading sale ID
        int saleID = scanner.nextInt();
        //Finding the sale with the given ID
        Sales sale = salesManager.findSale(saleID);
        if (sale != null) {
            System.out.print("Enter item ID to remove: ");
            //Reading item ID to remove
            int itemID = scanner.nextInt();
            //Finding the item in the sale
            Item item = inventory.findItem(itemID);
            if (item != null) {
                //Removing the item from the sale
                sale.removeItem(item);
                //Confirming item removal
                System.out.println("Item removed from sale.");
            } else {
                //Displaying message if item not found 
                System.out.println("Item not found in sale.");
            }
        } else {
            //Displaying message if sale not found
            System.out.println("Sale not found.");
        }
    }

    //Method to calculate total cost of a sale
    private static void calculateTotalCost() {
        //Creating a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sale ID: ");
        //Reading sale ID
        int saleID = scanner.nextInt();
        //Finding the sale with the given ID
        Sales sale = salesManager.findSale(saleID);
        //Displaying total cost before discount
        System.out.println("Total cost before discount: $" + sale.getTotalCost());
        if (sale != null) {
            System.out.print("Enter loyalty points to use as discount: ");
            //Reading loyalty points for discount
            int loyaltyPoints = scanner.nextInt();
            //Calculating discount based on loyalty points
            sale.calculateDiscount(loyaltyPoints);
            //Calculating total cost after discount
            float discountedAmount = sale.getTotalCost() - sale.getDiscount();
            //Displaying total cost after discount
            System.out.println("Total cost after discount: $" + discountedAmount );
        } 
        //Closing the scanner
        scanner.close();
    }

    public static void salesMenu() {
        //Displaying main menu options and processing user choice
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Inventory Management");
            System.out.println("2. Sales Management");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            //Reading user choice
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //Calling inventory management method
                    inventoryManagement(scanner);
                    break;
                case 2:
                    //Calling sales management method
                    salesManagement(scanner);
                    break;
                case 3:
                    //Exiting to main menu
                    Menu();
                    break;
                default:
                    //Handling invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
            //Repeating until user chooses to exit
        } while (choice != 3);
    }

    public static void Menu() {
        while(!exit) {
            System.out.println("Sports Club Management System");
            System.out.println("1. Employee Management\n2. Sales Management\n3. Membership Management\n4. Scheduling Management\n5. Coach Management\n6. Rink Management\n7. Court Management\n8. Field Management\n9. Equipment Management\n10. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch(choice) {
                case 1:
                    do {
                        employeesMenu();
                    } while(choice == 1);
                    break;

                case 2:
                    do {
                        salesMenu();
                    } while(choice == 2);
                    break;
                case 3:
                    do {
                        membershipMenu();
                    } while(choice == 3);
                    break;
                case 4:
                    do {
                        schedulingMenu();
                    } while(choice == 4);
                    break;

                case 5:
                    do {
                        coachMenu();
                    } while(choice == 5);
                    break;

                case 6:
                    do {
                        rinkMenu();
                    } while(choice == 6);
                    break;

                case 7:
                    do {
                        courtMenu();
                    } while(choice == 7);
                    break;

                case 8:
                    do {
                        fieldMenu();
                    } while(choice == 8);
                    break;

                case 9:
                    do {
                        equipmentMenu();
                    } while(choice == 9);
                    break;

                case 10:
                    System.exit(0);
                    break;
            }
        }
    }


    public static void main(String[] args) {
        // Adding hockey teams to the system
        Team carolinaHurricanes = new Team("Carolina Hurricanes", "Rod Brind'Amour", "Raleigh", "North Carolina", "26");
        Hockeyteams.addTeam(carolinaHurricanes);

        Team coloradoAvalanche = new Team("Colorado Avalanche", "Jared Bednar", "Denver", "Colorado", "23");
        Hockeyteams.addTeam(coloradoAvalanche);

        Team nmIceWolves = new Team("New Mexico Ice Wolves", "Phil Fox", "Albuquerque", "New Mexico", "30");
        Hockeyteams.addTeam(nmIceWolves);

        Team minnesotaWild = new Team("Minnesota Wild", "John Hynes", "St. Paul", "Minnesota", "27");
        Hockeyteams.addTeam(minnesotaWild);

        Team seattleKraken = new Team("Seattle Kraken", "Dave Hakstol", "Seattle", "Washington", "22");
        Hockeyteams.addTeam(seattleKraken);

        // Adding basketball teams to the system
        Team milwaukeeBucks = new Team("Milwaukee Bucks", "Doc Rivers", "Milwaukee", "Wisconsin", "17");
        basketballTeams.addTeam(milwaukeeBucks);
        
        Team bostonCeltics = new Team("Boston Celtics", "Joe Mazzulla", "Boston", "Massachusetts", "17");
        basketballTeams.addTeam(bostonCeltics);

        Team minnesotaTimberwolves = new Team("Minnesota Timberwolves", "Chris Finch", "Minneapolis", "Minnesota", "17");
        basketballTeams.addTeam(minnesotaTimberwolves);

        Team dallasMavericks = new Team("Dallas Mavericks", "Jason Kidd", "Dallas", "Texas", "17");
        baseballTeams.addTeam(dallasMavericks);

        // Adding volleyball teams to the system
        Team womensTeam = new Team("Women's National Volleyball Team", "Karch Kiraly", "Colorado Springs", "Colorado", "40");
        volleyballTeams.addTeam(womensTeam);

        Team mensTeams = new Team("Men's National Volleyball Team", "John Speraw", "Colorado Springs", "Colorado", "30");
        volleyballTeams.addTeam(womensTeam);

        // Adding baseball teams to the system
        Team arizonaDiamondbacks = new Team("Arizona Diamondbacks", "Tory Lovullo", "Phoenix", "Arizona", "26");
        baseballTeams.addTeam(arizonaDiamondbacks);

        Team pittsburghPirates = new Team("Pittsburgh Pirates", "Derek Shelton", "Pittsburgh", "Pennsylvania", "26");
        baseballTeams.addTeam(pittsburghPirates);

        Team torontoBlueJays = new Team("Toronto Blue Jays", "John Schneider", "Toronto", "Ontario", "26");
        baseballTeams.addTeam(torontoBlueJays);

        Team newYorkMets = new Team("New York Mets", "Carlos Mendoza", "Flushing", "New York", "26");
        baseballTeams.addTeam(newYorkMets);

        Team minnesotaTwins = new Team("Minnesota Twins", "Rocco Baldello", "Minneapolis", "Minnesota", "27");
        baseballTeams.addTeam(minnesotaTwins);

        // Adding a softball team to the system
        Team womensSoftball = new Team("Women's National Softball Team", "Kyla Holas", "Oklahoma City", "Oklahoma", "16");
        softballTeams.addTeam(womensSoftball);

        // Adding coaches to the system
        Coach cronin = new Coach("Greg Cronin", "Head Coach - Anaheim Ducks", "Athletics", "100", "(714) 672-9834", "Greg.Cronin@nhl.com");
        directory.addCoach(cronin);

        Coach RBA = new Coach("Rod Brind'Amour", "Head Coach - Carolina Hurricanes", "Athetics", "102", "(919) 763-1470", "Rod.BrindAmour@nhl.com");
        directory.addCoach(RBA);

        Coach tortorella = new Coach("John Tortorella", "Head Coach - Philadelphia Flyers", "Althetics", "104", "(215) 876-3004", "John.Tortorella@nhl.com");
        directory.addCoach(tortorella);

        Coach sullivan = new Coach("Mike Sullivan", "Head Coach - Pittsburgh Penguins", "Athletics", "106", "(412) 979-3482", "Mike.Sullivan@nhl.com");
        directory.addCoach(sullivan);

        Coach quinn = new Coach("David Quinn", "Head Coach - San Jose Sharks", "Athletics", "108", "(408) 213-9064", "David.Quinn@nhl.com");
        directory.addCoach(quinn);

        Coach hakstol = new Coach("Dave Hakstol", "Head Coach - Seattle Kraken", "Athletics", "110", "(206) 866-7743", "Dave.Hakstol@nhl.com");
        directory.addCoach(hakstol);

        // Adding equipment to the system
        Equipment hockeyPucks = new Equipment("Hockey Pucks", 100);
        SportsClub.addEquipment(hockeyPucks);
        Equipment softballs = new Equipment("Softballs", 50);
        SportsClub.addEquipment(softballs);
        Equipment baseballs = new Equipment("Baseballs", 150);
        SportsClub.addEquipment(baseballs);
        Equipment basketballs = new Equipment("Basketballs", 79);
        SportsClub.addEquipment(basketballs);
        Equipment hockeySkates = new Equipment("Hockey Skates", 25);
        SportsClub.addEquipment(hockeySkates);
        Equipment figureSkates = new Equipment("Figure Skates", 27);
        SportsClub.addEquipment(figureSkates);
        Equipment hockeySticks = new Equipment("Hockey Sticks", 64);
        SportsClub.addEquipment(hockeySticks);
        Equipment benches = new Equipment("Benches", 4);
        SportsClub.addEquipment(benches);
        Equipment treadmills = new Equipment("Treadmills", 11);
        SportsClub.addEquipment(treadmills);
        Equipment softballGloves = new Equipment("Softball Gloves", 15);
        SportsClub.addEquipment(softballGloves);
        Equipment baseballGloves = new Equipment("Baseball Gloves", 17);
        SportsClub.addEquipment(baseballGloves);
        Equipment baseballBats = new Equipment("Baseball Bats", 8);
        SportsClub.addEquipment(baseballBats);
        

        // Adding items and equipment to the system
        items.add(new Item(1, "Hockey Pucks", 2.50f));
        items.add(new Item(2, "Hockey Sticks", 25.0f));
        items.add(new Item(3, "Hockey Skates", 80.0f));
        items.add(new Item(4, "Figure Skates", 70.0f));
        items.add(new Item(5, "Benches", 50.0f));
        items.add(new Item(6, "Kettle Bell", 30.0f));
        items.add(new Item(7, "Bike", 40.0f));
        items.add(new Item(8, "Treadmills", 25.0f));
        items.add(new Item(9, "Ellipticals", 85.0f));
        items.add(new Item(10, "Lat Machines", 120.0f));
        items.add(new Item(11, "Dumb Bells", 35.0f));
        items.add(new Item(12, "Weight Racks", 30.0f));
        items.add(new Item(13, "Weight Plates", 25.0f));
        items.add(new Item(14, "Medicine Balls", 60.0f));
        items.add(new Item(15, "Baseball", 15.0f));
        items.add(new Item(16, "Softball", 15.0f));
        items.add(new Item(17, "Baseball Gloves", 25.0f));
        items.add(new Item(18, "Softball Gloves", 25.0f));
        items.add(new Item(19, "Softball Bats", 20.0f));
        items.add(new Item(20, "Baseball Bats", 20.0f));
        items.add(new Item(21, "Basketball", 15.0f));
        items.add(new Item(22, "Volleyball", 15.0f));
        items.add(new Item(23, "Knee Pads", 10.0f));
        items.add(new Item(24, "Basketball Nets", 5.0f));
        items.add(new Item(25, "Volleyball Nets", 15.0f));

        // Adding members to the system 
        membershipSys.createMember("Burton Guster", "4506 Henry Place Raleigh, NC 27610", "Burton.Guster@gmail.com", "(252) 987-6483", "861516");
        membershipSys.enrollMember("861516", Arrays.asList("Burton Guster"), Arrays.asList("Shawn Spencer"), "Signed");

        membershipSys.createMember("Shawn Spencer", "605 Mountain Rd. Concord, NC 28027", "Shawn.Spencer@gmail.com", "(252) 307-8366", "861970");
        membershipSys.enrollMember("861970", Arrays.asList("Shawn Spencer"), Arrays.asList("Burton Guster"), "Signed");

        membershipSys.createMember("Josh Tucker", "328 Stroop Hill Rd. Raleigh, NC 27610", "Josh.Tucker@gmail.com", "(252) 473-4580", "861225");
        membershipSys.enrollMember("861225", Arrays.asList("Josh Tucker"), Arrays.asList("Oliver Ross"), "Signed");

        membershipSys.createMember("Louis Gardner", "2727 Fairfield Rd. Greensboro, NC 27406", "Louis.Gardner@gmail.com", "(252) 151-7332", "861743");
        membershipSys.enrollMember("861743", Arrays.asList("Louis Gardner"), Arrays.asList("Kari Steele"), "Signed");

        membershipSys.createMember("Kristine Rogers", "2118 Clement Street Huntersville, NC 28078", "Kristine.Rogers@gmail.com", "(252) 045-9901", "861113");
        membershipSys.enrollMember("861113", Arrays.asList("Kristine Rogers"), Arrays.asList("Holly Donovan"), "Signed");

        membershipSys.createMember("Juliet O'Hara", "738 Oak Drive Raleigh, NC 27610", "Juliet.Ohara@gmail.com", "(252) 886-4701", "861876");
        membershipSys.enrollMember("861876", Arrays.asList("Juliet O'Hara"), Arrays.asList("Carlton Lassiter"), "Signed");
        
        // Adding appointments to the system
        Appointment gusterApp = new Appointment("Burton Guster", "4/15/2024", "13:00", "861516", "Hockey Lessons", "Ice Rink");
        schedule.addAppointment(gusterApp);
        Appointment spencerApp = new Appointment("Shawn Spencer", "4/21/2024", "14:00", "861970", "Baseball Lessons", "Baseball Field");
        schedule.addAppointment(spencerApp);
        Appointment rogersApp = new Appointment("Kristine Rogers", "4/19/2024", "08:00", "861113", "Softball Lessons", "Softball Field");
        schedule.addAppointment(rogersApp);
        Appointment gardnerApp = new Appointment("Louis Gardener", "4/15/2024", "13:00", "861743", "Hockey Lessons", "Ice Rink");
        schedule.addAppointment(gardnerApp);
        Appointment oharaApp = new Appointment("Juliet O'Hara", "4/19/2024", "08:00", "861876", "Gym Training Session", "Gym");
        schedule.addAppointment(oharaApp);
        
        // Creating employees
        Employees_info employee1 = new Employees_info("Mike Walsh", "Manager", "Mike.Walsh@gmail.com", "(505) 802-8521", "Mike Walsh", 85, 90, 95);
        Employees_info employee2 = new Employees_info("Chris Fowler", "Sales Manager", "Chris.Fowler@gmail.com", "(505) 918-3367", "Chris Fowler", 90, 91, 88);
        Employees_info employee3 = new Employees_info("Tessa Baird", "Cashier", "Tessa.Baird@gmail.com", "(505) 886-1117", "Tessa Baird", 95, 87, 84);


        Menu();
    }
}
