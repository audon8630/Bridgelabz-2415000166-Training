import java.util.*;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String message) {
        super(message);
    }
}

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class MovieBooking {
    private Map<String, Boolean> seats = new HashMap<>();

    public MovieBooking() {
        seats.put("A1", true);
        seats.put("A2", true);
        seats.put("A3", true);
        seats.put("A4", true);
    }

    public void bookSeat(String seatNo) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNo)) {
            throw new InvalidSeatException("Error: Invalid seat number " + seatNo);
        }

        if (!seats.get(seatNo)) {
            throw new SeatAlreadyBookedException("Error: Seat " + seatNo + " is already booked!");
        }

        seats.put(seatNo, false);
        System.out.println("Seat " + seatNo + " booked successfully!");
    }
}

public class MovieMain {
    public static void main(String[] args) {
        MovieBooking booking = new MovieBooking();

        try {
            booking.bookSeat("A2");
            booking.bookSeat("A2");
        } catch (InvalidSeatException | SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }
    }
}
