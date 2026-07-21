package gcr_codebase.Interfaces.MultiServiceSmartTV;

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie() {
        System.out.println("Streaming movie...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing game...");
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public void displayMovies(String[] movies) {
        System.out.println("Available Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }
    }

    public void displayGames(String[] games) {
        System.out.println("Available Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}