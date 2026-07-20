interface TextModeration {

    void checkText(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive language is prohibited.");
    }

    static boolean containsRestrictedWords(String post) {

        String[] restricted = {"hate", "abuse", "violence"};

        for (String word : restricted) {
            if (post.toLowerCase().contains(word))
                return true;
        }

        return false;
    }
}

interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Policy: Spam content is not allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public void checkText(String post) {

        if (TextModeration.containsRestrictedWords(post))
            System.out.println("Offensive Post: " + post);
    }

    @Override
    public void checkSpam(String post) {

        if (post.toLowerCase().contains("buy now")
                || post.toLowerCase().contains("click here"))
            System.out.println("Spam Post: " + post);
    }

    @Override
    public void displayModerationPolicy() {

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static void main(String[] args) {

        String[] posts = {
                "I love Java programming",
                "Buy now and get 90% OFF",
                "I hate everyone",
                "Click here to win money",
                "Have a great day!"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            boolean spam = post.toLowerCase().contains("buy now")
                    || post.toLowerCase().contains("click here");

            boolean offensive = TextModeration.containsRestrictedWords(post);

            if (spam)
                System.out.println("Spam Post: " + post);
            else if (offensive)
                System.out.println("Offensive Post: " + post);
            else
                System.out.println("Valid Post: " + post);
        }
    }
}