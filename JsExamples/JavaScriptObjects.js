var student ={
    id : "1",
    name : "Heerendra",
    age : 5,

    read: function()
    {
        console.log("Heerendra is reading");
    },
    write: function()
    {
        console.log("Heerendra is writing the code");
    }
};
console.log(student);
console.log(student.read());
console.log(student.write());

/* we can strore array elements also*/
var student1 =
{
    id : 2,
    name : "Babu",
    age : 24,
    marks : [70,75,80]
};
console.log(student1);
console.log(student1.marks);
console.log(student1.marks[0]);


console.log("creating an object inside an object: ")
var student=
{
    id: 3,
    name:"jagadeesh",
    marks:{english: 70,maths: 65}
};
console.log(student.id);
console.log(student.marks.english);