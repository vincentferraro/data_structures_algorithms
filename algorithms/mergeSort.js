function mergeSort(array){  // Function signature
    if(array.length < 2){
        return array;
    }

    let middle = Math.floor(array.length/2);
    let arrayLeft = array.slice(0,middle);
    let arrayRight = array.slice(middle);

    return merge(mergeSort(arrayLeft),mergeSort(arrayRight));
}

function merge(arrayLeft, arrayRight){
    let arraySorted = [];

    while(arrayLeft.length && arrayRight.length){
        if(arrayLeft[0]<=arrayRight[0]){
            arraySorted.push(arrayLeft.shift())
        }else {
            arraySorted.push(arrayRight.shift())
        }
    }

    return [...arraySorted, ...arrayLeft, ...arrayRight]
}

const array = [9,8,2,7,3,4,1,5];

console.log(mergeSort(array));