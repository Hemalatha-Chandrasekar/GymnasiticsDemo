public class Main {
    public static void main(String[] args) {
        Gymnastics gymnastics = new Gymnastics();

        // Example of calculating average age (just as a placeholder)
        int[] ages = {22, 23, 21, 25, 26, 20, 24, 27, 28, 22, 23};
        gymnastics.displayPlayersId();
        gymnastics.calculateAvgAge(ages);
        //gymnastics.retirePlayer(gymnastics.playerIDs);
        gymnastics.retirePlayer(6); // Retire player with ID 5

    }
}