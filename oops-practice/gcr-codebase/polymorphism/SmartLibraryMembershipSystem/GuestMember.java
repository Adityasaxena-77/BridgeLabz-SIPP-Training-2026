package gcr_codebase.Polymorphism.SmartLibraryMembershipSystem;

class GuestMember extends LibraryMember {

    public GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}