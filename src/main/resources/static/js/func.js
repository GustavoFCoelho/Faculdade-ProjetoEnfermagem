$(document).ready(function () {
    $(".parte2").hide();
    $(".parte3").hide();
    $("#horaEve2").hide();
    $("#horaEve3").hide();
    $("#btnLibera2").hide();
    $("#DiasSemana").hide();
});

function reveal(parte, esconde, esconde2) {
    $("." + parte).show();
    $("." + esconde).hide();
    $("." + esconde2).hide();
}



