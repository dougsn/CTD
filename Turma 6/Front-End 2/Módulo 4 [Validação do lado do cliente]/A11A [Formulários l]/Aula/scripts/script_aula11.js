/* 1- Capturar as informações e obter os valores */

let nomeESobrenome = document.getElementById("nome");
let idade = document.getElementById("idade");
let altura = document.getElementById("altura");
let biografia = document.getElementById("biografia");
let botaoSalvar = document.getElementById("salvar");

let radioGrupo = document.getElementsByName("radioGrupo"); // Pegando os inputs radio

botaoSalvar.addEventListener("click", (e) => {
  e.preventDefault();

  // console.log(nomeESobrenome.value);

    let radioSelecionado;

  radioGrupo.forEach((radioItem) => {
    // console.log(radioSelecioado.checked); // Verificando qual dos radios está selecionado
    // console.log(radioSelecioado.value);

    if(radioItem.checked) {
        radioSelecionado = radioItem;
    }

    console.log(radioSelecionado.value);

});
});

/* 2 - Normalizar os dados do usuário */
