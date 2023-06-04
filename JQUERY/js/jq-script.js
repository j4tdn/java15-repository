$(document).ready(function () {
    $('.welcome').css('color', 'green')
        .css('font-size', '22px');

    $('.wish').addClass('text-bold');

    /*register form*/
    let filename = 'businessman.avif';
    let regSelectedFileIp = $('.reg-selected-file');
    regSelectedFileIp.on('change', function () {
        let fr = new FileReader();
        let selectedFile = this.files[0];
        if (selectedFile) {
            filename = selectedFile.name;
            fr.readAsDataURL(selectedFile);
        }
        fr.onload = function (e) {
            // e.target
            // result --> data:image/png;base64,iVBORw
            $('.avatar').attr('src', e.target.result);
        }
    })

    let regButton = $('.button-register');
    regButton.on('click', function () {
        let name = $('.user-name>td>input[type="text"]').val();
        let age = $('.user-age>td>input[type="number"]').val();
        let img = $('.user-avatar>img').attr('src');
        console.log('name --> ' + name);
        console.log('age --> ' + age);
        console.log('img --> ' + filename);
    })

    let toggleButton = $('.button-toggle');
    toggleButton.on('click', function () {
        $('.block-toggle').toggleClass('visible');
    });
})