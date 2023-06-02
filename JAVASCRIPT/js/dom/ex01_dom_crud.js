let btnAdd = document.querySelector('#btn-add');
let tasks = document.querySelector('#tasks');

tasks.insertBefore(createNewTask('TASK 99'), tasks.children[1]);

btnAdd.onclick = function(event) {
	event.preventDefault();
	let text = document.querySelector('#new-text');
	tasks.appendChild(createNewTask(text.value));
}

function createNewTask(text) {
	let newTask = document.createElement('li');
	newTask.textContent = text;
	newTask.style.color = 'blue';

	let newSpanTask = document.createElement('span');
	newSpanTask.textContent = ' x';
	newSpanTask.style.color = 'red'

	newTask.appendChild(newSpanTask);

	newTask.onclick = function(event) {
		event.target.parentElement.remove();
	}

	return newTask;
}

let xes = document.querySelectorAll('#tasks li span');
for (let x of xes) {
	x.onclick = function(event) {
		event.target.parentElement.remove();
	}
}

let btnPlus = document.querySelector('.plus');
let counter = 0;
btnPlus.addEventListener('click', function() {
	counter = counter + 5;
	console.log('counter: ' + counter);
	document.querySelector('.counter').textContent = counter;
})

btnPlus.addEventListener('click', function() {
	counter = counter + 7;
	console.log('counter: ' + counter);
	document.querySelector('.counter').textContent = counter;
})