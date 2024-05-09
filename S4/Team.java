public class Team {
    // Creating instance variables
    private String teamName;
    private String coach;
    private String city;
    private String state;
    private String numOfPlayers;

    public Team(String teamName, String coach, String city, String state, String numOfPlayers) {
        /**
         * This method receives 'teamName', 'coach', 'city', 'state', and 'numOfPlayers' as explicit parameters and assigns them to the instance variables
         */
        this.teamName = teamName;
        this.coach = coach;
        this.city = city;
        this.state = state;
        this.numOfPlayers = numOfPlayers;
    }

    public String getTeamName() {
        /**
         * This method returns the team name
         */
        return teamName;
    }

    public String getCoach() {
        /**
         * This method returns the coach of a team
         */
        return coach;
    }

    public String getCity() {
        /**
         * This method returns the city of the team
         */
        return city;
    }

    public String getState() {
        /**
         * This method returns the state of the team
         */
        return state;
    }

    public String getNumOfPlayers() {
        /**
         * This method returns the number of players on a team
         */
        return numOfPlayers;
    }

    public void setTeamName(String teamName) {
        /**
         * This method receives 'teamName' as an explicit parameter and assigns it to the instance variable
         */
        this.teamName = teamName;
    }

    public void setCoach(String coach) {
        /**
         * This method receives 'coach' as an explicit parameter and assigns it to the instance variable
         */
        this.coach = coach;
    }

    public void setCity(String city) {
        /**
         * This method receives 'city' as an explicit parameter and assigns it to the instance variable
         */
        this.city = city;
    }

    public void setState(String state) {
        /**
         * This method receives 'state' as an explicit parameter and assigns it to the instance variable
         */
        this.state = state;
    }

    public void setNumOfPlayers(String numOfPlayers) {
        /**
         * This method receives 'numOfPlayers' as an explicit parameter and assigns it to the instance variable
         */
        this.numOfPlayers = numOfPlayers;
    }
}