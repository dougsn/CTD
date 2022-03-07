// @@ Modlo de Templat String


let nomeUsuario = "Douglas";

// console.log(`Olá eu sou o ${nomeUsuario}`);


// @@ Modificando os elementos com o DOM

let h1 = document.querySelector('h1');

// console.log(h1.childNodes[0].data)

// console.log(h1.innerText);

// console.log(h1.innerHTML);

h1.innerHTML = "<h6>Novo Título</h6>"; // Muda a estrutura, podendo colocar tags

// h1.innerText = "<h6>Novo Título</h6>"; // Muda apenas o texto



// @@ Modificando Estilos da Página

let body = document.querySelector('body');

body.style.backgroundColor = "#88e690";

h1.style.color = "#CA8122";

h1.style.textAlign = "center"

// @@ Modificarmos a classe dos elementos.

let listaElementosLi = document.querySelectorAll('li');

// console.log(listaElementosLi);

listaElementosLi.forEach(li => {
   // console.log(li.innerText); // @@ Percorrendo as LI'S da UL (O Texto)

    li.classList.toggle('novo-li');
    
})

listaElementosLi[3].classList.toggle('novo-li')

console.log(listaElementosLi[3].classList.contains('novo-li'));


