let nome = 'José'
let sobrenome = 'da Silva'
let idade = '27'
let peso = 83.5
let altura = 1.7
let plano = 'Ouro'
let IMC = parseFloat(peso / (altura * altura)).toFixed(2)

console.log()

console.log(
  `${nome} ${sobrenome} tem ${idade} anos e seu índice de massa corporal é de: ${IMC}`
)

console.log()
