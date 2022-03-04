let titulo = document.querySelector('h1')
console.log(titulo);

let subtitulo = document.querySelector('#subtitulo')
console.log(subtitulo);

let paragrafos = document.getElementsByClassName('paragrafo')
console.log(paragrafos);

let numeros = document.querySelectorAll('#numeros li' )

for (let i = 0; i < numeros.length; i++) {
    console.log(numeros[i].innerText); // Pegando o valor das LI's
}

let comida = document.querySelector('.comida').innerHTML += '<h1 class="salgado">Salgadinho</h1>'

let nome = document.querySelector('.nome').innerText += " <h1>Silva</h1>"

let salgado = document.querySelector('.salgado')
salgado.style.color = 'blue'
salgado.style.textAlign = "center"
salgado.style.fontSize = "42px"
salgado.style.backgroundColor = "#ccc"

// As regras CSS que tinham hífen (como font-size), no javascript são escritas em camalCase, (ou seja, fontSize)

// document.querySelector('') -> serve para selecionar qualquer elemento do DOM, mas se for classe é necessário colocar o '.' na frente, se for ID é necessário colocar o '#' e se for alguma tag é necessário colocar apenas o nome da tag

// document.getElementById('') -> serve para selecionar os elementos da DOM que possuem algum ID específico, não é necessário colocar o '#' dentro dos colchetes.

// document.getElementByClassName('') -> serve para selecionar os elementos do DOM que possuem ID específico, não é necessário colocar o '.' dentro dos colchetes.

// document.getElementsByTagName('') -> serve para selecionar alguma tag do DOM..

// O .innerHTML = '' -> Substitui o valor que se encontra no elemento selecionado, para "adicionar", é necessário colocar o +=. Retorna o texto, com formatações e com elementos HTML.

// O .innerText = '' -> Retorna somente o texto, sem formatações ou elementos HTML, substitui o valo que se enconra no elemento selecionado, para "adicionar" é necessário colocar o +=.