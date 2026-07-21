package gcr_codebase.Polymorphism.SmartLibraryMembershipSystem;

class Library {

    public void displayMembers(LibraryMember[] members, int overdueDays) {

        for (LibraryMember member : members) {
            member.printMemberDetails();
            System.out.println("Fine: " + member.calculateFine(overdueDays));
            System.out.println();
        }
    }

    public void searchMember(LibraryMember[] members, String id) {

        boolean found = false;

        for (LibraryMember member : members) {
            if (member.memberId.equals(id)) {
                System.out.println("Member Found");
                member.printMemberDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member Not Found");
        }
    }
}