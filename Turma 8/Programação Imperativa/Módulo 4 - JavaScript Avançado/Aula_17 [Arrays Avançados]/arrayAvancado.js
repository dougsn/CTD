// o método .map() que executa um callback e é resposável por retornar um array novo com a msm qtd do array original, ele faz um loop no array e retorna um novo array modificado. Sempre se usa o RETURN, pois vai retorar um novo array

let listaNumeros = [1, 2, 3, 4, 5, 6]

let listaNumeroDobro = listaNumeros.map((valor, indice) => {
  return valor * 2
})

console.log(listaNumeros)
console.log(listaNumeroDobro)

// o método .filter() filtra o array especificado , ele faz isso com base em alguma condição que esteja dentro do callback. Ele retorna uma array que somente atendam a condição especificada.

let filtro = listaNumeros.filter((condicao, indice) => {
  return condicao > 3
})

console.log(filtro)

// o método .reduce() visa reduzir o array fornecida à mínima expressão, retornando como resultado um valor único. O callback recebe agora 2 parâmetros. O primeiro será o acumulador e o segundo será o elemento atual.

let soma = listaNumeros.reduce((incremento, valor) => {
  return incremento + valor
})

console.log(soma)
/* 

 O incremento é como se fosse uma variável que guardo o resultado do valor, o valor é o elemento atual do array.
1, 2, 3, 4, 5, 6
 incremento + valor | incremento + valor | incremento + valor | incremento + valor
 0 + 1              |  1 + 2             | 3 + 3              | 6 + 4

 incremento + valor | incremento + valor | incremento + valor
 10 + 5             |  15 + 6            | 21
 
*/

// o método forEach() não retorna nada, a sua única função é iterar(percorrer) sobre um array.

let valorIndice = listaNumeros.forEach((valor, indice) => {
  console.log(`O valor é: ${valor} e a sua posição é: ${indice}`)
})

valorIndice
