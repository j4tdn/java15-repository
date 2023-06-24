/*
	using js available callback functions
	+setTimeout
	+setInterval
*/

console.log('=== Ex05 - Callback function ===');
let running = 0;
console.log('running -->' + running);

let intervalLabel = setInterval(function(argument){
	console.log('interval running -->' + (++running));
	if(running === 1){
		clearInterval(intervalLabel);
	}
}, 1000);

let ballGameBtn = document.querySelector('.ball-game');
if(ballGameBtn){
	ballGameBtn.onclick = function() {
		let vh = window.innerHeight;
		let runningBall = setInterval(function(){
			let balloon = document.querySelector('.balloon');
			balloon.style.top = vh-- + 'px';
			console.log(`vh --> ${vh}`);
			if (vh === (0)){
				clearInterval(runningBall);
			}
		}, 2)
	}
}


let remainingSecond = 10;

let timingLabel = document.querySelector('.redirect-after');
if(timingLabel){
	timingLabel.textContent = remainingSecond;
	let timingInterval = setInterval(function(){
		timingLabel.textContent = --remainingSecond;
		if(remainingSecond === 0){
			window.location.href = 'index.html';
			clearInterval(timingInterval);
		}
	}, 1000);
}