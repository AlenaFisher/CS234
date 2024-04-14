/**
 * @author  Alena Fisher
 * 4/13/2024
 */
import java.util.LinkedList;
import java.util.ListIterator;

public class CoachDirectory {
    // Creating the linked lists
    private LinkedList<Coach> coaches;
    private LinkedList<Coach> coach;

    public CoachDirectory() {
        /**
         * This constructor initializes two lists: one to store information for a coach, and the other to store all of the coaches
         */
        coach = new LinkedList<Coach>();
        coaches = new LinkedList<Coach>();
    }

    public void addCoach(Coach aCoach) {
        /**
         * This method adds the information of a coach to a linked list, then adds that linked list to the coaches list
         */
        coach.add(aCoach);
        coaches.addAll(coach);
    }

    public void displayCoachInfo(String name) {
        /**
         * This method uses two iterators, one to iterate through the list of coaches, and the other to iterate through the list of a coach's information
         * A name is passed as a parameter to be searched for, and if the name is found, the coach's information is printed;
         * if the name is not found, it prints a message to the user
         */
        ListIterator<Coach> iterator = coaches.listIterator();
        ListIterator<Coach> iter = coach.listIterator();
        boolean found = false;

        for(int i = 0; i < coaches.size(); i++) {
            Coach j = iterator.next();
            for(int k = 0; k < coach.size(); k++) {
                Coach l = iter.next();

                if(l.getCoachName().equals(name)) {
                    found = true;

                    System.out.println("Coach: " + l.getCoachName());
                    System.out.println("Title: " + l.getTitle());
                    System.out.println("Department: " + l.getDepartment());
                    System.out.println("Office Location: " + l.getOfficeLocation());
                    System.out.println("Phone Number: " + l.getPhoneNumber());
                    System.out.println("Email Address: " + l.getEmail());
                }
            }
        }

        if(!found) {
            System.out.println("Coach " + name + " does not exist");
        }
    }

    public boolean coachExists(String name) {
        /**
         * This method uses two iterators, one to iterate through the list of coaches, and the other to iterate through the list of a coach's information
         * A name is passed as the parameter to be searched for, and if the coach exists, the method returns true
         * If the name does not exist, the method returns false
         */
        ListIterator<Coach> iterator = coaches.listIterator();
        ListIterator<Coach> iter = coach.listIterator();
        boolean found = false;

        for(int i = 0; i < coaches.size(); i++) {
            Coach j = iterator.next();
            for(int k = 0; k < coach.size(); k++) {
                Coach l = iter.next();

                if(l.getCoachName().equals(name)) {
                    found = true;
                    return found;
                }
            }
        }

        return found;
    }

    public void updateCoachInfo(String name, String title, String department, String officeLocation, String phoneNumber, String email) {
        /**
         * This method uses two iterators, one to iterate through the list of coaches, and the other to iterate through the list of a coach's information
         * The new information for the coach is passed as the parameters, and if the coach name exists, the new information is saved
         * If the coach's name does not exist, the method prints a message to the user
         */
        ListIterator<Coach> iterator = coaches.listIterator();
        ListIterator<Coach> iter = coach.listIterator();
        boolean found = false;

        for(int i = 0; i < coaches.size(); i++) {
            Coach j = iterator.next();
            for(int k = 0; k < coach.size(); k++) {
                Coach l = iter.next();

                if(l.getCoachName().equals(name)) {
                    found = true;

                    l.setCoachName(name);
                    l.setTitle(title);
                    l.setDepartment(department);
                    l.setOfficeLocation(officeLocation);;
                    l.setPhoneNumber(phoneNumber);
                    l.setEmail(email);
                }
            }
        }

        if(!found) {
            System.out.println("Coach " + name + " does not exist");
        }
    }

    public void removeCoach(String name) {
        /**
         * This method uses and iterator to iterate through the list of coaches
         * A name is passed as the parameter to be searched for. If the name exists, the list of the coach's information is removed
         * If the coach's name does not exist, a message is printed to the user
         */
        ListIterator<Coach> iterator = coaches.listIterator();
        boolean found = false;

        for(int i = 0; i < coaches.size(); i++) {
            Coach j = iterator.next();

            if(j.getCoachName().equals(name)) {
                found = true;
                iterator.remove();
            }
        }

        if(!found) {
            System.out.println("Coach "+ name + " does not exist");
        }
    }
}
