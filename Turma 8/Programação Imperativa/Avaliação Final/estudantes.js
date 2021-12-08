let Aluno = require('./aluno')
let curso = require('./curso')

let gustavo = new Aluno('gustavo', 2, [6, 7, 5, 8])
let taynan = new Aluno('taynan', 3, [7, 8, 5, 9])
let antonio = new Aluno('antonio', 4, [5, 9, 6, 8])
let marcel = new Aluno('marcel', 1, [7, 7, 7, 7])
let jonas = new Aluno('jonas', 2, [6, 5, 9, 9])
let douglas = new Aluno('douglas', 1, [7, 9, 6, 8])

console.log(douglas.calcularMedia())

console.log(gustavo.adicionarFalta())
console.log(taynan.qtdFaltas)

curso.adicionarAluno(douglas)
curso.adicionarAluno(gustavo)
curso.adicionarAluno(taynan)
curso.adicionarAluno(antonio)
curso.adicionarAluno(marcel)
curso.adicionarAluno(jonas)
// console.log(curso.listaEstudantes)

console.log(douglas.calcularMedia())
console.log(curso.aprovacaoAluno(douglas))

console.log(curso.estudantesAprovados())
