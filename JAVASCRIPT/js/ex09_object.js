/**
 *  Ex09: Object Demo
 *  Composision design pattern: tạo các base class 
 *  Before ES5
 */
console.log('======Ex09 - Object demo=======')

let person = {
    name: 'Hai',
    age: 20,

    showYourSkills: function () {
        console.log(this.name + ' has HTML/CSS skill');
    }
};

person.weight = 90;
person['height'] = 180;

let employee = {
    name: 'Min',
    age: 21,
    salary: 20000
};

console.log(person);
console.log(employee);
person.showYourSkills();

// From ES5

// FROM ES5
let People = function (name, yob, skills) {
    this.name = name;
    this.yob = yob;
    this.skills = skills;

    this.showInfo = function () {
        console.log(`${this.name} is ${new Date().getFullYear() - this.yob} years old`);
    }
}

People.prototype.showYourSkills = function () {
    console.log(this.skills)
}

let p1 = new People('P1', '1990', 'HTML/CSS/JS');
let p2 = new People('P2', '1991', 'SQL/Java');

console.log(p1);
console.log(p2);

p1.showInfo();
p2.showInfo();

p1.showYourSkills();
p2.showYourSkills();

console.log('=========FROM ES6=========');

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

let st1 = new Student(1, 'Hai', 8.2);
st1.showInfo();
