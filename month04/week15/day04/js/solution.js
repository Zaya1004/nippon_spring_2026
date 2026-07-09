const buttonSeven = document.querySelector('#seven');

const buttons = document.querySelectorAll("button");
console.log(buttons);

const one = buttons[8];
const two = buttons[9];
const three = buttons[10];
const four = buttons[4];
const five = buttons[5];
const six = buttons[6];
const seven = buttons[0];
const eight = buttons[1];
const nine = buttons[2];
const plus = buttons[15];
const subtract = buttons[11];
const dot = buttons[13];
const equal = buttons[14];
const zero = buttons[12];
const multiply = buttons[3];
const division = buttons[7];
const clear = buttons[16];

// output
const output = document.querySelector("#output");

let outputString = "";
let first = '';
let operator = ""; 

// add event listener function

function appendumber(num) {
    outputString += num;
    output.textContent = outputString;
}

zero.addEventListener('click', function () {
    appendumber(0);
});

one.addEventListener('click', function () {
    appendumber(1);
});

two.addEventListener('click', function () {
    appendumber(2);
});

three.addEventListener('click', function () {
    appendumber(3);
});

four.addEventListener('click', function () {
    appendumber(4);
});

five.addEventListener('click', function () {
    appendumber(5);
});

six.addEventListener('click', function () {
    appendumber(6);
});

seven.addEventListener('click', function () {
    appendumber(7);
});

eight.addEventListener('click', function () {
    appendumber(8);
});

nine.addEventListener('click', function () {
    appendumber(9);
});


// operators 
function chooseOperator(op){
    if(outputString === "") return;
    first = parseFloat(outputString);
    operator = op;
    outputString = "";
}
plus.addEventListener('click', function () {
    chooseOperator("+");
});

subtract.addEventListener('click', function () {
     chooseOperator("-");
});

dot.addEventListener('click', function () {
   if(outputString.includes(".")){
    appendumber(".");
   }
});

equal.addEventListener('click', function () {
   if(operator === "" || outputString === "") return;

   let second = parseFloat(outputString);
   let result = 0;

   switch(operator){
    case "+":
        result = first + second;
        break;
    case "-":
        result = first - second;
        break;
    case "*":
        result = first * second;
        break;
    case "/":
        result = first / second;
        break;
    default:
    break;
   }

   output.textContent = result;
   outputString = result.toString();
   operator = "";
});

multiply.addEventListener('click', function () {
     chooseOperator("*");
});

division.addEventListener('click', function () {
    chooseOperator("/");
});


clear.addEventListener('click', function(){
    output.textContent = '';
    outputString = "";
    operator = "";
    first = 0;
});