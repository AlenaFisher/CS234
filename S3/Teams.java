/**
 * @author  Alena Fisher
 * 4/13/2024
 */
import java.util.LinkedList;
import java.util.ListIterator;

public class Teams {
    // Creating the linked lists
    private LinkedList<Team> teams;
    private LinkedList<Team> team;

    public Teams() {
        /**
         * This constructor initializes two lists: one to store information for individual teams, and the other to store all of the teams
         */
        team = new LinkedList<Team>();
        teams = new LinkedList<Team>();
    }

    public void addTeam(Team aTeam) {
        /**
         * This method adds the information of a team to a linked list, then adds that linked list to the teams list
         */
        team.add(aTeam);
        teams.addAll(team);
    }

    public void displayTeamInfo() {
        /**
         * This method uses two iterators, one to iterate through the list of teams, and the other to iterate through the list of a team's information
         * It prints out the information for each team in the teams list
         */
        ListIterator<Team> iterator = teams.listIterator();
        ListIterator<Team> iter = team.listIterator();

        while(iterator.hasNext()) {
            Team j = iterator.next();
            while(iter.hasNext()) {
                Team l = iter.next();
                System.out.println("Team name: " + l.getTeamName());
                System.out.println("Coach: " + l.getCoach());
                System.out.println("City: " + l.getCity());
                System.out.println("State: " + l.getState());
                System.out.println("Players: " + l.getNumOfPlayers());
            }
        }
    }

    public void displayTeamNames() {
        /**
         * This method uses two iterators, one to iterate through the list of teams, and the other to iterate through the list of a team's information
         * It prints out all of the teams names that are stored in the teams list
         */
        ListIterator<Team> iterator = teams.listIterator();
        ListIterator<Team> iter = team.listIterator();

        while(iterator.hasNext()) {
            Team j = iterator.next();
            while(iter.hasNext()) {
                Team l = iter.next();
                System.out.println("Team name: " + l.getTeamName());
            }
        }
    }
}
