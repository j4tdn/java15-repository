$(document).ready(function(){
	$('.welcome').css('color','green')
	$('.welcome').css('font-size','20px')

	$('.wish').addClass('text-bold');

	let regSelectedFileIp = $('.reg-selected-file')
	regSelectedFileIp.on('change', function() {
		let fr = new FileReader();
		let selectedFile = this.files[0];
		if(selectedFile){
			fr.readAsDataURL(selectedFile);
		}
		fr.onload = function(e){
			$('.avatar').attr('src',e.target.result)
		}
		
	})	
	let regButton = $('.button-register')
	regButton.on('click',function(){
		let name = $('.user-name > td > input[type="text"]').val();
		let age = $('.user-age > td > input[type="number"]').val();
		let avatar = $('.user-avatar > img').attr('src');

		console.log('name',name);
		console.log('age',age);
		console.log('img',regSelectedFileIp.files[0]);
	})
})
