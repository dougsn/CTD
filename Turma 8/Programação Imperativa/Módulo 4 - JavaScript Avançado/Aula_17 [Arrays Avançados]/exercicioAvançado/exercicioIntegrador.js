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
    nome:'Leite',
    preco:4.99,
    quantidadeVendida:3
}

let arrayProdutos = [produto1,produto2,produto3]

 
// function lucroTotal(produtos){
//     let lucroPorProduto = produtos.map( produto => produto.precoPorKilo * produto.kilosVendidos) 
//     let resultado = lucroPorProduto.reduce((acum, elemento) => acum+elemento)
//     return resultado
// }

function lucroTotal(produtos){
    let lucroPorProduto = produtos.map(produto => produto.preco * produto.quantidadeVendida)
    let resultado = lucroPorProduto.reduce((acum,elemento) => {
        return acum + elemento
    })
    console.log( `O lucro total é: ${resultado}`)
}

lucroTotal(arrayProdutos);


// 2 - Permitir pesquisar um produto pelo nome e calcular seu lucro total;

function nomeLucro(nomeProduto){
    for (let i = 0; i < arrayProdutos.length; i++) {
        let nome = arrayProdutos[i].nome;
        let total = arrayProdutos[i].preco * arrayProdutos[i].quantidadeVendida;
        if(nomeProduto == arrayProdutos[i].nome){
            console.log( `O produto escolhido foi: ${nome} e o lucro total é: ${total}`)
        }
    }
}
nomeLucro('Leite')
console.log()

// 3 - Permite receber um valor e indicar todos os produtos que venderam mais que esse valor;

function valorNome(valor){
    
    for (let i = 0; i < arrayProdutos.length; i++) {
        let nome = arrayProdutos[i].nome;
        let preco = arrayProdutos[i].preco;
        if(valor < arrayProdutos[i].preco){
            console.log(`Todos os produtos que venderam mais que esse valor são: ${nome} que está por: R$${preco}`)
        }
    }
};

valorNome(20)

// let marcas = ['samsumg','xiaomi','apple','motorola']
// let n = [10, 3, 4, 52, 6, 7]

// console.log(marcas.sort())

// console.log(n.sort((a,b) => {
//     return a - b; // Ordena do menor para o maior
// }))


// 4 -  Classifique todos os produtos pela quantidade de dinheiro que geraram.


    


// 5 -Encontre um produto e atribua a ele um novo valor (reutilize o código que permite encontrar o produto pelo nome).

function novoValor(nomeProduto,novoValor){
    for (let i = 0; i < arrayProdutos.length; i++) {
        let nome = arrayProdutos[i].nome;
        arrayProdutos[i].preco = novoValor;
        if(nomeProduto == arrayProdutos[i].nome){
            console.log( `O produto escolhido foi: ${nome} e o novo preço dele é: ${novoValor}`)
        }
    }
}

novoValor('Leite', 10)
console.log(produto3.preco)
novoValor('Leite', 2)
console.log(produto3.preco)

// 6 -Calcule o lucro total após pagar 45% do lucro em impostos.

// function lucroTotalImposto(produtos){
//     let lucroPorProduto = produtos.map(produto => produto.preco * produto.quantidadeVendida)
//     let resultado = lucroPorProduto.reduce((acum,elemento) => {
//         return acum + elemento 
//     })
//     let resultadoImposto = resultado - (resultado * 0.45)
//     return `O lucro total é: ${resultadoImposto}`
// };


// let lucroBruto = lucroTotal(verduras)
// let lucroLiquido = lucroBruto - lucroBruto * 0.45


// function lucroTotal(produtos){
//     let lucroPorProduto = produtos.map(produto => produto.preco * produto.quantidadeVendida)
//     let resultado = lucroPorProduto.reduce((acum,elemento) => {
//         return acum + elemento
//     })
//     return `O lucro total é: ${resultado}`
// }


/* 
    Resposta do professor para a resolução do exercicio
*/



// //Crie uma função que receba um array de palavras e um número, e que retorna uma matriz (array) com apenas as palavras que têm mais do que uma quantidade de letras maior do que o número informado. (verifique como funciona o método filter ()).
 
// let arrayPalavras = ["leandro", "nicolas", "esteban", "pedro", "jose"]
 
// function filtroDeArrays(palavras, numero) {
//     let resultado = palavras.filter( palavra => palavra.length > numero )
 
//     return resultado
// }));
// // [
// //     { nome: 'Ezequiel', nota: 7 },
// //     { nome: 'Leandro', nota: 4 },
// //     { nome: 'Martin', nota: 10 }
// // ]
// let verduras = [
//     {nome: "lechuga", precoPorKilo: 150, kilosVendidos: 15},
//     {nome: "tomate", precoPorKilo: 180, kilosVendidos: 20},
//  {nome: "cebolla", precoPorKilo: 70, kilosVendidos: 100},
//     {nome: "papa", precoPorKilo: 55, kilosVendidos: 150},
//     {nome: "zapallo", precoPorKilo: 75, kilosVendidos: 7}
// ]
 
 
// function lucroTotal(produtos){
//     let lucroPorProduto = produtos.map( produto => produto.precoPorKilo * produto.kilosVendidos) 
//     let resultado = lucroPorProduto.reduce((acum, elemento) => acum+elemento)
//     return resultado
// }
 
// function encontrarProduto(produtos, produtoAEncontrar){
//     return produtos.find(produto => produto.nome === produtoAEncontrar)
// }
// // let lechuga = encontrarProduto(verduras, "lechuga")
// // console.log(lechuga);
 
// function vendiMasQue(produtos, num){
//     let resultado = produtos.filter( produto => produto.kilosVendidos > num)
//     return resultado
// }
 
// let produto = encontrarProduto(verduras, "lechuga").precoPorKilo = 110
// // console.log(verduras);

// let lucroBruto = lucroTotal(verduras)
// let lucroLiquido = lucroBruto - lucroBruto * 0.45
 
// console.log(lucroLiquido);