
/* 
O método slice() retorna uma cópia do array, ele possui 2 parãmetros (inicial,final(opcional)). 
Caso o índice inicial seja negativo, é extraído os elementos se iniciando no final do array, caso omitido o padrão é 0 e se for um índice maior que o tamanho do array, retornará um array vazio.
*/

let numeros = [3, 4, 5, 6, 7];

let subArray = numeros.slice(0,3);
// Começa no indice 0 e vai até o indice 3.

console.log(subArray)



/* 
O método slice() nos ajuda a remover ou adicionar elementos de um array. Recebe 3 parâmetros (inicio,quantidade(opcional),itens).

array.splice(inicio,quantidade,item1,item2)
Indicamos o inicio, itens a serem removidos e os itens que serão adicionados

*/

numeros.splice(0,0,2);
console.log(numeros)

numeros.splice(1,2)
console.log(numeros)

/* 
O método sort() nos ajuda a ordenar os elementos de um array. Ele pode receber um callback como paramentro, sendo que esse callback precisa de 2 parametros, para serem comparados.
*/

let marcas = ['samsumg','xiaomi','apple','motorola']
let n = [10, 3, 4, 52, 6, 7]

console.log(marcas.sort())

console.log(n.sort((a,b) => {
    return a - b; // Ordena do menor para o maior
}))


/* 

O metodo flat() é usado para desembrulhar sub-arrays dentro de arrays, ele não modifica o array original
Recebe como parametro(opcional) um nível de profundidade que especifica o quanto o array aninhado deve ser achatado, se for omitido, por padrão leva 1 como valor.

*/

let num = [1, 2, 3, [4], [[5, 6]]];

let novoArray = num.flat();
console.log(novoArray)

novoArray = num.flat(2)
console.log(novoArray)

/* 

O metodo includes() verifica a existencia de um elemento no array, retornando true se existir e false se não existir.
Recebe 2 parametros (elemento(valor que está procurando), inicio(indice na qual se iniciara a busca))

*/

numeros = [3, 4, 5, 6, 7];

let existe = numeros.includes(4)
console.log(existe)

existe = numeros.includes(2,4)
console.log(existe)

/* 

O metodo find() retorna o primeiro valor que cumprir a condicao especificada na callback. A callback irá retorar true ou false, e receberá 3 parametros. 
(elemento(elemento atual do array), indice(opcional, posição atual do elemento), (array(array que está sendo percorrido)))

*/
let moedas = [
    { nome: 'Bitcoin', simbolo: 'BTC' },
    { nome: 'Bitcoin', simbolo: 'BTC222' },
    { nome: 'Ethereum', simbolo: 'ETH' },
    { nome: 'Cardano', simbolo: 'ADA' }
];



console.log(moedas.find((moedas) => {
    return moedas.nome == "Bitcoin"
}))