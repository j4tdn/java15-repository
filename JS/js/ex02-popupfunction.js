let btn = document.querySelector('.popup-game');
btn.onclick = function(){
	let expectedJS = confirm('Do you want to learn JavaScript ?');
	if (expectedJS) {
		pgame();
	}
	
}
function pgame(){
	
	let fname = prompt('Please fill Your Fullname here, thanks');
	let expectedIQ	= confirm(`Hello '${fname}', Would you like to play IQ tests`)
	if (fname = 'null'){
	alert('It is great to see you here , Good bye')
	} else 
	if (expectedIQ) {
		let a = 10 + Math.round(Math.random()*11);
		let b = 10 + Math.round(Math.random()*11);
		let expected = prompt('Please guess sum of A & B is "odd" or "even" -->');
		let actual = (a + b) % 2 === 0 ? 'even' : 'odd';
		console.log(`expected ${expected} , actual ${actual} --> ${a+b}`);
		alert((expected===actual)? 'You are correct , congrats':'Oops :(')
	}  
}