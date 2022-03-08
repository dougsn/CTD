//1- Adiciona ao cartão, o atributo "class" com o valor "cartão"

let card = document.querySelector('#tarjeta')
card.classList.add('card')

//2- o atributo "src" à imagem com o valor "https://www.youtube.com/img/desktop/yt_120.png"

let imagem = document.querySelector('#logo')
imagem.setAttribute('src', 'https://www.youtube.com/img/desktop/yt_1200.png'  )

//3- Remoção de uma classe "titulo-feio" do título do documento

let tituloFeio = document.querySelector('.col-2 h1')
tituloFeio.classList.remove('titulo-feo')

//4- Verifique se o link para o YouTube tem o atributo href ou não, e imprima esse resultado no console

let youtube = document.querySelector('#link_youtube')
console.log(youtube.getAttribute("href"));

//5- Capture o valor de href do link do Wikipedia e exiba no console

let wikipedia = document.querySelector("#link_wikipedia")
console.log(wikipedia.getAttribute("href"));




/*

@@ hasAttribute()
    Esse método é usado para verificar se o elemento possui um determinado atributo ou não e retorna um true se existir ou false se não existir.

@@ getAttribute()
    É usado para obter o valor de um determinado atributo, se o valor existir, ele retorna o VALOR, caso não exista, retorna null.

@@ removeAttribute()
    É usado para remover completamente o atributo e seus valores do elemento. Se não encontrar, não faz nada.

@@ setAttribute()
    É usado para adicionar um atributo com seu respectivo valor ao elemento selecionado.
    setAttribute('src', './img/img_youtube') -> exemplo

*/