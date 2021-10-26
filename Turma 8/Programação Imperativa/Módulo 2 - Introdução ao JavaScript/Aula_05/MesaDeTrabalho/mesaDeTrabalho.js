// Micro Desafio 1

function teste1(x, y) {
  return y - x
}

teste1(10, 40)

// Micro Desafio 2

function teste2(x, y) {
  return x * 2
  console.log(x)
  return x / 2
}

teste2(10)

// Função Simples

// 1

function conversorPolegadosCentimetros(polegadas) {
  return polegadas * 2.54
}
console.log(conversorPolegadosCentimetros(2))

// 2

function stringToUrl(texto) {
  return `http://www.${texto}.com.br`
}
console.log(stringToUrl('facebook'))

// 3

function concat(texto) {
  return `${texto} !`
}
console.log(concat('Olá'))

// 4

function idadeCachorros(idade) {
  let idadeCachorro = idade * 7
  return `A idade do seu cachorro, comparada a de um ser humano é: ${idadeCachorro}.`
}
console.log(idadeCachorros(2))

// 5

function calculoHoraTrabalho(salarioMensal) {
  let hora = parseFloat(salarioMensal / 160).toFixed(2)
  return `A sua hora trabalhada é: ${hora}`
}
console.log(calculoHoraTrabalho(1500))

// 6

function calculadoraIMC(altura, peso) {
  altura = altura * 100 // convertendo para metros
  let IMC = peso / (altura * altura)
  return `O seu IMC é: ${IMC}`
}
console.log(calculadoraIMC(1.7, 87.7))
