package CaseMethod;

public class BookLending {
    Student sdt;
    Book book;

    int loanPeriod;
    int loanLimit = 5;
    int overdue;
    int fine;

    public BookLending(Student sdt, Book book, int loanPeriod) {
        this.sdt = sdt;
        this.book = book;
        this.loanPeriod = loanPeriod;

        calculateFine();
    }

    public void calculateFine() {
        if (loanPeriod > loanLimit) {
            overdue = loanPeriod - loanLimit;
            fine = overdue * 2000;
        } else {
            overdue = 0;
            fine = 0;
        }
    }

    public void printLending() {
        System.out.println(sdt.name + " | " + book.title +
                " | Loan Period (days): " + loanPeriod +
                " | Late return: " + overdue + " | fine: " + fine);
    }
}