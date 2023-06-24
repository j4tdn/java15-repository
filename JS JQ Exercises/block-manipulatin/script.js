window.onload = function() {
	let rotateDeg = 0;
	let scaleValue = 0;
	let opacityValue = document.querySelector("#opacity-value");

	// movable
	let block = document.querySelector('#block');

	let posY = document.querySelector("#pos-y");
	let posX = document.querySelector("#pos-x");
	let size = document.querySelector("#size");
	let opacity = document.querySelector("#opacity");

	let shapeOkButton = document.querySelector("#shape-ok");
	let shapeSelect = document.querySelector("#shape-select");
	let hex = document.querySelector("#hex");

	let rgbRed   = document.querySelector('#rgba-r');
	let rgbGreen = document.querySelector('#rgba-g');
	let rgbBlue  = document.querySelector('#rgba-b');
	let rgbAlpha = document.querySelector('#rgba-a');
	let rgbIps   = document.querySelectorAll('.rgba-container>input');

	posY.onchange = function() {
		let posYValue = document.querySelector("#pos-y-value");
		posYValue.textContent = posY.value;
		block.style.top = posY.value + 'px';
	}

	posX.onchange = function() {
		let posXValue = document.querySelector("#pos-x-value");
		posXValue.textContent = posX.value;
		block.style.left = posX.value + 'px';
	}

	size.onchange = function() {
		let sizeValue = document.querySelector("#size-value");
		sizeValue.textContent = size.value;
		scaleValue = size.value;
		block.style.transform = 'rotate(' + rotateDeg + ') scale(' + scaleValue + ')';
	}

	opacity.onchange = function() {
		opacityValue.textContent = opacity.value;
		block.style.opacity = opacity.value;
		rgbAlpha.value = opacity.value;
	}

	shapeOkButton.onclick = function() {
		let option = shapeSelect.value;
		if (option === 'square') {
			rotateDeg = 0;
			scaleValue = size.value;

			block.style.borderRadius = '0';
			block.style.transform = 'rotate(' + rotateDeg + ') scale(' + scaleValue + ')';
		} else if (option === 'circle') {
			block.style.borderRadius = '50%';
		} else if (option === 'rhombus') {
			rotateDeg = '45deg';
			scaleValue = size.value;
			
			block.style.borderRadius = '0';
			block.style.transform = 'rotate(' + rotateDeg + ') scale(' + scaleValue + ')';
		}
	}

	hex.onkeypress = function(event) {
		if (event.which === 13) {
			block.style.background = '#' + hex.value;
			hex.value = '';
		}
	}

	// Thực hiện khi thoát khỏi input và input có thay đổi giá trị
	hex.onchange = function(event) {
		block.style.background = '#' + hex.value;
		hex.value = '';
	}

	for (let rgbIp of rgbIps) {
		rgbIp.onchange = function () {
			block.style.background = `rgba(${rgbRed.value}, ${rgbGreen.value}, ${rgbBlue.value}, ${rgbAlpha.value})`; 
			hex.value = rgbToHex(rgbRed.value, rgbGreen.value, rgbBlue.value);
			opacity.value = rgbAlpha.value;
			opacityValue.textContent = rgbAlpha.value;
		}
	}

	function rgbToHex(r, g, b) {
	  return toHex(r) + toHex(g) + toHex(b);
	}

	function toHex(ip) {
	  var hex = ip.toString(16);
	  return hex.length == 1 ? "0" + hex : hex;
	}
}