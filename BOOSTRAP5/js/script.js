window.onload = function(){
 showCurrentWidth();
 console.log(window.innerWidth);
}
window.resize =function(){
 showCurrentWidth();
}
function showCurrentWidth(){
	let ww= window.innerWidth;
 document.querySelector('.view-width').textContent = ww + 'px';
}
