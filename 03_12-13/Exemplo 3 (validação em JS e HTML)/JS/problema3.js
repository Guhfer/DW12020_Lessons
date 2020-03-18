"use strict";

window.onload = () => {
    var form = document.forms["form"]; // name do form ou id
    var section = document.getElementById("erros");
    form.noValidate = true;

    form.addEventListener("submit", (event) => {
        let validate;
        validateData(form);
        validate = applyValidation(form, section);
        if (!validate)
            event.preventDefault();
    });

    function validateData(form1) {
        var name, lastName;

        name = form1.elements["nome"]; //Acessa pela posição, nome ou id do elemento do form
        lastName = form1.elements["sobrenome"];

        if (name.value.length < 3 || lastName.value.length < 3) {
            name.setCustomValidity("Nome ou sobrenome com menos de 3 caracteres");
            lastName.setCustomValidity("Nome ou sobrenome com menos de 3 caracteres");
        } else {
            name.setCustomValidity("");
            lastName.setCustomValidity("");
        }

        if (name.value === lastName.value) {
            alert("Os dois campos não podem ser iguais");
        }

    }

    function applyValidation(form, secao) {
        var elements = form.elements;
        var errors = [];
        let valid = true;

        for (let i = 0; i < elements.length; i++) {
            if (!elements[i].validity.valid) {
                errors.push("Nome do campo: "+ elements[i].name+ " Mensagem de erro: " + elements[i].validationMessage)
            }
        }

        if(errors.length > 0) {
            valid = false;
        }

        secao.innerHTML = errors.join("<br/>");
        return valid;
    }
};
