'use strict';
/*
	- Function Declaration
	  var printfi = function printfi(input) {
						console.log('foo bar --> ' + input);
					}
	  var printfe = function printfe() {
						console.log('empty --> foo bar');
					}


	- Function Expression
*/
console.log('====== EX04 - Function ======');

// Everything is object

// - Function Declaration
// Loading --> Initial variables responsible for function declaration (C --> HEADER)
// Runtime --> Body will be loaded then
// Call fd before or after declaration place are OK

printfe();
printfi(random(5, 10));

function printfe() {
	console.log('empty --> foo bar');
}

function printfi(input) {
	console.log('foo bar --> ' + input);
}

function random(inclusiveFrom, inclusiveTo) {
	return inclusiveFrom + Math.round(Math.random() * inclusiveTo);
}

printfe();
printfi(random(5, 10));

// --> ONLY hoisting(initilize vars resp for dec function before running)
// for declaration functions

// - Function Expression
numbers = [1,2,3,4,5];

// Predicate: boolean test(T)
// test --> callback function --> strategy pattern
let filter = function(list, test) {
	let result = [];
	for (let item of list) {
		if (test(item)) {
			result.push(item);
		}
	}
	return result;
}

let isOdd = it => {
	return it % 2 !== 0;
}

let result = filter(numbers, isOdd);

console.log('result: ' + result)

