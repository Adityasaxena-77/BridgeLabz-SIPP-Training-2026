package gcr_codebase.Polymorphism.SmartLibraryMembershipSystem;

class LibraryMember {

    String memberName;
    String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public double calculateFine(int overdueDays) {
        return 0;
    }

    public void printMemberDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
    }
}