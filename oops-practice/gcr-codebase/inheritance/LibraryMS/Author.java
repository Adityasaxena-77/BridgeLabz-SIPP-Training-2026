package gcr_codebase.Inheritance.LibraryMS;

public class Author {
    public String AuthorName;
    public String AuthorBio;
    Book book;

    public Author(String authorName, String authorBio, Book book) {
        AuthorName = authorName;
        AuthorBio = authorBio;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "AuthorName='" + AuthorName + '\'' +
                ", AuthorBio='" + AuthorBio + '\'' +
                ", book=" + book +
                '}';
    }
}
