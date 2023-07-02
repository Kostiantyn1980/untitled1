package AssignmentGame;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Game1 {


    public enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType game) {
        String fileName = game.name() + ".txt";
        int numOfPlayersPerTeam;

        switch (game) {
            case SOCCER:
                numOfPlayersPerTeam = 11;
                break;
            case HOCKEY:
                numOfPlayersPerTeam = 6;
                break;
            case RUGBY:
                numOfPlayersPerTeam = 15;
                break;
            default:
                throw new IllegalArgumentException("Unsupported game type: " + game);
        }

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(String.valueOf(numOfPlayersPerTeam));
            writer.close();
            System.out.println("File '" + fileName + "' created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

}