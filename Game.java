/**
 * @author  Alena Fisher
 * 4/13/2024
 */
public class Game {
    // Creating instance variables
    private String team1;
    private String team2;
    private String gameDate;
    private String gameTime;
    private String location;

    public Game(String team1, String team2, String gameDate, String gameTime, String location) {
        /**
         * This constructor receives 'team1', 'team2', 'gameDate', 'gameTime', and 'location' and explicit paramters
         * and assigns them to the instance variables
         */
        this.team1 = team1;
        this.team2 = team2;
        this.gameDate = gameDate;
        this.gameTime = gameTime;
        this.location = location;
    }

    public String getGameDate() {
        /**
         * This method returns the game date
         */
        return gameDate;
    }

    public String getGameTime() {
        /**
         * This method returns the game time
         */
        return gameTime;
    }

    public String getLocation() {
        /**
         * This method returns the game location
         */
        return location;
    }

    public String getTeam1() {
        /**
         * This method returns the first team's name
         */
        return team1;
    }

    public String getTeam2() {
        /**
         * This method returns the second team's name
         */
        return team2;
    }

    public void setGameDate(String gameDate) {
        /**
         * This method receives 'gameDate' as an explicit parameters and assigns it to the instance variable
         */
        this.gameDate = gameDate;
    }

    public void setGameTime(String gameTime) {
        /**
         * This method receives 'gameTime' as an explicit parameters and assigns it to the instance variable
         */
        this.gameTime = gameTime;
    }

    public void setLocation(String location) {
        /**
         * This method receives 'location' as an explicit parameters and assigns it to the instance variable
         */
        this.location = location;
    }

    public void setTeam1(String team1) {
        /**
         * This method receives 'team1' as an explicit parameters and assigns it to the instance variable
         */
        this.team1 = team1;
    }

    public void setTeam2(String team2) {
        /**
         * This method receives 'team2' as an explicit parameters and assigns it to the instance variable
         */
        this.team2 = team2;
    }
}