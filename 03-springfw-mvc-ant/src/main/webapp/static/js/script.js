
highlightNav('/customer', document.querySelector('.nav-customer'));
highlightNav('/stuff', document.querySelector('.nav-stuff'));
highlightNav('/admin', document.querySelector('.nav-admin'));

function highlightNav(navSignature, navTag) {
	window.location.href.includes(navSignature)
	    ? navTag.classList.add('active')
	    : navTag.classList.remove('active');
}