// Basicamente um callback é uma função que é passado como parâmetro para outra função.

const somar = (a, b) => a + b

const calculadora = (a, b, operacao) => operacao(a, b)

console.log()
console.log(calculadora(10, 20, somar))
console.log()
console.log(calculadora(10, 20, (a, b) => a - b))

// Exemplo do PG

function nomeCompleto(nome, sobrenome) {
  return nome + ' ' + sobrenome
}

console.log(nomeCompleto('Douglas', 'Silva'))

function bomDia(nome, sobrenome, callback) {
  console.log('Olá ' + callback(nome, sobrenome))
}

bomDia('Douglas', 'Silva', nomeCompleto)

let print = function () {
  console.log('Olá Mundo !')
}

setTimeout(print, 1000)
function nomeCompleto(nome, sobrenome) {
  return nome + ' ' + sobrenome
}

// setInterval(function() {
//     console.log('Olá Mundo !')
// }, 2000)

// Micro desafio de callback

function acaoCarro(callback) {
  return callback
}

function andar() {
 console.log('O carro está andando')
}

function parar() {
 console.log('O carro parou')
}

acaoCarro(andar())
acaoCarro(parar())
