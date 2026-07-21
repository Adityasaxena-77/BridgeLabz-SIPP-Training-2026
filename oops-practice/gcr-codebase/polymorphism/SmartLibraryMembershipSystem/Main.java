package gcr_codebase.Polymorphism.SmartLibraryMembershipSystem;

public class Main {

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Rahul", "S101"),
                new FacultyMember("Priya", "F201"),
                new GuestMember("Amit", "G301")
        };

        Library library = new Library();

        System.out.println("----- Library Members -----");
        library.displayMembers(members, 4);

        System.out.println("----- Search Result -----");
        library.searchMember(members, "F201");
    }
}