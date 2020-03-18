"use strict";

// window.onload = startPage;

// function startPage() {
//     var button = document.getElementById("botao");
//     button.onclick = generateNumber;
// }
window.onload = () => {
    var button = document.getElementById("botao");
    button.onclick = generateNumbers;
};

function generateNumbers() {
    var min, max;
    var elementOut;

    min = document.getElementById("min").value;
    max = document.getElementById("max").value;
    elementOut = document.getElementById("res");

    if (!isNaN(min) && !isNaN(max)) {
        min = parseInt(min);
        max = parseInt(max);
        if (min <= max) {
            let arrayNum = [];
            const TOTAL = 10;

            for (let i = 0; i < TOTAL; i++) {
                arrayNum.push(generateNumber(min, max));
            }

            elementOut.value = arrayNum.sort((x, y) => x - y);

            /*
             Se o retorno for negativo então x < y
             Se o retorno for positivo então x > y
             Se o retorno for 0 então x == y
            */
            elementOut.value = arrayNum.join(" ");

            // var text = "";
            // arrayNum.forEach(function (value) {
            //     if(value % 2 === 0) {
            //         text += value + "\n"
            //     }
            // });

            var text = "";
            arrayNum.forEach((value) => {
                if(value % 2 === 0) {
                    text += value + "\n ";
                }
            });

            alert(text);

        } else {
            elementOut.value = "Valor minimo inserido está maior que o máximo";
        }

    } else {
        elementOut.value = "Valor digitado não é um número";
    }
}

function generateNumber(min, max) {
    return Math.floor(Math.random() * (max + 1 - min)) + min;
}
