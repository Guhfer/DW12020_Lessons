"use strict";

function add() {

    var n1, n2, soma;
    const PI = 3.1465;

    n1 = prompt("Digente um número: ");
    n2 = prompt("Digente um número: ");

    if (isNumber(n1) && isNumber(n2)) {
        let a, b; //Variável de escopo
        a = parseInt(n1);
        b = parseInt(n2);
        soma = a + b + PI;
        alert(soma);
    } else {
        alert("Valor não é um número");
    }

}

function isNumber(valor) {
    return !isNaN(valor);
}
