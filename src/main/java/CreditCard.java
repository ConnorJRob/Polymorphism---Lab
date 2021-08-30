public class CreditCard extends BankCard{
    //the CreditCard class now extends from (i.e is a child of) the BankCard class
    //because of this, they also all inherently implement IScan BECAUSE the parent class (BankCard does)

//    private String cardNumber;
//    private String expiryDate;
//    private int securityNumber;


    //This is the credit card constructor, it is essentially the same as the BankCard parent,
    //it only requires cardNumber, expiryDate & securityNumber to be initialised (created)
    public CreditCard(String cardNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
        //super is used when the arguments for these parameters is coming from the parent class
        //in this case there are no new properties to be defined
    }

    //By default this class already has a scan() method that simply returns "" - because this is what the parent does
    // However we want it to behave differently for each card type, so here it returns the string "Payment successful"
    public String scan() {
        return "Payment Successful";
    }
}
