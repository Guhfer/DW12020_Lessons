"use strict";

window.onload = startPage;

function startPage() {
    var btn = document.getElementById("btnValidar");
    btn.onclick = function() {
        var root = document.documentElement; //nó raiz (HTML)
        var rootChild = root.childNodes;
        
        // for(let node of rootChild) {            // For OF ou IN
        //     text += node.nodeName + "\n";
        // }

        rootChild.forEach(function (node) { // poderia usar 3 parametros, objeto em si, indice e referencia da collection
            // text += node.nodeName + "\n"; percorrendo com forEach ou lambda arrowFunction (node)=>
        })


        // var sectionElements = document.getElementsByTagName(); // HTMLCollection

        analyseDocument(rootChild);

    }

    // funções closure
    function analyseDocument(x) {
        var ids = new Map(); //declaração Map vazio

        throughNodes(x);

        function throughNodes(nodes) {
            nodes.forEach(function (node) {
                if(node.nodeType === Node.ELEMENT_NODE) {
                    if(node.hasAttribute("id")) {
                        let id = node.id;
                        if(ids.get(id) === undefined) {
                            ids.set(id, 1); //id parece 1 vez
                        } else {
                            let idsReapeats = ids.get(id);
                            ids.set(id, idsReapeats+1);
                        }
                    }
                    if(node.hasChildNodes()) {
                        throughNodes(node.childNodes);
                    }
                }
            });
        }

        let text = "IDs duplicados: ";
        ids.forEach(function (value, key){
            if(key > 1) {
                text += "\n" + key;
            }
        });

        alert(text);
    }

}