// Дүнгийн нийлбэр ба дундаж

const scores = [85, 90, 78, 92, 88];

let sum = 0; 
for (const score of scores){
    sum += score;
}

const average = sum / scores.length;
console.log(`Нийлбэр: ${sum}`);
console.log(`Дундаж: ${average}`);


// Array-ийн элементүүдийг индексээр хэвлэх
const friuts = ["алим", "банана", "үзэм", "мөрөн", "гүзээлзгэнэ"];

for (let i = 0; i < friuts.length; i ++){
    console.log(`${i + 1}. ${friuts[i]}`);
}

console.log(friuts);


// Элемент нэмэх, хасах
const tastks = ["Ирц бүртгэх", "Хичээлд бэлдэх"];

tastks.push("Дасгал хийх");
console.log(tastks);

tastks.pop();
console.log(tastks);

// Индекс олох
const cities = ["Улаанбаатар", "Дархан", "Эрдэнэт", "Ховд"];

console.log(cities.indexOf("Эрдэнэт"));
console.log(cities.indexOf("Баян-Өлгий"));



// Array Бодлого
// Хамгийн сүүлийн элемент
const numbers = [10, 20, 30, 40, 50];
const last = numbers[numbers.length - 1];
console.log(last);

// Array-ийн элементүүдийг нэмэгдүүлэх
const prices = [1000, 2000, 3000];
const increased = [];

for (const price of prices){
    increased.push(price + 500);
}

console.log(increased);

// Array-ийн элементүүдийг 2-т хуваах
const number = [10, 20, 30, 40, 50];
const halves = [];

for (const number of numbers){
    halves.push(number / 2);
}

console.log(halves);

// Хоёр array-ийг нэгтгэх
const groupA = ["Бат", "Сүх"];
const groupB = ["Дорж", "Ганбат"];
const all = [];

for ( const name of groupB){ 
    all.push(name);
}
for (const name of groupA){
    all.push(name);
}

console.log(all);

// Array-ийн элементүүдийг эсрэг дарааллаар хэвлэх
const letters = ["a", "b", "c", "d"];

for(let i = letters.length - 1; i >= 0; i--){
    console.log(letters[i]);
}

// Дасгал — Дэлгүүрийн жагсаалт
const shoppingList = ["Pen", "Notebook", "Cup", "Coffee", "Pencil"];
shoppingList.push("Key", "Book");
console.log(shoppingList);

const lastThing = shoppingList[shoppingList.length -1 ];
shoppingList.pop();
console.log(lastThing);

for (let i = 0; i < shoppingList.length; i ++){
    console.log(`${i + 1}. ${shoppingList[i]}`);
}

console.log(shoppingList);
console.log(shoppingList.length);

// Оюутны дүнгийн жагсаалт
const score = [100, 90, 75, 80, 66];
let sums = 0;

for (const scor of score){
    sums += scor;
}

const averages = sums / score.length;
console.log(`Нийлбэр: ${sums}`);
console.log(`Дундаж: ${averages}`);

console.log(score.indexOf(100));
console.log(score.indexOf(98));
