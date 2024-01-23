package dataStructues.objectOriented.Progression;

public class Progression {
    protected long current;

    Progression(){
        current= 0;
    }
    Progression(long c){
        current = c;
    }

    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }

    protected void advance(){
        current ++;
    }

    public void printProgression(int n){
        System.out.print(nextValue());
        for(int j=1; j <n; j++){
            System.out.print(" "+ nextValue());
            
        }
        System.out.println();
    }

   
}

class DemoProgression{
    public static void main(String[] args) {
        Progression p = new Progression();
        Progression p2 = new Progression(3);

        p.printProgression(5);
        System.out.println();
        p2.printProgression(10);

    }
}