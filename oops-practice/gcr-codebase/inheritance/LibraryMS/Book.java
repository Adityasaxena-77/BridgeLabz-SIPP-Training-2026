package gcr_codebase.Inheritance.LibraryMS;

public class Book {
    public String BookTitle;
    public String BookPublicationYear;

    public Book(String bookTitle, String bookPublicationYear) {
        BookTitle = bookTitle;
        BookPublicationYear = bookPublicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookTitle='" + BookTitle + '\'' +
                ", BookPublicationYear='" + BookPublicationYear + '\'' +
                '}';
    }
}