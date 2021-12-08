// Micro desafio - Passo 1

function Aluno(nome, qtdFaltas, notas) {
  this.nome = nome
  this.qtdFaltas = qtdFaltas
  this.notas = notas
  this.calcularMedia = function()  {
    return (
      this.notas.reduce((acum, elemento) => acum + elemento) / this.notas.length
    )
  }
  this.adicionarFalta = function()  {
    return this.qtdFaltas++
  }
}

// let listaAlunos = []

// listaAlunos.push(new Aluno('Douglas',2,[6,6,6,7]));
// listaAlunos.push(new Aluno('Marcos',4,[7,8,9,5]));
// listaAlunos.push(new Aluno('João',3,[6,5,4,9]));
// listaAlunos.push(new Aluno('Rodrigo',5,[9,5,7,6]));
// listaAlunos.push(new Aluno('Matheus',1,[5,8,9,7]));

module.exports = Aluno
