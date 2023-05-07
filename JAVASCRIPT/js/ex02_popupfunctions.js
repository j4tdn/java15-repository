/*
	void   : alert     --> popup a text
	boolean: confirm   --> yes/no question
	string : prompt    --> question
	*/

console.log('====== EX02 - Popup Functions ======');

	let btnPopupGame = document.querySelector('.popup-game');
	btnPopupGame.onclick = function() {
		let expectedJs = confirm('Do You want to LEARN JS from Scratch ?');
		if (expectedJs) {
			pgame();
		}

	}

	function pgame() {
		let fname = prompt('Please fill You fullname here, thanks');

		let expectedIQ = confirm(`Hello '${fname}', Would You like to play the IQ Tests ?`)

		if (expectedIQ) {
			// guese random number from a to b
			let a = 10 + Math.round(Math.random() * 11);
			let b = 10 + Math.round(Math.random() * 11);

			let expected = prompt('Please guess sum of A & B is "odd" or "even"');
			
			let actual = (a + b) % 2 === 0 ? 'even' : 'odd';

			console.log(`expected ${expected}, actual ${actual} --> ${a + b}`)

			alert((expected === actual) ? 'You are correct, congratz ....' : 'Oops :-(')

			alert('--> -_- Great to see You here, bye bye -_- <--');
		}
}