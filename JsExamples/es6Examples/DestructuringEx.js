const person = 
{
    firstName: 'Hari',
    lastName: 'Krishna',
    age: 35,
    city: 'Bangalore'
  };
  
  //Destructuring person object
  const { firstName, lastName, age: personAge ,city} = person;
  
  //using the destructured variables to print data without using person object ie.,(console.log(person.firstName))
  console.log(firstName); 
  console.log(lastName); 
  console.log(personAge); 
  console.log(city)