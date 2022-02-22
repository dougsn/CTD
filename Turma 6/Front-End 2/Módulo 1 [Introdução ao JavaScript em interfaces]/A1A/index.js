// let nome = "Douglas Nascimento";

// var idade = 23;

// console.log("Olá, eu sou o " + nome + " e tenho " + idade + " anos");

let arrayEntrada = [1, 2, 4, 8];

// let inicio = arrayEntrada[0];
// let primeiro = arrayEntrada[0] + arrayEntrada[1];
// let segundo = primeiro + arrayEntrada[2];
// let terceiro = segundo + arrayEntrada[3];

// Ouuu

// const soma = arrayEntrada.reduce((acum, elemento) => {
//    return acum + elemento
// })

// console.log(soma);

// for (let i = 0; i < arrayEntrada.length; i++) {
//    console.log(arrayEntrada[i]);    
// }

// console.log(inicio, primeiro, segundo, terceiro);

for (let i = 0; i < arrayEntrada.length; i++) {
    const sum = arrayEntrada[i] + arrayEntrada[i] - 1;
    console.log(sum)
}
  