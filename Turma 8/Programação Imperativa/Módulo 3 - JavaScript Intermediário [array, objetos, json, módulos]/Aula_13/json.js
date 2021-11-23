let pessoa = {
    nome:"Douglas",
    idade:22,
    altura:1.75
}

let listaCompras = ['pão','presunto','queijo'] // Com array funciona como se fosse um objeto.

let json = JSON.stringify(listaCompras); // O stringfy -> Converte um objeto/array em JSON

let objetoDeNovo = JSON.parse(json) // O parse ->  Converte um JSON em um objeto.



console.log()
console.log(json)
console.log()
console.log(objetoDeNovo)
console.log()