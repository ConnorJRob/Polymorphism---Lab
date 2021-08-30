public abstract class BankCard implements IScan{
    //we created BankCard because the credit and debit card classes shared a lot of properties,
    //so it made more sense for them to extend from a parent class (BankCard)
    //the BankCard implements IScan so both CreditCard and DebitCard will too without us needing to type that
    //we've also made this class abstract because we don't expect BankCard to be an object that is actually used itself

    private String cardNumber; //Any BankCard child class will have String cardNumber
    private String expiryDate; //Any BankCard child class will have String expiryDate
    private int securityNumber; //Any BankCard child class will have a securityNumber

    public BankCard(String cardNumber, String expiryDate, int securityNumber) { //this is our BankCard constructor, it requires the arguments stated above
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }

    public String getCardNumber() { // Any BankCard child class will have the getCardNumber() method
        return cardNumber; //this method returns the cardNumber of the BankCard it is called on
    }

    public String getExpiryDate() { // Any BankCard child class will have the getExpiryDate() method
        return expiryDate; //this method returns the expiryDate of the BankCard it is called on
    }

    public int getSecurityNumber() { // Any BankCard child class will have the getSecurityNumber() method
        return securityNumber; //this method returns the SecurityNumber of the BankCard it is called on
    }

    //Any BankCard child will have the scan() method which returns a blank string by default
    //However this can (and should) be overwritten in each child class as appropriate
    public String scan() {
        return "";
    }
}
