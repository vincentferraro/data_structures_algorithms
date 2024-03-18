function InsertionSort2(arr){

    for(let i = 1; i < arr.length; i++){
        let numberToInsert = arr[i];
        let j = i-1;
        while(j >=0 && arr[j]>numberToInsert){
            arr[j+1]=arr[j]
            j -=1;
        }
        arr[j+1]=numberToInsert;
    }
}

const array = [9,8,2,7,3,4,1,5];

InsertionSort2(array);
console.log(array);