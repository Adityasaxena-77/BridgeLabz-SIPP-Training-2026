interface StreamingService {

    void streamMovie(String movie);

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Premium");
    }
}

interface GamingService {

    void playGame(String game);

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Gold");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie(String movie) {
        System.out.println("Streaming: " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Playing: " + game);
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {

        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        String[] movies = {
                "Avengers",
                "Interstellar",
                "Inception"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "Valorant"
        };

        tv.showSubscriptionDetails();

        System.out.println("\nMovies:");

        for (String movie : movies)
            tv.streamMovie(movie);

        System.out.println("\nGames:");

        for (String game : games)
            tv.playGame(game);
    }
}