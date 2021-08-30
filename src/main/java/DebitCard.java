public class DebitCard extends BankCard{ //the DebitCard class now extends from (i.e is a child of) the BankCard class
    //because of this, they also all inherently implement IScan BECAUSE the parent class (BankCard does)

//    private String cardNumber;
    private int sortCode;
    private int accountNumber;
//    private String expiryDate;
//    private int securityNumber;


    //This is the debit card constructor
    //it requires cardNumber, expiryDate & securityNumber
    //but it ALSO requires sortCode and accountNumber in order to be initialised (create)
    public DebitCard(String cardNumber, int sortCode, int accountNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
        //super is used when the arguments for these parameters is coming from the parent class
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        //as these are new arguments, this must be defined
    }

    //this method is unique to this class because sortCode is a new property that did not come from BankCard
    public int getSortCode() {
        return this.sortCode; //it's a simple getter that returns the sortCode of the debit card object it's called on
    }

    //this method is unique to this class because accountNumber is a new property that did not come from BankCard
    public int getAccountNumber() {
        return this.accountNumber; //it's a simple getter that returns the accountNumber of the debit card object it's called on
    }

    //By default this class already has a scan() method that simply returns "" - because this is what the parent does
    // However we want it to behave differently for each card type, so here it returns the string "Payment Complete"
    // Note - this now acts differently than how it does in the CreditCard class because we've overwritten it with different behaviour
    // however both meet the requirement of IScan which requires a String scan() method
    public String scan() {
        return "Payment Complete";
    }
}
