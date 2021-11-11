let primeiroArray = [] //  como é  um array

let cores = ['Roxo', 'Laranja', 'Azul']

// .push() -> Adiciona um ou mais elementos ao FINAL do ARRAY

console.log()
console.log(cores)
console.log('O método push adiciona um ou mais elementos ao FINAL do ARRAY')
cores.push('Violeta', 'Cinza', 'Ouro')
console.log(cores)

console.log()
console.log()
// .pop() -> Elimina o ÚLTIMO elemento de um array

let ultimaCor = cores.pop()
console.log('O método pop() ELIMINA o ÚLTIMO elemento de um ARRAY')
console.log(cores)
console.log(ultimaCor)
console.log()
//  .shift() -> Elimina o PRIMEIRO elemento de um  array

console.log('O método shift() ELIMINA o PRIMEIRO elemento de um ARRAY')
let primeiraCor = cores.shift()
console.log(cores)
console.log(primeiraCor)
console.log()
// .unshift() -> Adiciona um ou mais elementos ao INÍCIO de um array
console.log(
  'O método .unshift() ADICIONA um ou mais elementos ao INÍCIO de um ARRAY'
)
cores.unshift('Violeta')
console.log(cores)
console.log()
// .join() -> JUNTA os elementos de um array usando um SEPARADOR que especificamos. Se não especificar, use VÍRGULAS.

console.log(
  'O método join() é o oposto do split(), pois transformar em "string", JUNTA os elementos de um ARRAY usando um SEPARADOR que especificamos. Se não especificar, usa VÍRGULAS.'
)
console.log()
let separadosPorVirgula = cores.join()
console.log(separadosPorVirgula)
let separadosPorTraco = cores.join(' - ')
console.log(separadosPorTraco)
console.log()
// .lastIndexOf() -> Similar ao .indexOf(), exceto que ele começa procurando pelo  elemento no finaldo array (de trás para frente). Se houver repetidos, retornará o primeiro que encontrar.
console.log(
  'O método lastIndexOf() é similar ao .indexOf(), exceto que ele começa procurando pelo elemento no finaldo array (de trás para frente). Se houver repetidos, retornará o primeiro que encontrar'
)
console.log(cores.lastIndexOf('Laranja'))
console.log()
// .includes() -> Similar ao .indexOf(),mas retorna um booleano.
console.log(
  'O método includes() é similar ao .indexOf(),mas retorna um booleano.'
)
console.log(cores.includes('Laranja'))
console.log(cores.includes('Abacaxi'))
