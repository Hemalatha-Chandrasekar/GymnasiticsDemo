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


    // Method to calculate the average age (implementation required)
    public void calculateAvgAge(int[] age) {
        if (age == null || age.length == 0) {
            System.out.println("No ages provided.");
            return;
        }
        int totalAge = 0;
        for (int a : age) {
            totalAge += a;
        }
        double avgAge = totalAge / (double) age.length;
        System.out.println("Average Age: " + avgAge);
    }


    public void retirePlayer(int playerid) {
        boolean playerFound = false;
        playerid=0;
        for (int i = 0; i < playerIDs.length; i++) {
            if (playerIDs[i] == playerid) {
                playerIDs[i] = -1; // Mark as retired (ID set to -1)
                System.out.println("Player with ID " + playerid + " has been retired.");
                playerFound = true;
                break;
            }
        }
        if (!playerFound) {
            System.out.println("Player with ID " + playerid + " not found.");
        }
    }

    public void displayPlayersId() {
        //Conver playersID array to an ArrayList
        ArrayList<Integer> playList = new ArrayList<>();
        System.out.println("\nArrayList :");
        for (int id : playerIDs) {
            playList.add(id);
            System.out.println("Player ID: " + id);
        }
// use forEach() to iterate and display IDs
        System.out.println("\nInterating through the Player IDs using the forEach");
        playList.forEach(id -> System.out.println("Player ID " + id));
    }

}

