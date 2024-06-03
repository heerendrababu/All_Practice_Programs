class test
{
    constructor()
    {
        console.log("i'm an constructor");
    }
}
new test(); /* constructor call is implicit call when we create object for class it is automatically invoked*/


class Test2
{
    constructor(num1,num2)
    {
        this.num1 = num1;
        this.num2 = num2;
        console.log("hii");
    }
    addition()  /* it is normal method not a function because we didn't use function key word */
    {
       console.log(this.num1+this.num2);
    }
}
/* new Test2(10,20).addition();  (or) to print addition data we need to call it with Test2 class object reference (or) we can call object.addition()  */

console.log("calling addition method with Test2 object reference");
let ref = new Test2(10,50);
ref.addition();


/* 3rd Example */
class Person {
    constructor(name, age) 
    {
        this.name = name;
        this.age = age;
    }

    /*method*/
    details() {
        console.log("Hi, my name is " + this.name + " and my age is " + this.age + ".");
    }
}

class Employee extends Person
 {
    constructor(name, age, jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    ChildMethod() {
        super.details();
        console.log("I work as a " + this.jobTitle);
    }
}

let eref = new Employee('Heerendra', 24, 'Software Engineer');
eref.ChildMethod();


