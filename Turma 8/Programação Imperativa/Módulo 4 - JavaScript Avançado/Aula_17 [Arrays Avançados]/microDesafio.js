// Crie um array de números pares, e utilizando a função .map() nesse array, crie um novo array com apenas números ímpares.

let pares = [0, 2, 4, 6, 8, 10]

let impares = pares.map((valor, indice) => {
  return valor + 1
})

console.log(impares)

// Crie um array de nomes, que possua dois índices com o nome Maria. Utilize o .filter() para obter apenas esses dois índices com o nome Maria.

let nome = [
  'Maria',
  'Maria',
  'Douglas Silva',
  'Diane Silva',
  'Rafaella Cuba',
  'Bruno Cuba'
]

let filtroMaria = nome.filter(nome => {
  return nome == 'Maria'
})

console.log(filtroMaria)

// let nomes = ['Maria', 'Amanda', 'Lucas', 'Maria B']

// let nome = nomes.filter(function (nomeMaria) {
//   return nomeMaria == 'Maria A' && 'Maria B'
// })
// console.log(nome)

// Crie um array de números e utilize a função .reduce() para devolver uma string com os números formatados.
// Exemplo [1,5,9,3,7] => “1 – 5 – 9 – 3 – 7”

let num = [1, 5, 9, 3, 7]

let string = num.reduce((incremento, valor) => {
  return incremento + ' - ' + valor
})

console.log(string)

// Crie um array de animais, após isso passe por cada índice utilizando o .forEach() e imprima a frase “O animal é NOME_DO_ANIMAL”.

let animais = ['Cachorro', 'Gato', 'Coelho', 'Cavalo']

let frase = animais.forEach(nome => {
  console.log(`O animal é: ${nome}`)
})
