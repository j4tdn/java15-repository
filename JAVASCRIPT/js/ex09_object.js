/*
	EX09: Object Demo
*/

// BEFORE ES5
console.log('====== EX09 - Object Demo ======');

let person = {
	name: 'Daniel',
	age: 18,

	showYourSkills: function() {
		console.log(this.name + ' has HTML/CSS skills');
	}
};
person.weight = 50;

let employee = {
	name: 'Daniel',
	age: 18,
	salary: 20000
};

console.log(person);
console.log(employee);
person.showYourSkills();

console.log('==== FROM ES5 ====');
let People = function(name, yob, skills) {
	this.name = name;
	this.yob = yob;
	this.skills = skills;

	this.showInfo = function() {
		console.log(`${this.name} is ${new Date().getFullYear() - this.yob} years old`);
	}
}
People.prototype.showSkills = function() {
	console.log(`${this.name} has ${this.skills} skills`);
}

let p1 = new People('P1', 1990, 'HTML/CSS/JS');
let p2 = new People('P2', 2001, 'SQL/Java');

p1.showInfo();
p1.showSkills();

p2.showInfo();
p2.showSkills();

console.log('==== FROM ES6 ====');

class Student {
	constructor(id, name, avg) {
		this.id = id;
		this.name = name;
		this.avg = avg;
	}

	showInfo() {
		console.log(this.name + ' has avg point = ' + this.avg);	
	}
}

let st1 = new Student(1, 'An', 8.2);
st1.showInfo();