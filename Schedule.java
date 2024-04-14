/**
 * @author  Alena Fisher
 * 4/13/2024
 */
import java.util.LinkedList;
import java.util.ListIterator;

public class Schedule {
    // Creating the linked lists
    private LinkedList<Appointment> appointments;
    private LinkedList<Appointment> appointment;

    public Schedule() {
        /**
         * This constructor initializes two lists: one to store information for an appointment, and the other to store all of the appointments
         */
        appointment = new LinkedList<Appointment>();
        appointments = new LinkedList<Appointment>();
    }

    public void addAppointment(Appointment anAppointment) {
        /**
         * This method adds the information of an appointment to a linked list, then adds that linked list to the appointments list
         */
        appointment.add(anAppointment);
        appointments.addAll(appointment);
    }

    public void displayAppInfo(String memberID) {
        /**
         * This method uses two iterators, one to iterate through the list of appointments, and the other to iterate through the list of a member's appointment information
         * If the appointment for the member is found, it prints the information for the appointment
         * If the appointment for the member is not found, it prints a message to the user
         */
        ListIterator<Appointment> iterator = appointments.listIterator();
        ListIterator<Appointment> iter = appointment.listIterator();
        boolean found = false;

        for(int i = 0; i < appointments.size(); i++) {
            Appointment l = iterator.next();
            for(int j = 0; j < appointment.size(); j++) {
                Appointment k = iter.next();

                if(k.getMemberID().equals(memberID)) {
                    found = true;

                    System.out.println("Member: " + k.getName());
                    System.out.println("Appointment date: " + k.getAppDate());
                    System.out.println("Appointment time: " + k.getAppTime());
                    System.out.println("Appointment type: " + k.getAppointmentType());
                    System.out.println("Location: " + k.getLocation());
                }
            }
        }

        if(!found) {
            System.out.println("Appointment for member " + memberID + " does not exist");
        }
    }

    public boolean appExists(String memberID) {
        /**
         * This method uses two iterators, one to iterate through the list of appointments, and the other to iterate through a specific appointment's information
         * If the appointment is found, the method returns true
         * If the appointment is not found, the method returns false
         */
        ListIterator<Appointment> iterator = appointments.listIterator();
        ListIterator<Appointment> iter = appointment.listIterator();
        boolean found = false;

        for(int i = 0; i < appointments.size(); i++) {
            Appointment l = iterator.next();
            for(int j = 0; j < appointment.size(); j++) {
                Appointment k = iter.next();

                if(k.getMemberID().equals(memberID)) {
                    found = true;
                    return found;
                }

                else {
                    found = false;
                }
            }
        }

        return found;
    }

    public void updateAppInfo(String name, String date, String time, String memberID, String appointmentType, String location) {
        /**
         * This method uses two iterators, one to iterate through the list of appointments, and the other to iterate through the list of a member's appointment information
         * The new information for the appointment is passed as the parameters, and if the appoinment exists, the new information is saved
         * If the members appointment does not exist, the method prints a message to the user
         */
        ListIterator<Appointment> iterator = appointments.listIterator();
        ListIterator<Appointment> iter = appointment.listIterator();
        boolean found = false;

        for(int i = 0; i < appointments.size(); i++) {
            Appointment l = iterator.next();
            for(int j = 0; j < appointment.size(); j++) {
                Appointment k = iter.next();

                if(k.getMemberID().equals(memberID)) {
                    found = true;

                    k.setName(name);
                    k.setAppDate(date);
                    k.setAppTime(time);
                    k.setAppointmentType(appointmentType);
                    k.setLocation(location);
                }
            }
        }

        if(!found) {
            System.out.println("Appointment for member " + memberID + " does not exist");
        }
    }  

    public void removeAppointment(String memberID) {
        /**
         * This method uses and iterator to iterate through the list of appointments
         * A member's ID is passed as the parameter to be searched for. If the appointment exists, the list of the member's appointment information is removed
         * If the appointmentdoes not exist, a message is printed to the user
         */
        ListIterator<Appointment> iterator = appointments.listIterator();
        boolean found = false;

        for(int i = 0; i < appointments.size(); i++) {
            Appointment l = iterator.next();
            if(l.getMemberID().equals(memberID)) {
                found = true;
                iterator.remove();
            }
        }

        if(!found) {
            System.out.println("Appointment for member " + memberID + " does not exist");
        }
    }
}