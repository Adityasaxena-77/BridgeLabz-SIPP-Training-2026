class Subscription {

    String subscriberName;
    String subscriptionId;

    Subscription(String name, String id) {

        subscriberName = name;
        subscriptionId = id;
    }

    double calculateMonthlyCharge() {
        return 0;
    }
}

class BasicPlan extends Subscription {

    BasicPlan(String n, String id) {
        super(n, id);
    }

    @Override
    double calculateMonthlyCharge() {
        return 199;
    }
}

class PremiumPlan extends Subscription {

    PremiumPlan(String n, String id) {
        super(n, id);
    }

    @Override
    double calculateMonthlyCharge() {
        return 499;
    }
}

class FamilyPlan extends Subscription {

    FamilyPlan(String n, String id) {
        super(n, id);
    }

    @Override
    double calculateMonthlyCharge() {
        return 799;
    }
}

public class StreamingPlatform {

    static void search(Subscription[] s, String id) {

        for (Subscription sub : s)

            if (sub.subscriptionId.equals(id)) {

                System.out.println(sub.subscriberName);
                return;
            }

        System.out.println("Not Found");
    }

    static void displayByLetter(Subscription[] s, char ch) {

        for (Subscription sub : s)

            if (Character.toUpperCase(sub.subscriberName.charAt(0))
                    == Character.toUpperCase(ch))

                System.out.println(sub.subscriberName);
    }

    static double revenue(Subscription[] s) {

        double total = 0;

        for (Subscription sub : s)

            total += sub.calculateMonthlyCharge();

        return total;
    }

    public static void main(String[] args) {

        Subscription[] subs = {

                new BasicPlan("Aditya", "S101"),
                new PremiumPlan("Rahul", "S102"),
                new FamilyPlan("Aman", "S103")
        };

        search(subs, "S102");

        System.out.println("\nNames starting with A");

        displayByLetter(subs, 'A');

        System.out.println("\nRevenue = ₹" +
                revenue(subs));

        Subscription max = subs[0];

        for (Subscription s : subs)

            if (s.calculateMonthlyCharge() >
                    max.calculateMonthlyCharge())

                max = s;

        System.out.println("\nMost Expensive Subscription");

        System.out.println(max.subscriberName +
                " ₹" + max.calculateMonthlyCharge());
    }
}