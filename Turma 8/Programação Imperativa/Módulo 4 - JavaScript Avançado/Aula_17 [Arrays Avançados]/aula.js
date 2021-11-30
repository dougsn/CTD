// .map()
let numeros = [1, 2, 3, 4]

let dobro = numeros.map(item => {
  return item * 2
})

console.log(dobro)

// .filter()

let idades = [22, 25, 14, 19, 15]

let maiores = idades.filter(idade => {
  return idade >= 18
})

console.log(maiores)

// .reduce() ele precisa de 2 paramentros, o acumulador é o resultado a iteração anterior, e o item é o item atual do loop.

let soma = numeros.reduce((acumulador, item) => {
  // console.log(acumulador)
  return acumulador + item
})

console.log(soma)

// forEach() ele só percorre o array, ela não tem RETORNO

let paises = ['Brasil','Cuba','Russia','EUA']

paises.forEach((item) => {
  console.log(`Olá item - ${item}`)
});