var arr=['A','B','C','D'];
console.log(arr.length);
/* reverse the array*/
console.log("reverse the array");
console.log(arr.reverse());

/*Add element to arr*/
console.log("Add element to array");
arr.push("hello");
console.log(arr);

/*delete last element from array*/
console.log("delete the last element from array");
arr.pop();
console.log(arr);

console.log("get elements from 0 to 2 range");
var r1 =arr.slice(0,2);
console.log(r1);
console.log(" remove elements from 0 to 2 range");
 arr.splice(0,2);
 console.log(arr);

console.log( arr.indexOf('B'));








