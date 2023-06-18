$(document).ready(function() {

	let EMPTY = '';

	let tasks = $('.todo-tasks');

	let input = $('.todo-text-ip');

	let btnAdd = $('.todo-add-button');

	let errorMsg = $('.todo-error-message');

	btnAdd.on('click', function() {
		let value = input.val().trim();
		if(value) {
			addNewTask(value);
			input.val(EMPTY);
		} else {
			makeErrorVisible();
		}
	})

	input.on('keyup', function(e) {
		let value = input.val().trim();
		if(value) {
			btnAdd.removeAttr('disabled')
			makeErrorHidden();
		} else {
			btnAdd.attr('disabled', true);
			makeErrorVisible();
		}

		if (e.keyCode === 13) {
			btnAdd.click();
		}
	})

	tasks.on('click', '.task-cbx input', function() {
		// $(this) = e
		$(this).parent().next().toggleClass('task-done');
	});

	tasks.on('click', '.task-trash', function() {
		let confirmed = confirm('Are You sure You want to delete this TASK ?');
		if (confirmed) {
			$(this).parent().remove();
		}
	});


	tasks.sortable();

	/*================== UTILITY METHODS =====================*/

	function addNewTask(inputValue) {
		let task = `<li class="task">
						<div class="task-cbx">
							<input type="checkbox" unchecked>
						</div>
						<div class="task-content">${inputValue}</div>
						<div class="task-trash"></div>
					</li>`;
		tasks.append(task);
	}

	function makeErrorVisible() {
		errorMsg.css('visibility', 'visible');
	}

	function makeErrorHidden() {
		errorMsg.css('visibility', 'hidden');
	}
})

