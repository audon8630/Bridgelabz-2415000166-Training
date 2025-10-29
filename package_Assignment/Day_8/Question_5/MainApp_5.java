import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainApp_5 {
    public static void main(String[] args) {
        Book b = new Book("Java Programming", "James Gosling");
        Member m = new Member("Amol", 101);
        Transaction t = new Transaction();

        t.issueBook(b, m);
    }
}
