package gcr_codebase.Interfaces.MultiServiceSmartTV;

interface GamingService {
    void playGame();
    default void showSubscriptionDetails() {
        System.out.println("Gaming Service Subscription Active.");
    }
}