package dataStructues.objectOriented;

public class Polymorphism {
    public static void main(String[] args) {
        CreditCard card = new PredatoryCreditCard("vinc", "desjardins", "38F", 500, 0, 0.02);

        // card.getApr(); // Error

        card.printSummary(card);
    } 
}
