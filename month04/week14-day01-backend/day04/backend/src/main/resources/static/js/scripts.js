/// 
const course = "Java Fullsatck";

function printCourse(){
	console.log(course);
}

printCourse();


// function scope
function makeMessage(name){
	const message = 'Hello, ${name}';
	// local scope
	return message;
}
// console.log(message);

// global scope 
const message = "Secret";

function printMessage(){
	console.log(message);
}

console.log(message);

// block scope
if (true){
	const status = "inside block";
	let count = 1;
}

// console.log(status);

// arrow function
const double = (number) => {
	return number * 2;
}

console.log(double(4));

const doubleImplist = number => number * 2

console.log(doubleImplist(4)); //8

const add = (a, b) => a + b;
console.log(add(5, 10)); // 15

const createStudent = (name, score) => ({name, score});
console.log(createStudent("Zaya", 100)); // 

// Array methods
const studentNames = ["Dorjoo", "Saraa", "Boldoo"];
const upperNames = studentNames.map(s => s.toUpperCase());
console.log(upperNames);

// filter method
const scores = [55, 80, 92, 40];
const passingScores = scores.filter(score => score >= 60);
console.log(passingScores);

// reduce method 
let sumScores = 0;

for(let s of scores){
	sumScores += s;
}
console.log(sumScores);

const total = scores.reduce((sum,  score) => sum + score, 0);
console.log(total);

// Exercises
const students = [
    { name: "Bataa", score: 82, program: "java" },
    { name: "Saraa", score: 94, program: "web" },
    { name: "Dorj", score: 58, program: "java" },
    { name: "Naraa", score: 76, program: "web" }
];

// Ex01
function getNames(){
	 return students.map(student => student.name);
}
console.log(getNames(students));

// Ex02
function getPassingStudents(){
	 return students.filter(score => score >= 60);
}
console.log(getPassingStudents().length);

// Ex03 
function averageScore(){
	return 
}


