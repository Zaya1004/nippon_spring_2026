console.log('Arithmetic and Boolean Operations ' );

const x = 10;
const y = 3;

console.log(x + y);
console.log(x - y);
console.log(x / y);
console.log(x * y);
console.log(x % y);
console.log(x ** y);

// attention
console.log(5 + 3);
console.log("5" + "3");
console.log(5 + "3");
console.log("5" - 3);


// boolean operation
const isActive = true;
const isLoggedIn = false;

console.log(5 > 3); 
console.log(5 === 3)
console.log(5 !== 3);

console.log(5 === '5');
console.log(5 == '5');


// logical operator
console.log(isActive && isLoggedIn);
console.log(isActive && !isLoggedIn);
console.log(isActive || isLoggedIn);
console.log(isActive || !isLoggedIn);
console.log(isLoggedIn || isActive);

// assignment operator
let myNumber = 10;
console.log(myNumber += 5);
myNumber -= 3; //12
myNumber *= 2; 
myNumber /= 4;
console.log(myNumber++);
console.log(myNumber--);
++myNumber; // 5
--myNumber; // 4

console.log(++myNumber);


