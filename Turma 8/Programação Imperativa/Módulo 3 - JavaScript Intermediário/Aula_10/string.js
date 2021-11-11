/*
  
  
  
 
 
*/

// .length -> Para saber o comprimento

let texto = 'Oi eu sou o Douglas'

console.log(texto.length)

//.indexOf() -> Para saber se algo existe. Neste caso retorna o local que tem o caracter S
// Caso retorne -1, quer dizer que ele não encontrou a palavra que foi colocado nos colchetes

console.log(texto.indexOf('s'))

// .slice() -> Para pegar uma parte do texto. Tem que dizer  aonde começa e aonde termina.

let palavra = texto.slice(0, 3)
console.log(palavra)

// .trim() ->  Para remover os espaços em branco, sempre no começa e no fim, nunca no meio.
let texto2 = '         Olá mundo'
console.log(texto2)
console.log(texto2.trim())

//  .split() -> converte um texto em um array.

console.log(texto.split(' '))

// .replace() ->  Para alterar uma parte do texto
console.log(texto.replace('Douglas', 'João'))
