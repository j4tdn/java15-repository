/*
    Using available callback function
    * setInterval
    * setTimeout
*/


console.log('====== Ex05 - Callback Function ======');

// let running = 0;
// console.log('running --> ', running);

// let intervaLabel = setInterval(function (argument) {
//     console.log('current running --> ', ++running);
//     if (running === 10) {
//         clearInterval(intervaLabel);
//     }
// }, 1000);

let ballGameButton = document.querySelector('.ball-game')
if (ballGameButton) {
    ballGameButton.onclick = function () {
        let vh = window.innerHeight;
        let runningBall = setInterval(function () {
            let balloon = document.querySelector('.balloon');
            balloon.style.top = vh-- + "px";
            if (vh === -75) {
                clearInterval(runningBall);
            }
        }, 5);
    }
}

let remainingSeconds = 10;
let timingLabel = document.querySelector('.redirect-after');
if (timingLabel) {
    timingLabel.textContent = remainingSeconds;
    let remainingSecondsLabel = setInterval(function () {
        timingLabel.textContent = --remainingSeconds;
        if (remainingSeconds === 0) {
            // redirect to index.html page
            window.location.href = '../index.html';
            clearInterval(remainingSecondsLabel);
        }
    }, 1000);
}

