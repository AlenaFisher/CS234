import java.util.LinkedList;
import java.util.ListIterator;

public class GameSchedule {
    // Creating the linked lists
    private LinkedList<Game> games;
    private LinkedList<Game> game;

    public GameSchedule() {
        /**
         * This constructor initializes two lists: one to store information for individual games, and the other to store all of the games in a schedule
         */
        game = new LinkedList<Game>();
        games = new LinkedList<Game>();
    }

    public void addGame(Game aGame) {
        /**
         * This method adds the information of individual games to a linked list, then adds that linked list to the game schedule linked list
         */
        game.add(aGame);
        games.addAll(game);
    }

    public void displayGameInfo(String team1, String team2) {
        /**
         * This method uses two iterators to search through the nested linked lists for a game
         * If the game exists, it returns the game information. If the game does not exist, it prints a message to the user
         */
        ListIterator<Game> iterator = games.listIterator();
        ListIterator<Game> iter = game.listIterator();
        boolean found = true;

        // While loop to search through the list of games
        while(iterator.hasNext()) {
            Game l = iter.next();
            // While loop to search through the list of information for each game
            while(iter.hasNext()) {
                Game m = iter.next();
                if(l.getTeam1().equals(team1)) {
                    if(m.getTeam2().equals(team2)) {
                        // If the teams are found, the information for the game is printed
                        found = true;
                        String s = "";
                        s += "Game: " + team1 + " versus " + team2 + "\n" + "Date: " + m.getGameDate() + "\n" +
                                "Time: " + m.getGameTime() + "\n" + "Location: " + m.getLocation(); 
                    }
                }
            }
        }

        // Message to the user if the game between the two teams is not found
        if(!found) {
            System.out.println("Game for the " + team1 + " versus the " + team2 +  "does not exist.");
        }
    }

    public void displayGameSchedule() {
        /**
         * This method uses two iterators to iterate through the nested linked lists to display all games in the game schedule
         */
        ListIterator<Game> iterator = games.listIterator();
        ListIterator<Game> iter = game.listIterator();

        // While loop to search through the list of games
        while(iterator.hasNext()) {
            Game l = iterator.next();
            // While loop to search through the list of information for each game
            while(iter.hasNext()) {
                Game m = iter.next();

                // Printing the information for each game in the schedule
                System.out.println("Game: " + m.getTeam1() + " versus " + m.getTeam2());
                System.out.println("Date: " + m.getGameDate());
                System.out.println("Time: " + m.getGameTime());
                System.out.println("Location: " + m.getLocation());
            }
        }
    }
}