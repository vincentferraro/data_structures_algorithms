// Bubble sort

// @Parameter Array
// @Return Array
function BubleSort(array){
    let swapped;
    do{
        swapped=false;
        for(let i = 0; i<array.length-1;i++){
            if(array[i]>array[i+1]){
                let temp = array[i];
                array[i]= array[i+1];
                array[i+1]=temp;
                swapped = true;
            }
        }
    }while(swapped)
}

let arrtest = [9,6,4,3,2,1,5,7,8]

BubleSort(arrtest);
console.log(arrtest);