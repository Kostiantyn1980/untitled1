package AssignmentGame;

import static AssignmentGame.Game1.writeNumOfPlayersPerTeam;

public class Main {
    public static void main(String[] args) {
        writeNumOfPlayersPerTeam(AssignmentGame.Game1.GameType.SOCCER);
        writeNumOfPlayersPerTeam(AssignmentGame.Game1.GameType.HOCKEY);
        writeNumOfPlayersPerTeam(AssignmentGame.Game1.GameType.RUGBY);
    }


}

