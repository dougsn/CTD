let body = document.querySelector('body')
body.style.background = '#CCCCCC'

let legend = document.createElement('legend')
legend.innerText = "Formulário"
legend.style.color = "#FFF"
legend.style.fontSize = "28px"
legend.style.fontWeight = "500"

legend.onmouseover = () => {
    legend.style.color = "#333"
    legend.style.transition = '.5s'
}

legend.onmouseout = () => {
    legend.style.color = "#FFF"
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
label1.innerText = "URL para mudar o background da página:";
label1.setAttribute("for", "body")

let input1 = document.createElement('input');
input1.setAttribute("name", "body")
input1.setAttribute("id", "body")


// @@ Cx 2

let input2 = document.createElement('input');
input2.setAttribute("for", "nome")
input2.setAttribute("id", "nome")

let label2 = document.createElement('label');
label2.innerText = "Nome:";
label2.setAttribute("for", "nome")

// @@ Botões

let btnSubmite = document.createElement('input')
btnSubmite.setAttribute("type", "submit")
btnSubmite.setAttribute("value", "Trocar")
btnSubmite.setAttribute("class", "btnEnviar")

btnSubmite.addEventListener('click', (evento) => {
    evento.preventDefault()
} )

let btnReset = document.createElement('input')
btnReset.setAttribute("type", "reset")
btnReset.setAttribute("value", "Limpar")


body.appendChild(section)
// section.appendChild(h1)
section.appendChild(form)
form.appendChild(legend)
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
    // alert("A página foi carregada !")
} 






// Realizando a adição dos eventos


    
input1.addEventListener('keyup', () => {
    let valorInput = input1.value
    let valorNome = input1.value.length;
    section.appendChild(p)
    section.appendChild(p2)
    p.innerText = valorNome
    p2.innerText = valorInput
})


btnSubmite.addEventListener('click', () => {
    let container = document.querySelector('.container')
    let valorInput = input1.value
    console.log(valorInput);

    body.style.backgroundImage = `url(${valorInput})`
    body.style.backgroundRepeat = 'no-repeat'
    body.style.backgroundSize = 'cover'

    if(body.style.backgroundImage != 'none'){
        container.style.color = 'white';
    }

})

btnReset.addEventListener('click', () => {

    let valorInput = input2.value

    form.style.backgroundImage = `url(${valorInput})`
    form.style.backgroundRepeat = 'no-repeat'
    form.style.backgroundSize = 'cover'


})