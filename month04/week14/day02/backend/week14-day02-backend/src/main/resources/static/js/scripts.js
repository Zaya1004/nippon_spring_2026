console.log('Javascript Functions');

// alert("This is alert");

const result = prompt("What is your name?");

prompt("This is prompt");

// code
// function declaration
function greet(name) {
    return 'Hello, my name is ${name}';
}



// function call
console.log(greet(result));


function add(a, b) {
    return a + b;
}

console.log(add(5, 6));

function introduce(name, age) {
    console.log(`My name is ${name} and i'm ${age} years old`);

}

introduce("Zaya", 21);

function printSum(a, b) {
    console.log(a + b);
}

const printSumResult = printSum(5, 6);
console.log(printSumResult); // undefined

// function expression
const minus = function(a, b) {
    return a - b;
}
console.log(minus(10, 5));

// arrow function expression
const substract = (a, b) => {
    return a - b;
}
console.log(substract(10, 6));

// Exercises
function divide(a, b) {
    console.log(a / b);
}
divide(10, 2);

function multiply(a, b) {
    console.log(a * b);
}
multiply(2, 3);


const power = function(a, b) {
    for (let i = 0; i <= b; i++) {
        a += a;
    } return a;
}
console.log(power(8, 2));



const circleArea = (r) => {
    return Math.PI * (r * r);
}
console.log(circleArea(2));



// Object Literal
// name, age => keys
// Sarah, 10 => values
// Javascript object notation
console.log("=====================");
console.log("Object Literal");

const student = {
	name: "Sarah",
	age: 10
};

console.log(student);

const mixedObject = {
	name: "Dog",
	gender: 'male',
	age: 5,
	isBig: false,
	weight: 5.6, 
	kids: ["Shiro", "Kuro", "Ao", "Aka"]
};

console.log(mixedObject);
// dot notation
console.log(mixedObject.age);

const complicateObject = {
	"high-grade": 95,
	"low-grade": 45
}
console.log(complicateObject["high-grade"]);

mixedObject.name = "cat";
console.log(mixedObject.name);

complicateObject["high-grade"] = 85;
console.log(complicateObject["high-grade"]);

const funcObject = {
	name: "Bird",
	color: "Black",
	say: function(){
		console.log("Guag Guag");
	}
}
funcObject.say();

// difference of function expression VS function declaration

printMe();

function printMe(){
	console.log("Hello");
}

printMe();

// console.log(a);
const a = 6;


const printMeFunc = function(){
	console.log("hello");
}

printMeFunc;

// Guided Exercises
// Ex01
function max(a, b){
	if(a > b){
		return a;
	} 
	return b;
}
console.log(max(5,2));

// Ex02
function gradeLabel(score){
	if (score >= 90) return "A";
	if (score >= 80) return "B";
	if (score >= 70) return "C";
	if (score >= 60) return "D";
	return "F";
}

console.log(gradeLabel(55));

// Ex03
function createStudent(name, score){
	return {
		name, 
		score, 
		passed: score >= 60
	};
}

console.log(createStudent("Zaya", 90));

// Ex04
function studentLabel(students){
	return `${students.name} - ${students.score}`;
}
console.log(studentLabel("Zaya", 90));




