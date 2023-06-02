/*
JS Scope : LET VAR CONST
-------------------------
*/
console.log('======= Ex06 - Scope ===========');

function sum(){
	let result = 0;
	for(let nber of arguments){
		var xt = 2;
		result += nber * xt;
	}
	console.log('xt-->' + xt);
	return result;
}
console.log('Sum --->' + sum(1,2,3));

/* const for primitive value (STACK) */
let digit = 99;
const digits = [1,2,3,4];
let copiedValue = digits;
digit = 999;
copiedValue[0] = 378;
console.log('digit --->' + digit);
console.log('copiedValue -->' + copiedValue);

