let body = document.querySelector('body')

let section = document.createElement('section');
section.setAttribute("class", "container")
let form = document.createElement('form');

let divNome = document.createElement('div')
let divSobrenome = document.createElement('div')
let divBtn = document.createElement('div')


// @@ Cx 1

let label1 = document.createElement('label');
label1.innerText = "Nome";
label1.setAttribute("for", "nome")

let input1 = document.createElement('input');
input1.setAttribute("name", "nome")
input1.setAttribute("id", "nome")


// @@ Cx 2

let input2 = document.createElement('input');
input2.setAttribute("for", "sobrenome")
input2.setAttribute("id", "sobrenome")

let label2 = document.createElement('label');
label2.innerText = "Sobrenome";
label2.setAttribute("for", "sobrenome")

// @@ Botões

let btnSubmite = document.createElement('input')
btnSubmite.setAttribute("type", "submit")
btnSubmite.setAttribute("value", "Enviar")

let btnReset = document.createElement('input')
btnReset.setAttribute("type", "reset")
btnReset.setAttribute("value", "Limpar")


body.appendChild(section)
section.appendChild(form)
form.appendChild(divNome)
divNome.appendChild(label1)
divNome.appendChild(input1)
form.appendChild(divSobrenome)
divSobrenome.appendChild(label2)
divSobrenome.appendChild(input2)
form.appendChild(divBtn)
divBtn.appendChild(btnSubmite)
divBtn.appendChild(btnReset)