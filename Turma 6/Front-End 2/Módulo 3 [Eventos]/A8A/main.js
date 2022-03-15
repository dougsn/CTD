let body = document.querySelector('body')

let h1 = document.createElement('h1')
h1.innerText = "Formulário"

h1.onmouseover = () => {
    h1.style.color = "red"
}

h1.onmouseout = () => {
    h1.style.color = "blue"
}

let p = document.createElement('p')
let p2 = document.createElement('p')

let section = document.createElement('section');
section.setAttribute("class", "container")
let form = document.createElement('form');

let divNome = document.createElement('div')
let divSobrenome = document.createElement('div')
let divBtn = document.createElement('div')
divBtn.setAttribute("class", "btn")


// @@ Cx 1

let label1 = document.createElement('label');
label1.innerText = "Nome:";
label1.setAttribute("for", "nome")

let input1 = document.createElement('input');
input1.setAttribute("name", "nome")
input1.setAttribute("id", "nome")


// @@ Cx 2

let input2 = document.createElement('input');
input2.setAttribute("for", "sobrenome")
input2.setAttribute("id", "sobrenome")

let label2 = document.createElement('label');
label2.innerText = "Sobrenome:";
label2.setAttribute("for", "sobrenome")

// @@ Botões

let btnSubmite = document.createElement('input')
btnSubmite.setAttribute("type", "submit")
btnSubmite.setAttribute("value", "Enviar")
btnSubmite.setAttribute("class", "btnEnviar")

btnSubmite.addEventListener('click', (evento) => {
    evento.preventDefault()
} )

let btnReset = document.createElement('input')
btnReset.setAttribute("type", "reset")
btnReset.setAttribute("value", "Limpar")


body.appendChild(section)
section.appendChild(h1)
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
// section.appendChild(p)

window.onload = () => {
    alert("A página foi carregada !")
} 

      
input1.onkeyup = () => {
    
    let valorInput = input1.value
    let valorNome = input1.value.length;
    section.appendChild(p)
    section.appendChild(p2)
    p.innerText = valorNome
    p2.innerText = valorInput
    
}
    



