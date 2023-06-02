// Function Declaration
/**
 * var printf = function printf(){
	console.log('foo bar');
	}
 * var printe =  function printfe(input){
	console.log('foo bar ' + input);
	}
 */
function printf(){
	console.log('foo bar');
}
function printfe(input){
	console.log('foo bar ' + input);
}
function random(inclusiveFrom,inclusiveTo){
	return inclusiveFrom + Math.round(Math.random()*inclusiveTo);
}
printf();
printfe('Hello');
console.log(random(5,10))

// Function Expression

 numbers = [1,2,3,4,5];

let filter = function(list , test){
	let result = [];
	for(let item of list){
		if(test(item)){
			result.push(item);
		}
	}
	return result;
}
let isOdd = function(it){
	return it%2 !== 0;
}
let result = filter(numbers, isOdd )
console.log(result);