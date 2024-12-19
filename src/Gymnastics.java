import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Gymnastics {
    public int[] playerIDs;
//public int i;

    public Gymnastics() {
        playerIDs = new int[11];
        for (int i = 0; i < playerIDs.length; i++) {
            playerIDs[i] = i + 1;
            System.out.println("Player IDs: " + playerIDs[i]);
        }
        System.out.println("A new Gymnastics has been created");
    }

    public void calculateAvgAge(int[] age) {

    }
    public void retirePlayer(int[] id) {

    }
    public void displayPlayersId() {
        //Conver playersID array to an ArrayList
        ArrayList<Integer> playList= new ArrayList<>();
        System.out.println("\nArrayList :");
        for (int id : playerIDs) {
            playList.add(id);
           System.out.println("Player ID: " + id);
        }
// use forEach() to iterate and display IDs
        System.out.println("\nInterating through the Player IDs using the forEach");
        playList.forEach(id -> System.out.println("Player ID "+id));
    }

}

