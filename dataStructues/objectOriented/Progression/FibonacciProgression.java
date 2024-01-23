package dataStructues.objectOriented.Progression;

public class FibonacciProgression extends Progression{
    private long previous;

    FibonacciProgression(){
       super(1); 
       previous =1;
    }
    FibonacciProgression(long first, long second){
        super(first);
        previous = second - first;
    }

    protected void advance(){
        long temp= previous;
        previous = current;
        current += temp;

    }
}

class DemoFib{
    public static void main(String[] args) {
        FibonacciProgression f1 = new FibonacciProgression();
        FibonacciProgression f2 = new FibonacciProgression(4,6);

        f1.printProgression(5);
        f2.printProgression(5);
    }
}
