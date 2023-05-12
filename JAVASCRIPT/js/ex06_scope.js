/*
	JS Scope: let var const
*/
console.log('=== Ex06 - Scope ===');

function sum() {
	let result = 0;
	for(let nber of arguments) {
		var xt = 2;

		//usage
		result += (nber *xt);
	}

	console.log('xt --> ' + xt);
	return result;
}

console.log('sum --> ' + sum(1, 2, 3));

console.log('testing const/final keyword');

/* const fot primitive value (Stack) */

let digit = 99;
const digits = [3, 5, 7 ,9];
let copiedValues = digits;

digit = 999;
copiedValues[1] = 7777;

console.log('digit --> ' + digit);
console.log('digits --> ' + digits);
