function selectId(id){
  return document.getElementById(id) // Simplifica a criação da marcação dos elementos do HTML
}

function empty(input){
  return input.value.trim() === ""; // Verificando se o valor do campo é vazio
}

function errorMessage(message) {
  return  errorListUl.innerHTML += `<li>${message}</li>` // Simplificando a inserção da mensagem de erro
}


let nome = selectId('name');

let lastName = selectId('lastName');

let btn = selectId('btn');


let errorListUl = document.querySelector('.saidaForm ')

let form = selectId('contato-form')

form.addEventListener('submit', (ev) => {
 

  errorListUl.innerHTML = ''; //Limpa a lista toda vez que for clicado no botão do formulário

  if(empty(nome)) { // Verificando se o campo nome está vazio
    ev.preventDefault();
    errorMessage("Campo <b>nome</b> não preenchido")
  }

  if(empty(lastName)) { // Verificando se o campo sobrenome está vazio
    ev.preventDefault();
    errorMessage("Campo <b>sobrenome</b> não preenchido")
  }


});


