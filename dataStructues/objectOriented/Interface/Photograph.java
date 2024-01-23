package dataStructues.objectOriented.Interface;

public class Photograph implements Sellable {
    
    private String descript;
    private int price;
    private boolean color;

    Photograph(String desc, int pric, boolean col){
        descript = desc;
        price = pric;
        color = col;
    }

    public String description(){
        return descript;
    };

    public int listPrice(){
        return price;
    };

    public int lowestPrice(){return price/2;};

    public boolean isColor(){ return color;}
}
