package gcr_codebase.Interfaces.MultiServiceSmartTV;

public class Main {

    public static void main(String[] args) {

        String[] movies = {
                "Inception",
                "Avatar",
                "Interstellar"
        };

        String[] games = {
                "FIFA 24",
                "Minecraft",
                "Need for Speed"
        };

        SmartTV tv = new SmartTV();

        tv.streamMovie();
        tv.playGame();
        tv.showSubscriptionDetails();

        System.out.println();

        tv.displayMovies(movies);

        System.out.println();

        tv.displayGames(games);
    }
}