package dataStructues.objectOriented.Progression;

public class ArithmeticProgression extends Progression{
    
    private long increment;

    ArithmeticProgression(){ // Don't need super() because Progression constructor default exist
        increment=1;
    }
    ArithmeticProgression(int increment){
        this.increment = increment;
    }
    ArithmeticProgression(int start, int increment){
        super(start);
        this.increment=increment;
    }

    protected void advance(){
        current += increment;
    }

}
