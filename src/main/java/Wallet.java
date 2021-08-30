import java.util.ArrayList;

public class Wallet {
    private String name; //wallet has a string name
    private ArrayList<IScan> cards; //any devices (classes) which implement the IScan interface can be added to this arraylist
//    private ArrayList<CreditCard> creditCards;
//    private ArrayList<DebitCard> debitCards;
//    private ArrayList<LoyaltyCard> loyaltyCards;
//    private ArrayList<Ticket> tickets;

    public Wallet(String name) {
        this.name = name;
        this.cards = new ArrayList<IScan>(); //Why do we have to say IScan here but didn't with the Network example?
//        this.creditCards = new ArrayList<CreditCard>();
//        this.debitCards = new ArrayList<DebitCard>();
//        this.loyaltyCards = new ArrayList<LoyaltyCard>();
//        this.tickets = new ArrayList<Ticket>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.cards.size();
    }

    public void addItem(IScan item) { //any devices (classes) which implement the IScan interface can be provided as an argument to this function
        this.cards.add(item);
    }

//    public void addItem(DebitCard item) {
//        this.debitCards.add(item);
//    }
//
//    public void addItem(LoyaltyCard item) {
//        this.loyaltyCards.add(item);
//    }
//
//    public void addItem(Ticket item) {
//        this.tickets.add(item);
//    }
}
