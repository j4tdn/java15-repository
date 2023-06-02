/*
 Using js available functions
 + Set timeout
 + SetInterval

*/
console.log('============Ex05-Callback Function===========');
let running = 0;
console.log('running --> ' + running);
let intervalLabel =setInterval(function(argument){
	// body ...
	running++;
	console.log('current running -->' + running);
	if(running===10){
		clearInterval(intervalLabel);
	}
},1000);

let ballGameBtn	= document.querySelector('.ball-game');
if(ballGameBtn){
	ballGameBtn.onclick = function(){
		let vh = window.innerHeight;
		let runningBall = setInterval(function(){
			let balloon = document.querySelector('.balloon');
			balloon.style.top = (vh--) + 'px';
			console.log(`vh --> ${vh}`);
			if(vh === (0)){
				clearInterval(runningBall);
			}
		},2);
		console.log(`vh => ${vh}`);
	}
}
let remainingSeconds = 10;

let timingLabel = document.querySelector('.redirect-after');
if(timingLabel){
	timingLabel.textContent = remainingSeconds;
	let timingInterval = setInterval(function(){
		timingLabel.textContent = --remainingSeconds;
		if (remainingSeconds===0) {
		// Redirect to index.html page
			window.location.href =  'index.html';
			clearInterval(timingInterval);
		}
	},1000)
}
