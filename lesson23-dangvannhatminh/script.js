$(document).ready(function() {
	$('.add-btn').on('click', function(e){
		e.preventDefault();
		let listTask = $('.list-task');
		let inputTask = $('.task-content');
		if(!inputTask.val()){
			alert("Enter value please");
		} else {
			listTask.append(`<li>
				<div class="box-check">
					<input type="checkbox"></div>
				<div class="item-name">${inputTask.val()}</div>
				<div class="del-btn">
					x
				</div> 
			</li>`);
		}	
		$('.list-task li::last-child').on('click', function(){
			event.target.parentElement.remove();
		})
	})
	let itemTasks = document.querySelectorAll(".list-task li .del-btn");

	for(let x of itemTasks){
		x.onclick = function() {
			event.target.parentElement.remove();
		}
	}
})