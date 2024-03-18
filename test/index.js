const string = "hello"
for(const str of string){
    console.log(str)
}

console.log(string.length)

function merge(w1, w2){
    let arr = []
    let j =0, i=0;
    while(j< w1.length || i < w2.length){
        if(w1[j]!= null){
            arr.push(w1[j])
            j +=1;
        }
        if(w2[i]!= null){
            arr.push(w2[i])
            i +=1;
        }
    }
    console.log(arr)
    return arr.join('')
}

const word = merge("Hello", "worlds")

console.log(word);