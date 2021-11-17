// 1

let peliculas = [
  'star wars',
  'totora',
  'rocky',
  'pulp fiction',
  'la vida es bella'
]

let nomes = ['Douglas', 'Rafaella', 'Diane', 'Rodrigo', 'Bruno']

function converterEmMaiuscula(array) {
  for (let i = 0; i < array.length; i++) {
    console.log(array[i].toUpperCase())
  }
}

converterEmMaiuscula(peliculas)
console.log('-------------------')
converterEmMaiuscula(nomes)

//  2  Agora precisamos modificar afunçãode passagemde elemento() que nos permite
// adicionar o conteúdo de nossa matriz de filme animado à matriz de filme
// original. Jogando de um para outro.

let filmeOriginal = []
let filmeAnimado = [
  'FilmeAnimado1',
  'FilmeAnimado2',
  'FilmeAnimado3',
  'FilmeAnimado4',
  'FilmeIntruso'
]
function passagemDeElemento(array1, array2) {
  for (let i = 0; i < array1.length; i++) {
    // console.log(array1[i].push(array2[i].pop().toUpperCase()))
  }
}
passagemDeElemento(filmeAnimado, filmeOriginal)

// 3 - tira do array e joga para a variavel que sera criada.

// 4

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4]
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 6]

function compararQualificacao(asia, europa) {
  let comparacaoAsiaEuropa = []
  for (let i = 0; i <= 8; i++) {
    console.log((comparacaoAsiaEuropa[i] = asiaScores[i] === euroScores[i]))
  }
}

compararQualificacao(asiaScores, euroScores)

// Bônus extra
