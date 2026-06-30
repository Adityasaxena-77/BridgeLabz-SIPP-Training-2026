package gcr_codebase.Interfaces.AIBasedContentModerationPlatform;

interface TextModeration {

    void checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("Text Moderation Policy: Offensive content is not allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        String text = post.toLowerCase();
        return text.contains("bad") || text.contains("hate") || text.contains("abuse");
    }
}
