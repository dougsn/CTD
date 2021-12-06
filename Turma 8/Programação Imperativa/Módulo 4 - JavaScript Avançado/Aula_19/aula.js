// função construtora para criar os objetos dinamicamente e popular um array com os novos objetos

const arrayPessoas = [
  {
    sexo: 'F',
    nome: 'Abigael Natte',
    altura: 1.61
  },
  {
    sexo: 'M',
    nome: 'Ramon Connell',
    altura: 1.75
  },
  {
    sexo: 'M',
    nome: 'Jarret Lafuente',
    altura: 1.55
  },
  {
    sexo: 'F',
    nome: 'Ansel Ardley',
    altura: 1.67
  },
  {
    sexo: 'F',
    nome: 'Jacki Shurmer',
    altura: 1.75
  },
  {
    sexo: 'M',
    nome: 'Jobi Mawtus',
    altura: 1.88
  },
  {
    sexo: 'M',
    nome: 'Thomasin Latour',
    altura: 1.67
  },
  {
    sexo: 'F',
    nome: 'Lonnie Verheijden',
    altura: 1.63
  },
  {
    sexo: 'M',
    nome: 'Alonso Wannan',
    altura: 1.92
  },
  {
    sexo: 'F',
    nome: 'Bendite Huggett',
    altura: 1.8
  }
]

// 1 -> .sort()

function maiorEMenorPessoa(array) {
  let pessoasCresc = arrayPessoas.sort((a, b) => {
    return a.altura - b.altura
  })

  let menor = pessoasCresc[0] // retorna o primeiro
  let maior = pessoasCresc[pessoasCresc.length - 1] // retorna o último (maior)

  console.log(
    `A menor pessoa do grupo é ${menor.nome} com ${menor.altura} \nE a maior é ${maior.nome} com ${maior.altura}`
  )
}
console.log();
maiorEMenorPessoa(arrayPessoas)
console.log();
// function maiorMenorPessoa(listaPessoas) {
//   let pessoasCresc = listaPessoas.sort(
//       (a, b) => {
//           return a.altura - b.altura;
//       }
//   );

//   let menorPessoa = pessoasCresc[0];
//   let maiorPessoa = pessoasCresc[pessoasCresc.length -1];

//   return `maior pessoa ${maiorPessoa.nome}: ${maiorPessoa.altura}m, \nmenor pessoa ${menorPessoa.nome}: ${menorPessoa.altura}m`
// }

//  console.log(maiorMenorPessoa(listaPessoas))

// 2 -> .filter(filtrar as mulheres)

function mediaMulheres(array) {
  let arrayMulheres = arrayPessoas.filter(sexo => {
    if (sexo.sexo == 'F') {
      return sexo
    }
  })
  // console.log(arrayMulheres)
  let somaAltura = arrayMulheres.map(sexo => {
    return sexo.altura
  })
  // console.log(somaAltura)

  let mediaAltura = somaAltura.reduce((acum, element) => {
    return acum + element
  })

  let mediaTotal = mediaAltura / arrayMulheres.length
  console.log(`A média de altura das mulheres é: ${(mediaTotal).toFixed(3)}`)
}

console.log();
mediaMulheres(arrayPessoas)
console.log();

// 3

function numHomens(array) {
  let arrayHomens = array.filter(sexo => {
    return sexo.sexo == 'M'
  })
  console.log(`O número de homens é: ${arrayHomens.length}`)
}
numHomens(arrayPessoas)
console.log();