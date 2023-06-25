$(document).ready(function() {

	let EMPTY = '';

	let tasks = $('.todo-tasks');

	let input = $('.todo-text-ip');

	let btnAdd = $('.todo-add-button');

	let errorMsg = $('.todo-error-message');
	let btnRemove = $('.task-trash');


	btnAdd.on('click', function() {
		let value = input.val().trim();
		if(value){
			let task = `<li class="task">
						<div class="task-cbx">
							<input type="checkbox" unchecked>
						</div>
						<div class="task-content">${value}</div>
						<div class="task-trash"></div>
					</li>`;
			tasks.append(task);
			input.val(EMPTY);
		}
		else {
			makeErrorVisible();
		}
	});
	tasks.on('click', '.task-trash', function() {
		$(this).parent().remove();
	  });
	
	tasks.on('click','.task-cbx input', function(){
		$(this).parent().next().toggleClass('task-done');
	})

	input.on('keyup', function(e){
		let value = input.val().trim();
		if(value){
			makeErrorHidden();
		}
		else{
			makeErrorVisible();
		}
	})

	function makeErrorVisible() {
		errorMsg.css('visibility', 'visible');
	}
	function makeErrorHidden() {
		errorMsg.css('visibility', 'hidden');
	}
});
