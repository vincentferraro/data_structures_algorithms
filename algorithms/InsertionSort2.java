package algorithms;

public class InsertionSort2 {
    
    public void insertionSort2(int [] data){
        
        for(int i= 1; i< data.length; i++){
            int cur = data[i];
            int j = i;
            while(j>0 && data[j-1]>cur){
                data[j]=data[j-1];
                j--;
            }
            data[j]=cur;
        }
    }
}

class DemoInsertion2{
    public static void main(String[] args) {
        int [] nums = {2,3,1,4,9,6,7,5,8,10};

        InsertionSort2 ins= new InsertionSort2();

        System.out.println("Not sorted");
        for(int n : nums){
            System.out.print(n+ " ");
        }
        System.out.println();

        
        ins.insertionSort2(nums); // INSERTION SORT HERE

        System.out.println("Sorted");
        for(int n : nums){
            System.out.print(n+ " ");
        }
        System.out.println();
    }
}