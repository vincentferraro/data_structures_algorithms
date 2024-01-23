package algorithms;

public class InsertionSort {
    
    public void insertionSort(char [] data){
        int n = data.length;
        for(int k = 1; k<n; k++){
                char cur = data[k];
                int j = k;
                while(j>0 && data[j-1]>cur){
                    data[j]=data[j-1];
                    j--;
                }
                data[j]=cur;
            
        }
    }
    
}

class DemoInsertionSor{
    public static void main(String [] args){
        char [] arr = {'b','c','d','a','h','g','f'};

        System.out.println("Not sorted");
        for(char a : arr){
            System.out.print(a +" ");
        }
        InsertionSort p = new InsertionSort();
        p.insertionSort(arr);
        System.out.println();
        System.out.println("Sorted");
        for(char a : arr){
            System.out.print(a +" ");
        }
        System.out.println();

    }
}