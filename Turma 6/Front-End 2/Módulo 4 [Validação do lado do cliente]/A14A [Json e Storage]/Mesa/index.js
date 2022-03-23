let nome = document.getElementById("name");
let submit = document.getElementById("contato-form");
let saidaForm = document.querySelector(".saidaForm");
let arr = [];

submit.addEventListener("submit", (e) => {
  e.preventDefault();


  let p = document.createElement("p");

  if (nome.value) {
    arr.push(nome.value);
    p.innerText += arr;
    saidaForm.appendChild(p);

  }
  localStorage.setItem('nome', p.innerText = arr)

  
  console.log(arr);

 
});

/*
REQUISITOS
- Crie um formulário para capturar um texto inserido.
- Implemente o evento "submit", use-o para salvar o comentário em um array.
- Cada vez que um novo comentário é adicionado, renderize-o em uma tag "p" (remova o código permanente do HTML e torne-o dinâmico).
- Salve constantemente as informações no localStorage, caso a página seja recarregada os comentários devem ser mantidos.
*/
