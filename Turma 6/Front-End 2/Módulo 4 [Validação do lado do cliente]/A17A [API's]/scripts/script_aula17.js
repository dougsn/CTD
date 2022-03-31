let quantidadeFormulario = document.getElementById("quantidadeFormulario");
let botaoPesquisar = document.getElementById("botaoPesquisar");
let exibeResultado = document.getElementById("exibeResultado");

botaoPesquisar.addEventListener("click", function (evento) {
  evento.preventDefault();

  if (quantidadeFormulario.value != "") {
    //Executar a busca a API...
    // o fetch, quando não se passa a opção de get, put, post e etc, ele vem por padrão com o GET
    fetch(
      `https://dog.ceo/api/breeds/image/random/${quantidadeFormulario.value}`
    ) // trocado para pegar dinamicamente do DOM a quantidade de imgs que o cliente quer
      .then((resultado) => {
        if (resultado.status == 200) {
          return resultado.json(); // Convertendo para JS, para conseguir acessar o objeto
        } else {
          throw "Status não é 200"; // se houver erro no status, o throw trata o erro e 'transfere p catch'.
        }
      })
      .then((resultado) => {
        console.log(resultado.message); // Obtendo o objeto para pegar as informaçõs que queremos.
        // Foi feito o for of para iterar sobre o array message e capturar cada iteração, e ir inserindo dinamicamente no DOM (exibeResultado)
        for (let img of resultado.message) {
          let imgElemento = document.createElement("img");
          imgElemento.src = img;
          exibeResultado.append(imgElemento);
        }
      })
      .catch((error) => {
        console.log(error);
      });
  } else {
    alert("Você deve informar o número de imagens que deseja buscar");
  }
});

function atualizaPagina() {
  window.location.reload();
}
