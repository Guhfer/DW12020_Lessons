"use strict";

window.onload = startPage;

function startPage() {
    var button = document.getElementById("button");
    button.addEventListener("click", function(e) {
        var output = document.getElementById("output");
        add(output, e);
    });
    button.addEventListener("click", test);
}

function add(out, event) {

    var n1, n2, soma;
    var output;
    const PI = 3.1465;
    alert(event.type);
    n1 = document.getElementById("fage1").value;
    n2 = document.getElementById("fage2").value;

    if (isNumber(n1) && isNumber(n2)) {
        let a, b; //Variável de escopo
        a = parseInt(n1);
        b = parseInt(n2);
        soma = a + b;
        output = soma;
    } else {
        output = "Valor não é um número";
    }
    out.value = output;
    // document.getElementById("output").value = output;
}

function isNumber(valor) {
    return !isNaN(valor);
}

function test(event) {
    alert("Apertou o botão");
}

function arrayTest() {
    var vector = []; //vetor vazio
    var vector1 = ["batata", "batatinha"];
    alert(vector1.length);

    for (let i = 0; i < vector1.length; i++) {
        alert(vector1[i]);
    }
}

arrayTest();