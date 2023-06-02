/*
	JS Array Demo
	-------------
	
	months -- Array at runtim

	-- using Array prototype's function
	-- add futher functions to prototype

*/

Array.prototype.insert = function(idx, element) {
	this.splice(idx, 0, element);
}

console.log('====== EX08 - Array Demo ======');

let months = [3, 4, 5, 6];

console.log(months);

months.push(7);

console.log('lets try --> push ' + months);

months.insert(2, 555);

console.log('lets try --> prototype insert ' + months);
