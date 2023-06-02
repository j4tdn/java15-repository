/*
 JS Array Demo
 -------------
months -- Array at runtim
-- using Array propertype function

*/
Array.prototype.insert = function(index,element){
	this.splice(index,0,element);
}
console.log('Ex08----------Array')
let months  = [3,4,5,6];
console.log(months);
months.push(7);
console.log('Let\'s try ---> push ' + months);


months.insert(2,555);
console.log('Let\'s try ---> prototype insert ' + months);
var a = 10;
console.log(23/a);