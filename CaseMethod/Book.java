package CaseMethod;

public class Book {
    // ATRIBUT
    String code;
    String title;
    int year;
    String status;
    String publisher;

    // CONSTRUCTOR
    public Book(String code, String title, int year, String publisher) {
        this.code = code;
        this.title = title;
        this.year = year;
        this.status = "Available";
        this.publisher = publisher;
    }

    public void printBook() {
        System.out.println("Code: " + code + " | Title: " + title + " | Year: " + year + " | Publisher: " + publisher);
    }
}
