// window: global object stores web page's component
window.onload = function () {
    let ww = window.innerWidth
    document.querySelector('.view-width').textContent = ww + 'px';
}

window.onresize = function () {
    showCurrentWidth()
}

function showCurrentWidth() {
    let ww = window.innerWidth;
    document.querySelector('.view-width').textContent = ww + 'px';
}