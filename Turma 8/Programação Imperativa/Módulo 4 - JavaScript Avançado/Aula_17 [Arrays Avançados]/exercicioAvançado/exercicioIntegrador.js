// Temos que fazer um sistema para um Agricultor controlar suas vendas. Ele tem um controle de vendas em um caderno, onde os produtos estão organizados por nome, preço e quantidade vendida.

// Portanto, crie um array de objetos literais com essas informações. No sistema, você tem que adicionar uma função (ou várias) que realize os seguintes passos:

// 1 - Calcular o lucro total de todos os produtos;
let produto1 = {
  nome: 'Ovo',
  preco: 12.99,
  quantidadeVendida: 2
}

let produto2 = {
  nome: 'Carne',
  preco: 39.99,
  quantidadeVendida: 1
}

let produto3 = {
  nome: 'Leite',
  preco: 4.99,
  quantidadeVendida: 3
}

let arrayProdutos = [produto1, produto2, produto3]

function lucroTotal() {
  for (let i = 0; i < arrayProdutos.length; i++) {
    let total =
      produto1.preco * produto1.quantidadeVendida +
      produto2.preco * produto2.quantidadeVendida +
      produto3.preco * produto3.quantidadeVendida
    return `O lucro total de todos os produtos é: ${total}`
  }
}
console.log(lucroTotal())
console.log()

// 2 - Permitir pesquisar um produto pelo nome e calcular seu lucro total;

function nomeLucro(nomeProduto) {
  for (let i = 0; i < arrayProdutos.length; i++) {
    let nome = arrayProdutos[i].nome
    let total = arrayProdutos[i].preco * arrayProdutos[i].quantidadeVendida
    if (nomeProduto == arrayProdutos[i].nome) {
      console.log(
        `O produto escolhido foi: ${nome} e o lucro total é: ${total}`
      )
    }
  }
}
nomeLucro('Leite')
console.log()

// 3 - Permite receber um valor e indicar todos os produtos que venderam mais que esse valor;

function valorNome(valor) {
  for (let i = 0; i < arrayProdutos.length; i++) {
    let nome = arrayProdutos[i].nome
    let preco = arrayProdutos[i].preco
    if (valor < arrayProdutos[i].preco) {
      console.log(
        `Todos os produtos que venderam mais que esse valor são: ${nome} que está por: R$${preco}`
      )
    }
  }
}

valorNome(20)

// let marcas = ['samsumg','xiaomi','apple','motorola']
// let n = [10, 3, 4, 52, 6, 7]

// console.log(marcas.sort())

// console.log(n.sort((a,b) => {
//     return a - b; // Ordena do menor para o maior
// }))

// 4 -  Classifique todos os produtos pela quantidade de dinheiro que geraram.

console.log(
  arrayProdutos.sort((a, b) => {
    return a - b
  })
)

// 5 -Encontre um produto e atribua a ele um novo valor (reutilize o código que permite encontrar o produto pelo nome).

// 6 -Calcule o lucro total após pagar 45% do lucro em impostos.
