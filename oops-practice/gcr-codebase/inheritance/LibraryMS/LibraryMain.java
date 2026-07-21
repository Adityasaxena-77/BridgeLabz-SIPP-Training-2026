package gcr_codebase.Inheritance.LibraryMS;

public class LibraryMain {
    public void display() {
        Book b = new Book("Dopamine","2004");
        Author a = new Author("Pankaj Sharma","Male",b);

        Book b2 = new Book("A Nation of Idiots","2023");
        Author a2 = new Author("Daksh Tyagi","Male",b2);

        System.out.println(a.toString());
        System.out.println("-------------------------------------------------------");
        System.out.println(a2.toString());

    }
    public static void main(String[] args) {
        LibraryMain libraryMain = new LibraryMain();
        libraryMain.display();
    }
}