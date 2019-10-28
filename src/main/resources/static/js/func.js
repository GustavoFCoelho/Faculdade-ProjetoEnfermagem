$(document).ready(function () {
    $(".parte2").hide();
    $(".parte3").hide();

    setTimeout(() => {
        $(".erroClass").hide();    
    }, 5000);
    
})
$("#formpac").submit(function () {
    alert("OEIAU");
    $("#formPac").validate({
        rules: {
            pacname: {
                required: true
            }
        },
        messages: {
            pacname: {
                required: "Preencha o campo"
            }
        }
    })
})
function reveal(parte, esconde, esconde2) {
    $("." + parte).show();
    $("." + esconde).hide();
    $("." + esconde2).hide();
}