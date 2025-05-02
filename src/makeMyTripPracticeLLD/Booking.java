package makeMyTripPracticeLLD;

import java.util.Date;
import java.util.UUID;

import static makeMyTripPracticeLLD.BookingStatus.BOOKED;

public class Booking {
    private UUID bookingId;
    private User bookedBy;
    private Hotel hotel;
    private Room room;
    private Date checkIn;
    private Date checkOut;
    private Payment payment;
    private BookingStatus status;

    public Booking(UUID bookingId, User bookedBy, Hotel hotel, Room room, Date checkIn, Date checkOut, Payment payment, BookingStatus status) {
        this.bookingId = bookingId;
        this.bookedBy = bookedBy;
        this.hotel = hotel;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.status = BookingStatus.PENDING;
    }

    public boolean confirmBooking(Payment payment) {
        this.payment = payment;
        if (payment.isSuccesful()) {
            this.status = BOOKED;
            return true;
        }
        return true;
    }

    public boolean processBookingRequest(User user, BookingStatus bookingStatus, Hotel hotel) {
        if (bookingStatus != BOOKED) {
            boolean status = callBookigRoutine(user, hotel, checkIn, checkOut, payment);
        }
        return false;
    }

    private boolean callBookigRoutine(User user, Hotel hotel, Date checkIn, Date checkOut, Payment payment) {
        return false;
    }
}
