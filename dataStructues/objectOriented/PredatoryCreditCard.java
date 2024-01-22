package dataStructues.objectOriented;

public class PredatoryCreditCard  extends CreditCard{
    
    private double apr;

    PredatoryCreditCard(String cus, String ban, String acc, int lim, double bal, double rate){
        super(cus,ban,acc,lim,bal);
        this.apr = rate;
    }

    public double getApr(){
        return apr;
    }
    public void processMonth(){
        if(balance > 0){
            double monthlyFactor = Math.pow(1+apr,1.0/12);
            balance *= monthlyFactor;
        }
    }

    public boolean charge(double price){
        boolean isSuccess = super.charge(price);
        if(!isSuccess){
            balance +=5;
        }
        return isSuccess;
    }

}
