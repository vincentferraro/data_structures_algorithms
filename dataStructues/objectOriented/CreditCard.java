package dataStructues.objectOriented;

public class CreditCard {
    
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    CreditCard(String cus, String ban, String acc, int lim, double bal){
        customer = cus;
        bank = ban;
        account = acc;
        limit = lim;
        balance = bal;
    }
    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);
    }

    public String getCustomer(){
        return customer;
    }

    public String getBank(){
        return bank;
    }

    public boolean charge(double price){
        if(price+ balance > limit){
            return false;
        }
        balance += price;
        return true;
    }

    public void makePayment(double amount){
        balance -= amount;
    }

    public String getAccount(){
        return account;
    }

    public int getLimit(){
        return limit;
    }
    public double getBalance(){
        return balance;
    }

    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer); 
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit);
        }
}

