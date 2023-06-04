/*
    JS scope: LET VAR const
    --------------------------
*/
console.log('====== Ex06 - Scope ======');

function sum() {
    let result = 0;
    for (let num of arguments) {
        let xt = 2;
        result += (num * xt);
    }
    return result;
}

console.log('sum -> ', sum(1, 2, 3));

console.log('------test const keyword------');

const digit = 99;
// digit = 1; // wrong

const digits = [1, 2, 3, 4];
let copy = digits;

copy[1] = 999;
console.log(digits);

