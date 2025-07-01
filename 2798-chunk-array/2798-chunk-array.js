/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const chunks=[];
    for(let i=0;i<arr.length;i+=size){
        const chunck=[];
        for(let j=i;j<i+size&&j<arr.length;j++){
            chunck.push(arr[j]);
        }
        chunks.push(chunck);
    }
    return chunks;
};
