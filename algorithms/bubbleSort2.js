// Bubble Sort


function BubbleSort(arr){
    let swapped;
    let count = 0;
    do{
        swapped=false;
        for(let i = 0; i< arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                const temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]= temp;
                
                swapped= true;
            }
        }
        count +=1;
    }while(swapped)
    return count;
}

const array = [9,8,2,7,3,4,1,5];
const count = BubbleSort(array);
console.log(array,", count:",count);