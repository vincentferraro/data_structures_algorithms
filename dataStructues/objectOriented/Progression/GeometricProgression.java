package dataStructues.objectOriented.Progression;

public class GeometricProgression extends Progression{
    
    private long base;

    GeometricProgression(){
        super(1);
        base = 2;
    }
    GeometricProgression(long base){
        super(1);
        this.base = base;
    }
    GeometricProgression(long start, long base){
        super(start);
        this.base = base;
    }

    protected void advance(){
        current *= base;
    }
}


class DemoGeometric{
    public static void main(String[] args) {
        GeometricProgression g1 = new GeometricProgression(2,6);

        g1.printProgression(4);
        
    }
}