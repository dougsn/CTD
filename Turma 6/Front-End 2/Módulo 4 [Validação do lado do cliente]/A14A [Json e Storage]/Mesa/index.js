let nome = document.getElementById("name");
let submit = document.getElementById("contato-form");
let saidaForm = document.querySelector(".saidaForm");
let arr = [];


let nomeUsuario = {
  nome: "",
}

onload = () => { // Foi necessário colocar no onload pois é 'buscado e renderizado no carregamento da página
  let objetoCapturado = localStorage.getItem(1)

  let usuarioJs = JSON.parse(objetoCapturado);
  // console.log(usuarioJs.nome);

  let p = document.createElement('p')

   saidaForm.appendChild(p)

   p.innerText = usuarioJs.nome
}

submit.addEventListener("submit", (e) => {
  // e.preventDefault(); -> Foi retirado para que fosse possível validar a ação no localStorage
  
  nomeUsuario.nome = nome.value;

  let usuarioJson = JSON.stringify(nomeUsuario);
  localStorage.setItem(1, usuarioJson)

  let objetoCapturado = localStorage.getItem(1)

  let usuarioJs = JSON.parse(objetoCapturado);
  // console.log(usuarioJs.nome);

  let p = document.createElement('p')

  // saidaForm.appendChild(p)

  p.innerText = usuarioJs.nome
 
});


/*
REQUISITOS
- Crie um formulário para capturar um texto inserido.
- Implemente o evento "submit", use-o para salvar o comentário em um array.
- Cada vez que um novo comentário é adicionado, renderize-o em uma tag "p" (remova o código permanente do HTML e torne-o dinâmico).
- Salve constantemente as informações no localStorage, caso a página seja recarregada os comentários devem ser mantidos.
*/
