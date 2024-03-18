function selectionSort2(arr){

    for(let i = 0; i< arr.length;i++){
        let minInt = i;
        for(let j = i+1; j < arr.length;j++){
            if(arr[j]<arr[minInt]){
                minInt = j;
            }
        }

        // Possible to add If block see Selectionsort.js
        let temp= arr[i];
        arr[i]= arr[minInt];
        arr[minInt]= temp;
    }
}

const array = [9,8,2,7,3,4,1,5];
selectionSort2(array)
console.log(array)