package CaseMethod;

public class Book {
    // ATRIBUT
    String code;
    String title;
    int year;
    String status;

    // CONSTRUCTOR
    public Book(String code, String title, int year) {
        this.code = code;
        this.title = title;
        this.year = year;
        this.status = "Available";
    }

    public void printBook() {
        System.out.println("Code: " + code + " | Title: " + title + " | Year: " + year);
    }
}
