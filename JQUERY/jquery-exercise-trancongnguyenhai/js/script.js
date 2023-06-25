$(document).ready(function () {
    $('.todo-tasks').sortable();

    let EMPTY = "";

    let tasks = $('.todo-tasks');

    let input = $('.todo-text-ip');

    let btnAdd = $('.todo-add-button');

    let errorMsg = $('.todo-error-message');

    let taskCbx = $('.task-cbx input[type="checkbox"]');

    btnAdd.on('click', function () {
        let value = input.val().trim();
        if (value) {
            addNewTask(value);
            input.val(EMPTY);
        } else {
            makeErrorVisible();
        }
    })
    input.on('keyup', function (e) {
        let value = input.val().trim();
        if (value) {
            btnAdd.removeAttr('disabled');
            makeErrorHidden();
        } else {
            btnAdd.attr('disabled', true);
            makeErrorVisible();
        }
        if (e.keyCode == 13) {
            btnAdd.click();
        }
    })
    // Not work for new task
    // taskCbx.on('change', function (e) {
    //     $(this).parent().next().toggleClass('task-done');
    // })

    tasks.on('click', '.task-cbx input[type="checkbox"]', function () {
        $(this).parent().next().toggleClass('task-done');
    })

    tasks.on('click', '.task-trash', function () {
        let confirmed = confirm('Are u sure about that?');
        if (confirmed) {
            $(this).parent().remove();
        }
    })

    tasks.sortable();
    // ============= UTIL ===========
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