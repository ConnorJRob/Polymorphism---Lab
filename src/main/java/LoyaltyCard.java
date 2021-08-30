public class LoyaltyCard implements IScan{ //this class now requires the IScan behaviour/method
    private String barCode;
    private String vendor;

    public LoyaltyCard(String barCode, String vendor) {
        this.barCode = barCode;
        this.vendor = vendor;
    }

    public String getVendor() {
        return this.vendor;
    }

    //as per line 1, this class must have a String scan() method
    //the behaviour in the body is unique to this class but ultimately it is still a method called scan() that returns a string
    public String scan() {
        return this.barCode;
    }
}
