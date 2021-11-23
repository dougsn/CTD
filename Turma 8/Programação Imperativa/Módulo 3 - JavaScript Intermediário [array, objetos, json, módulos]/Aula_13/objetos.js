// O this.valor faz a referencia ao objeto global, ele acesso 'fora' do seu contexto lexico presente.



let pais = {
  nome: 'Brasil',
  capital: 'Brasilia',
  nacionalidade: function () {
    return `Sou do ${this.nome}`
  }
}

// console.log(pais.nacionalidade())

let carro = {
  marca: 'Fiat',
  modelo: 'Uno'
}


// Função construtora

function Carro(valorMarca, valorModelo) {
  this.marca = valorMarca
  this.modelo = valorModelo
}

let meuCarro = new Carro("Ford","Falcon")
let outroCarro = new Carro("Chevrolet","Corvette")

console.log()
console.log(carro)
console.log(meuCarro)
console.log(outroCarro)
console.log()



// A função construtra se inicia com o nome em maiusculo, para que a pessoa saiba que aquela função é um 'construtora de objetos literais'.


// Na função construtora, se utiliza o 'new' e o nome da função em seguida, pois é para que o javascript possa entender que estamos criando um novo objeto com a nossa função construtora.