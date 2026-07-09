const student = {
	name: "Bataa",
	age: 18,
	course: "Java",
	score: 85
};

console.log(student.name);
console.log(student.score >= 60);

function isPassing(){
	return student.score >= 60;
}

function getSummary(){
	return student.name + " - " + student.course + " - " + student.score;
}

console.log(getSummary());
console.log(isPassing());
