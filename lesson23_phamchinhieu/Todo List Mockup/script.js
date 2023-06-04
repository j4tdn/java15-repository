// $(document).ready(function() {

	
// })
let btnAdd = document.querySelector('#btn-add');
let tasks = document.querySelector('#tasks');

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

