package gcr_codebase.Polymorphism.SmartLibraryMembershipSystem;

class StudentMember extends LibraryMember {

    public StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}