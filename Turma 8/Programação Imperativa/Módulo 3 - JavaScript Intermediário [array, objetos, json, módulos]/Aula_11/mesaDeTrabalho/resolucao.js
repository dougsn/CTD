let filme = [
  'star wars',
  'matrix',
  'mr. robot',
  'o preço do amanhã',
  'a vida é bela'
]
let filme2 = ['toy story', 'finding Nemo', 'kung-fu panda', 'wally', 'fortnite']

let peliculas = [
  'star wars',
  'totora',
  'rocky',
  'pulp fiction',
  'la vida es bella'
]

let nomes = ['Douglas', 'Rafaella', 'Diane', 'Rodrigo', 'Bruno']

// 1

function converterEmMaiuscula(array) {
  for (let i = 0; i < array.length; i++) {
    console.log(array[i].toUpperCase())
  }
}

converterEmMaiuscula(nomes)

// 2

function passagemDeElementos(array1, array2) {
  let invalido = array2.pop() // 3 - Retirando o Filme inválido
  let qtd = array2.length
  for (let i = 0; i < qtd; i++) {
    array1.push(array2.pop().toUpperCase())
  }
  console.log('Esse filme é inválido: ', invalido) // 3 - Printando o Filme inválido
  return array1
}

console.log(passagemDeElementos(filme, filme2))

// 4

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4]
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5]

function compararClassificacoes(asia, europa) {
  let comparacoesAsiaEuropa = []
  for (let i = 0; i < asia.length; i++) {
    comparacoesAsiaEuropa[i] = asia[i] === europa[i]
  }

  return comparacoesAsiaEuropa
}

console.log(compararClassificacoes(asiaScores, euroScores))
