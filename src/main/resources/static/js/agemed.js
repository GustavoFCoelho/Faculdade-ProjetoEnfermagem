$(document).ready(function () {
    $("#btnLibera1").click(function(){
        $("#horaEve2").show();
        $("#btnLibera1").hide();
        $("#btnLibera2").show();
    });
    
    $("#btnLibera2").click(function(){
        $("#horaEve3").show();
        $("#btnLibera2").hide();
    });
});

function liberadia(variable){
    if(variable){
        $("#DiasSemana").show();
    } else{
        $("#DiasSemana").hide();
    }
}

