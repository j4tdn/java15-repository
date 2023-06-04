let btnAdd = document.querySelector('#btn-add');
let tasks = document.querySelector('#tasks');
tasks.insertBefore(createNewTask('TEST task'), tasks.children[1]);

btnAdd.onclick = function (e) {
    // console.log(e);
    e.preventDefault(); //javascript:void(0)
    let text = document.querySelector('#new-text');
    tasks.appendChild(createNewTask(text.value));
}

function createNewTask(text) {
    // text = document.querySelector('#new-text');
    let newTag = document.createElement('li');
    newTag.textContent = text;
    newTag.style.color = 'blue';
    let newSpanTask = document.createElement('span');
    newSpanTask.textContent = ' x';
    newSpanTask.style.color = 'red';
    newTag.appendChild(newSpanTask);
    return newTag;
}

let xes = document.querySelectorAll('#tasks li span');
for (let x of xes) {
    x.onclick = function (e) {
        e.target.parentElement.remove();
    }
}

// onclick và addEventListener: 
// onlick : khi dùng onclick thì đồng nghĩa việc override lại thuộc tính
// onlick có sẵn trong html
// addEventListener thì thêm nhiều lần click

let btnPlus = document.querySelector('.plus');
let count = 0;

btnPlus.addEventListener('click', function () {
    count = count + 5;
    console.log('counter: ' + count);
    document.querySelector('.counter').textContent = count;
})

// btnPlus.onclick = function () {
//     count = count + 5;
//     console.log('counter: ' + count);
//     document.querySelector('.counter').textContent = count;
// }

btnPlus.addEventListener('click', function () {
    count = count + 7;
    console.log('counter: ' + count);
    document.querySelector('.counter').textContent = count;
})

// btnPlus.onclick = function () {
//     count = count + 7;
//     console.log('counter: ' + count);
//     document.querySelector('.counter').textContent = count;
// }



