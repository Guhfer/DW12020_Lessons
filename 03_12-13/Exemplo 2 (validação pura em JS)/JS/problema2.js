"use strict";

window.onload = () => {
    var form = document.forms["form"]; // name do form ou id
    // form.onsubmit = function() {
    //     return  validateData(this);
    // };

    // form.onsubmit = () => validateData(form);
    form.addEventListener("submit", (event) => {
        let validate = validateData(form);
        if(!validate)
            event.preventDefault();
    });

    function validateData(form1) {
        var name, lastName;

        name = form1.elements["nome"].value; //Acessa pela posição, nome ou id do elemnto do form
        lastName = form1.elements["sobrenome"].value;

        if (name.length < 3 || lastName.length < 3) {
            alert("Nome ou sobrenome com menos de 3 caracteres");
            return false;
        }

        if (name === lastName) {
            alert("Os dois campos não podem ser iguais");
            return false;
        }

        return true;
    }
};
