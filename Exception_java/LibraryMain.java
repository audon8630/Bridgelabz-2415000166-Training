import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class InvalidReturnException extends Exception {
    public InvalidReturnException(String message) {
        super(message);
    }
}

class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String message) {
        super(message);
    }
}

class Library {
    private Map<String, Boolean> books = new HashMap<>();
    private Map<String, List<String>> userRecords = new HashMap<>();

    public Library() {
        books.put("Java Basics", true);
        books.put("C Programming", true);
        books.put("Data Structures", true);
    }

    public void borrowBook(String user, String book)
            throws BookNotAvailableException, UserLimitExceededException {
        if (!books.containsKey(book) || !books.get(book)) {
            throw new BookNotAvailableException("Book not available: " + book);
        }

        userRecords.putIfAbsent(user, new ArrayList<>());
        List<String> borrowed = userRecords.get(user);

        if (borrowed.size() >= 5) {
            throw new UserLimitExceededException("You cannot borrow more than 5 books.");
        }

        borrowed.add(book);
        books.put(book, false);
        System.out.println(user + " borrowed: " + book);
    }

    public void returnBook(String user, String book) throws InvalidReturnException {
        List<String> borrowed = userRecords.get(user);

        if (borrowed == null || !borrowed.contains(book)) {
            throw new InvalidReturnException("Invalid return: " + book + " was not borrowed by " + user);
        }

        borrowed.remove(book);
        books.put(book, true);
        System.out.println(user + " returned: " + book);
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Library lib = new Library();

        try {
            lib.borrowBook("Krish", "Java Basics");
            lib.borrowBook("Krish", "C Programming");
            lib.returnBook("Krish", "Python Guide");
        } catch (BookNotAvailableException | UserLimitExceededException | InvalidReturnException e) {
            System.out.println(e.getMessage());
        }
    }
}
