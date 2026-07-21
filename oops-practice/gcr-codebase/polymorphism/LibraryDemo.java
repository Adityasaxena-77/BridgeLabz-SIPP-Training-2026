class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Name : " + memberName);
        System.out.println("ID   : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class LibraryDemo {

    public static void main(String[] args) {

        LibraryMember[] members = {

                new StudentMember("Aditya", "S101"),
                new FacultyMember("Rahul", "F102"),
                new GuestMember("Priya", "G103")
        };

        int overdueDays = 4;

        System.out.println("Library Members\n");

        for (LibraryMember member : members) {

            member.printDetails();

            System.out.println("Fine : ₹" +
                    member.calculateFine(overdueDays));

            System.out.println();
        }

        String searchId = "F102";

        System.out.println("Searching Member ID : " + searchId);

        boolean found = false;

        for (LibraryMember member : members) {

            if (member.memberId.equals(searchId)) {

                System.out.println("Member Found");
                member.printDetails();
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Member Not Found");
    }
}