package GcrCodeBase.Interfaces.AIBasedContentModerationPlatform;

public class Main {

    public static void main(String[] args) {

        String[] posts = {
                "Welcome everyone!",
                "Buy now and get 50% off",
                "I hate this service",
                "Click here to win a free phone",
                "Have a nice day!"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        moderator.moderatePosts(posts);
    }
}