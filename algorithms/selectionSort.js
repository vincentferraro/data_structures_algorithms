function selectionSort(arr){
    for(let i = 0; i<arr.length;i++){
        let minInt = i;
        for(let j = i+1; j<arr.length;j++){
            if(arr[j]<arr[minInt]){
                minInt=j;
            }

        }
        //swap
        if(minInt!= i){
            let temp=arr[minInt]
            arr[minInt]=arr[i];
            arr[i]=temp;
        }
        
    }
}

const arr2 = [-6,4,-2,20,8];
selectionSort(arr2);
console.log(arr2);