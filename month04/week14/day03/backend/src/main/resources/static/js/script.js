const books = [
    { id: 1, title: "Clean Code", author: "Robert Martin", pages: 464 },
    { id: 2, title: "Effective Java", author: "Joshua Bloch", pages: 416 },
    { id: 3, title: "Java Basics", author: "Saraa", pages: 220 },
    { id: 4, title: "Spring Up", author: "Saraa", pages: 310 }
];

function totalPages(books) {
    let sum = 0;
    for (let book of books) {
        sum += book.pages;
    }
    return sum;
}
console.log(totalPages(books));
