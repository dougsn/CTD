// 	Crie o método que permite adicionar alunos à lista do curso, ou seja, quando chamamos nosso método em nosso objeto curso, deverá adicionar um aluno a mais na propriedade lista de estudantes do objeto curso.

// Micro desafio - Passo 5

// 	Crie um método para o objeto curso que receba um aluno (como parâmetro) e retorne true se ele aprovou no curso ou false em caso de reprovação. Para ser aprovado, o aluno tem que ter uma média igual ou acima da nota de aprovação  e ter menos faltas que faltas máximas. Se tiver a mesma quantidade, tem que estar 10% acima da nota de aprovação.// 	Crie o método que permite adicionar alunos à lista do curso, ou seja, quando chamamos nosso método em nosso objeto curso, deverá adicionar um aluno a mais na propriedade lista de estudantes do objeto curso.

// Micro desafio - Passo 5

// 	Crie um método para o objeto curso que receba um aluno (como parâmetro) e retorne true se ele aprovou no curso ou false em caso de reprovação. Para ser aprovado, o aluno tem que ter uma média igual ou acima da nota de aprovação  e ter menos faltas que faltas máximas. Se tiver a mesma quantidade, tem que estar 10% acima da nota de aprovação.



const Aluno = require('./aluno')

let curso = {
  nome: 'Programação Imperativa',
  notaAprovacao: 7,
  faltasMaximas: 3,
  listaEstudantes: [],
  adicionarAluno: function(aluno){
    this.listaEstudantes.push(aluno)
  },
  aprovacaoAluno: function(aluno) {
    let media = aluno.calcularMedia(aluno)
    if (aluno.qtdFaltas < this.faltasMaximas && media >= this.notaAprovacao) {
      return true
    } else if (
      aluno.qtdFaltas == this.faltasMaximas &&
      media >= this.notaAprovacao * 0.1
    ) {
      return true
    } else {
      return false
    }
  },
  estudantesAprovados: function() {
    let alunosAprovados = []

    this.listaEstudantes.forEach(element => {
      alunosAprovados.push(this.aprovacaoAluno(element))
    })

    return alunosAprovados
  }
}

// Micro desafio - Passo 6

// 	Crie um método para o objeto curso que percorra a lista de estudantes e retorne um array de booleanos com os resultados se os alunos aprovaram ou não.// Micro desafio - Passo 6

// 	Crie um método para o objeto curso que percorra a lista de estudantes e retorne um array de booleanos com os resultados se os alunos aprovaram ou não.

// Micro desafio - Passo 7
// 	Importe o módulo estudantes.js, que contém uma lista de alunos, dentro do arquivo que contém o objeto curso. Substitua o conteúdo da propriedade lista de estudantes, pela lista de estudantes do arquivo estudantes.js e garanta que sigam funcionando todos os métodos corretamente. (revisar que o arquivo tenha todos os métodos corretamente).


module.exports = curso
