package gcr_codebase.Interfaces.AIBasedContentModerationPlatform;

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public void checkOffensiveContent(String post) {
        if (TextModeration.containsRestrictedWords(post)) {
            System.out.println("Offensive Post: " + post);
        }
    }

    @Override
    public void checkSpam(String post) {
        if (SpamDetection.containsRestrictedWords(post)) {
            System.out.println("Spam Post: " + post);
        }
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public void moderatePosts(String[] posts) {
        for (String post : posts) {
            boolean spam = SpamDetection.containsRestrictedWords(post);
            boolean offensive = TextModeration.containsRestrictedWords(post);

            if (spam) {
                System.out.println("Spam Post: " + post);
            } else if (offensive) {
                System.out.println("Offensive Post: " + post);
            } else {
                System.out.println("Valid Post: " + post);
            }
        }
    }
}