document.addEventListener("DOMContentLoaded", evt => {
    document.querySelectorAll(".char-control").forEach(el => {
        el.addEventListener("input", e =>{
            let element = e.target;
            console.log(element.value.length);
            if(element.value.length > 255){
                let p = document.createElement("p");
                p.style.fontSize = "12px";
                p.style.color = "red";
                p.textContent = "Atingido número máximo de caracteres(255)";
                if(element.parentElement.lastChild.previousSibling != element){
                    element.parentElement.insertBefore(p, element.nextSibling);
                }
            } else {
                if(element.parentElement.lastChild.previousSibling == element) {
                    element.parentElement.lastChild.remove();
                }
            }
        })
    });

    document.querySelector(".gen-pdf").addEventListener("click", evnt =>{
        var printWindow = window.open('', '', 'height=400,width=800');
        printWindow.document.write('<html><head><link href="/css/bootstrap.min.css" rel="stylesheet"/>');
        printWindow.document.write('</head><body >');
        printWindow.document.write(document.querySelector(".card").innerHTML);
        printWindow.document.write('</body></html>');
        printWindow.document.close();
        setTimeout(()=>{
            printWindow.print();
        }, 1000)
    })
});