const title = document.getElementById("title");
console.log(title);

const firsInfo = document.querySelector(".info");
console.log(firsInfo.textContent);

const allInfo = document.querySelectorAll(".info");
console.log(allInfo.length);

const greetBtn = document.getElementById("greetBtn");
const output = document.getElementById("output");

greetBtn.addEventListener("click", function(){
    output.textContent = "Hello!";
});

const nameInput = document.getElementById("nameInput");

greetBtn.addEventListener("click", function(){
    const name = nameInput.value;

    if(name === ""){
        output.textContent = "Нэрээ бичнэ үү";
    } else {
        output.textContent = 'Hello, ${name}!';
    }
});