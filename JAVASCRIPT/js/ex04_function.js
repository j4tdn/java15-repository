/**
 *  - Function Declaration
 * 
 *    var printfe = function printfe() {
                        console.log('foo bar');
                    }
      var printfi = function printfi(input) {
                        console.log('foo bar --> ' + input);
                    }

 * 
 *  - Function Expresstion
 * 
 */

console.log('====== Ex04 - Function ======');

//  Everything is Object

//  Function Declaration
//  Loading -> Initial variables responsible for function declaration
//  Call fd before or after declaration place

function printfe() {
    console.log('foo bar');
}

function printfi(input) {
    console.log('foo bar --> ' + input);
}

function random(inclusiveFrom, inclusiveTo) {
    return inclusiveFrom + Math.round(Math.random() * inclusiveTo);
}

printfe();
printfi(random(10, 20));

// --> ONLY hoisting(initialize vars resp for dec function before running)
// for declaration function

// Predicate: boolean test(T)
// callback -> callback function --> strategy pattern 
// Function Expresstion
let numbers = [1, 2, 3, 4, 5];

// Predicate: boolean test(T)
let filter = function (list, test) {
    let result = [];
    for (let item of list) {
        if (test(item)) {
            result.push(item);
        }
    }
    return result;
}

let result = filter(numbers, (item) => item % 2 !== 0);


console.log('result: ' + result);
