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
let isSecond = false;
let first = '';
let second = '';

// add event listener function

seven.addEventListener('click', function () {
    console.log('button seven clicked');
    outputString += 7;
    output.textContent = outputString;
});

one.addEventListener('click', function () {
    console.log('button one clicked');
    outputString += 1;
    output.textContent = outputString;
});

two.addEventListener('click', function () {
    console.log('button two clicked');
    outputString += 2;
    output.textContent = outputString;
});

three.addEventListener('click', function () {
    console.log('button three clicked');
    outputString += 3;
    output.textContent = outputString;
});

four.addEventListener('click', function () {
    console.log('button four clicked');
    outputString += 4;
    output.textContent = outputString;
});

five.addEventListener('click', function () {
    console.log('button five clicked');
    outputString += 5;
    output.textContent = outputString;
});

six.addEventListener('click', function () {
    console.log('button six clicked');
    outputString += 6;
    output.textContent = outputString;
});

eight.addEventListener('click', function () {
    console.log('button eight clicked');
    outputString += 8;
    output.textContent = outputString;
});

nine.addEventListener('click', function () {
    console.log('button nine clicked');
    outputString += 9;
    output.textContent = outputString;
});

zero.addEventListener('click', function () {
    console.log('button zero clicked');
    outputString += 0;
    output.textContent = outputString;
});

plus.addEventListener('click', function () {
    console.log('button plus clicked');
    first = output.textContent;
    isSecond = true;
    if(isSecond){
        output.textContent = '';
        outputString = '';
    } else {
        second = output.textContent;
        const result = first + second;
        output.textContent = result;
    };
});

subtract.addEventListener('click', function () {
    console.log('button subtract clicked');
    outputString += '-';
    output.textContent = outputString;
});

dot.addEventListener('click', function () {
    console.log('button dot clicked');
    outputString += '.';
    output.textContent = outputString;
});

equal.addEventListener('click', function () {
    console.log('button equal clicked');
    outputString += '=';
    output.textContent = outputString;
});

multiply.addEventListener('click', function () {
    console.log('button multiply clicked');
    outputString += '*';
    output.textContent = outputString;
});

division.addEventListener('click', function () {
    console.log('button division clicked');
    outputString += '/';
    output.textContent = outputString;
});

clear.addEventListener('click', function(){
    output.textContent = '';
    outputString = "";
    operator = "";
    first = 0;
});