//Calculadora - Nível 1

function adicionar(num1, num2) {
  return `A soma dos números é: ${num1 + num2}`
}

function subtracao(num1, num2) {
  return `A subtração dos números é: ${num1 - num2}`
}

function multiplicacao(num1, num2) {
  return `A multiplicação dos números é: ${num1 * num2}`
}

function divisao(num1, num2) {
  return `A divisão dos números é: ${num1 / num2}`
}

// Calculadora - Nível 2

console.log()
console.log('-------------- Teste de Operações / Calculadora --------------')
console.log()

console.log(adicionar(2, 2))

console.log(subtracao(10, 5))

console.log(multiplicacao(2, 5))

console.log(divisao(10, 2))

console.log(divisao(2, 0))

// Calculadora - Nível 3 - Funções Extras

console.log()
console.log(
  '-------------- Calculadora - Nível 3 - Funções Extras --------------'
)
console.log()

function quadradoDoNumero(num) {
  return multiplicacao(num, num)
}
console.log(quadradoDoNumero(10))

function mediaDeTresNumeros(num1, num2, num3) {
  let media = (num1 + num2 + num3) / 3

  let soma = adicionar(num1, num2 + num3)

  return `${soma} e a media deles é: ${media}`
}
console.log(mediaDeTresNumeros(4, 4, 4))

function calculaPorcentagem(numTotal, porcentagemCalc) {
  let porcentagem = (numTotal * porcentagemCalc) / 100
  return `O resultado da porcentagem é: ${porcentagem}`
}
console.log(calculaPorcentagem(300, 15))

function geradorDePorcentagem(num1, num2) {
  let porcentagem = (num1 / num2) * 100
  return porcentagem
}
console.log(geradorDePorcentagem(100, 400))
