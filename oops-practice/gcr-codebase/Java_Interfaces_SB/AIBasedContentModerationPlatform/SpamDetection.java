package GcrCodeBase.Interfaces.AIBasedContentModerationPlatform;

interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam Detection Policy: Spam content is prohibited.");
    }

    static boolean containsRestrictedWords(String post) {
        String text = post.toLowerCase();
        return text.contains("buy now") || text.contains("free") || text.contains("click here");
    }
}