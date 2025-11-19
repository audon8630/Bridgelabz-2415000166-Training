import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {

        TreeMap<String, String> books = new TreeMap<>();

        books.put("978-1111", "Java Basics");
        books.put("978-2222", "Data Structures");
        books.put("978-3333", "DBMS Guide");

        String search = "978-2222";
        if (books.containsKey(search)) {
            System.out.println("Found: " + books.get(search));
        } else {
            System.out.println("Book not found");
        }

        books.remove("978-3333");

        System.out.println("Sorted books:");
        for (String isbn : books.keySet()) {
            System.out.println(isbn + " -> " + books.get(isbn));
        }

        String titleSearch = "Java Basics";
        for (String isbn : books.keySet()) {
            if (books.get(isbn).equals(titleSearch)) {
                System.out.println("Title found at ISBN: " + isbn);
            }
        }

    }
}
