/*
	JS standard syntax: ECMAScript

	Loosely & Dynamic language/type
	Data Structure: Number, String, Boolean ...

	Scope: var, const, let
	+ let, const: block scope
	+ var: function scope
*/

let v = 'welcome';
console.log('v1 --> ' + v + ' --> ' + (typeof v))

v = 752023;
console.log(`v2 --> ${v} --> ${typeof v}`)

v = true;
console.log(`v3 --> ${v} --> ${typeof v}`)

v = null;
console.log(`v4 --> ${v} --> ${typeof v}`)

v = new Date();
console.log(`v5 --> ${v} --> ${typeof v}`)
