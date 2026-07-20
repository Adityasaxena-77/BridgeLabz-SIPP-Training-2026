class RescueTeam {

    String teamId;
    String location;

    RescueTeam(String id, String location) {

        teamId = id;
        this.location = location;
    }

    void performDuty() {

        System.out.println("General Rescue");
    }
}

class MedicalTeam extends RescueTeam {

    MedicalTeam(String id, String loc) {
        super(id, loc);
    }

    @Override
    void performDuty() {

        System.out.println(teamId +
                " Providing Medical Aid");
    }
}

class FireRescueTeam extends RescueTeam {

    FireRescueTeam(String id, String loc) {
        super(id, loc);
    }

    @Override
    void performDuty() {

        System.out.println(teamId +
                " Controlling Fire");
    }
}

class FoodSupplyTeam extends RescueTeam {

    FoodSupplyTeam(String id, String loc) {
        super(id, loc);
    }

    @Override
    void performDuty() {

        System.out.println(teamId +
                " Distributing Food");
    }
}

public class RescueManagement {

    static void findTeamByLocation(
            RescueTeam[] teams,
            String location) {

        for (RescueTeam t : teams)

            if (t.location.equalsIgnoreCase(location))

                System.out.println(t.teamId);
    }

    static void displayTeamsByPrefix(
            RescueTeam[] teams,
            String prefix) {

        for (RescueTeam t : teams)

            if (t.teamId.startsWith(prefix))

                System.out.println(t.teamId);
    }

    public static void main(String[] args) {

        RescueTeam[] teams = {

                new MedicalTeam("MED101", "Delhi"),
                new FireRescueTeam("FIR201", "Mumbai"),
                new FoodSupplyTeam("FOO301", "Delhi"),
                new MedicalTeam("MED401", "Lucknow"),
                new FireRescueTeam("FIR501", "Delhi")
        };

        int medical = 0;
        int fire = 0;
        int food = 0;

        System.out.println("Performing Duties\n");

        for (RescueTeam t : teams) {

            t.performDuty();

            if (t instanceof MedicalTeam)
                medical++;
            else if (t instanceof FireRescueTeam)
                fire++;
            else if (t instanceof FoodSupplyTeam)
                food++;
        }

        System.out.println("\nTeams in Delhi");

        findTeamByLocation(teams, "Delhi");

        System.out.println("\nTeam IDs starting with MED");

        displayTeamsByPrefix(teams, "MED");

        System.out.println("\nMedical = " + medical);
        System.out.println("Fire = " + fire);
        System.out.println("Food = " + food);

        if (medical >= fire && medical >= food)
            System.out.println("\nMaximum Deployment : Medical Team");
        else if (fire >= medical && fire >= food)
            System.out.println("\nMaximum Deployment : Fire Rescue Team");
        else
            System.out.println("\nMaximum Deployment : Food Supply Team");
    }
}