package dataStructues.objectOriented.Interface;

public class BoxedItem implements Sellable, Transportable {
    private String descript;
    private int price;
    private int weigh;
    private boolean haz;
    private int width=0;
    private int height=0;
    private int depth=0;

    BoxedItem(String desc, int p, int w, boolean h){
        descript = desc;
        price = p;
        weigh = w;
        haz = h;
    }

    public String description(){
        return descript;
    };

    public int listPrice(){
        return price;
    };

    public int lowestPrice(){
        return price/2;
    };

    public int weight(){
        return weigh;
    };

    public boolean Hazardous(){
        return haz;
    };

    public int insuredValue(){
        return price *2;
    }

    public void setBox(int w, int h, int d){
        width=w;
        height=h;
        depth=d;
    }

}
