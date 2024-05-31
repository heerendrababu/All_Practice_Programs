function fun()
{
    console.log("Welocome to JavaScript");
}
fun();

function add(x,y)
{
  return x+y;
}
var sum =add(5,2);
console.log(sum);

function add(x,y)
{
    var z=0;
    z=x+y;
    console.log('sum of '+x+' ,'+y+'='+z);
    return z;
}
var sum = add(5,5);
console.log(sum);
