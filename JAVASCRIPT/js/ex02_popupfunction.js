/*
    void    : alert     --> popup a text 
    boolean : confirm   --> yes/no question
    string  : prompt    --> question

*/
let btnPopupGame = document.querySelector('.popup-game');
btnPopupGame.onclick = function () {
    let question = confirm('Do you want to learn JS from Scratch?');
    if (question) {
        pgame();
    }
}

function pgame() {
    let fname = prompt('Please fill your fullname here, thanks');

    let answers = confirm(`Hello ${fname}, Would you like to play game?`)

    if (answers) {
        let from = 10 + Math.round(Math.random() * 91);
        let to = 10 + Math.round(Math.random() * 91);

        let submit = prompt('Please guess sum of A and B is "odd" or "even"');

        let result = (from + to) % 2 === 0 ? 'even' : 'odd';
        console.log(result);

        alert((submit === result) ? 'RIGHT' : 'WRONG');
    }
    alert("Bye fen");
}
