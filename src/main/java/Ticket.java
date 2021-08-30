public class Ticket implements IScan{
    private String bookingRef;
    private String qrCode;
    private String date;

    public Ticket(String bookingRef, String qrCode, String date) {
        this.bookingRef = bookingRef;
        this.qrCode = qrCode;
        this.date = date;
    }

    public String getBookingRef() {
        return bookingRef;
    }

    public String getDate() {
        return date;
    }

    //as per line 1, this class must have a String scan() method
    //the behaviour in the body is unique to this class but ultimately it is still a method called scan() that returns a string
    public String scan() {
        return this.qrCode;
    }
}
