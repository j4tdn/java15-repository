
highlightNav('/customer', document.querySelector('.nav-customer'));
highlightNav('/stuff', document.querySelector('.nav-stuff'));
highlightNav('/admin', document.querySelector('.nav-admin'));

function highlightNav(navSignature, navTag) {
	window.location.href.includes(navSignature)
	    ? navTag.classList.add('active')
	    : navTag.classList.remove('active');
}

let infoMessageCloseIcon = document.querySelector('.info-message-close');
let infoMessage = document.querySelector('.info-message');

if (infoMessageCloseIcon) {
	infoMessageCloseIcon.onclick = function(e) {
		e.preventDefault();
		infoMessage.classList.add('d-none');
	}
}
