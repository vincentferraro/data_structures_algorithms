// Ascending

function InserstionSort(arr){

    for(let i = 0; i<arr.length;i++){
        let numberToInsert=arr[i];
        let j = i -1;
        while(j>=0 && arr[j]>numberToInsert){
            arr[j+1]= arr[j]
            j=j-1;
        }
        arr[j+1]=numberToInsert;
    }
}

// const arr1 = [ 8, 20, -2, 4, -6];
// InserstionSort(arr1);
// console.log(arr1);


// Descending

function InsertionSort2(arr){
    for(let i = 0; i< arr.length; i++){
        let numberToInsert = arr[i]
        let j = i-1;
        while(j>=0 && arr[j]<numberToInsert){
            arr[j+1]= arr[j];
            j = j-1;
        }
        arr[j+1]= numberToInsert;
    }
}

const arr2 = [-6,4,-2,20,4,8];
InsertionSort2(arr2);
console.log(arr2);