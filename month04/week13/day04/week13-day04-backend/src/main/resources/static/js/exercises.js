console.log(`Exercises`);

// ex01
const name = "User";

if ( name === "User"){
	console.log('Энгийн хэрэглэгч')
} else if (name === "Admin"){
	console.log('Зөвшөөрөлтэй')
} else {
	console.log('Танихгүй хэрэглэгч"');
}


// ex02
const game = "Minecraft";

switch(game){
	case "Minecraft":
		console.log('Minecraft блок тоглоом');
		break;
	case "PUBG":
		console.log('Буудлагын тоглоом');
	    break;
	case "FIFA":
		console.log('Хөл бөмбөгийн тоглоом');
	    break;
	default:
		console.log('Танихгүй тоглоом');
}

// ex03
for (let i = 0; i < 20; i++){
	if(i % 2 === 0){
		console.log(`${i} ${'Тэгш'}`);
	} else {
		console.log(`${i} ${'Сондгой'}`);
	}
}

// ex04
const arr = ["Хонгор", "Сарнай", "Дорж", "Оюунаа"];
for(let arrey of arr){
	console.log(`${arrey}`);
}

// ex05
let sum = 0;
for(let i = 0; i <= 100; i++){
	sum += i;
}
console.log(sum);

// Дасгал 1 — Оюутны объект
const student = {
	name: "Bat",
	age: 20,
	major: "Computer Science",
	scores: [85, 90, 78]
};

console.log(`${student.name}, ${student,age}, ${student.major}`);

let sums = 0;
for (const score of student.scores){
	sums += score;
}
const average = sum / student.scores.length;
console.log(`Дундаж: ${average}`);

student.email = "bat@example.com";