// let nomeUsuario = "Douglas";

// // Função declaradas

// function exibeNomeUsuario() {
//   console.log(nomeUsuario);
// }

// exibeNomeUsuario()

(function () {
  // Função auto invocavel
  console.log("Função automática");
})();

// Função expressas

let valores = function somarValores(a, b) {
  return a + b;
};

console.log(valores(1, 2));

// Funções de callback

function executaCalculo(callback) {
  let valor1 = 4;
  let valor2 = 6;
  let soma = valor1 + valor2;
  callback(soma);
}

function exibeCalculo(resultado) {
  console.log(`O resultado foi ${resultado}`);
}

executaCalculo(exibeCalculo);

// ArrowFunctions

let soma = function (a, b) {
  return a + b;
};

soma(4, 6);

let somaArrow = (a, b) => {
  return a + b;
};

somaArrow(6, 4);

let somaArrow2 = (a, b) => a + b;

somaArrow2(1, 2);
