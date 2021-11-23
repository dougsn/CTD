// 1

let filmes = ['star wars','totoro','rocky','pulp fiction','a vida é bela'];
let filme2 = ['toy story', 'finding Nemo', 'kung-fu panda', 'wally', 'fortnite']

function converterMaiusculas(array){
    for (let i = 0; i < array.length; i++) {
        // console.log(array[i] = array[i].toUpperCase());
        console.log(array[i].toUpperCase())
        
    }
}

// converterMaiusculas(filmes);


// 2 e 3

// Primeiro é colocado na constante intruso, o valor que foi erradamente para o array animado. Com isso é feito a passagem dos arrays com o FOR(), e por fim e retornado o valor do array1, que é responsavel por receber os valores do array2.

function passagemDeElementos(array1, array2){
    const intruso = array2.pop()
    for (let i = 0; i < array2.length; i++) {
        
        array1.push(array2.pop().toUpperCase())
    
    }

    console.log(`O filme intruso é: ${intruso}`)
    return array1;

}

// console.log(passagemDeElementos(filmes,filme2))

// 4

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

function compararClassificacoes(asia, europa) {
  let comparacoesAsiaEuropa = []
//   comparacoesAsiaEuropa[0] = asia[0] === europa[0]
//   comparacoesAsiaEuropa[1] = asia[1] === europa[1]
//   comparacoesAsiaEuropa[2] = asia[2] === europa[2]
//   comparacoesAsiaEuropa[3] = asia[3] === europa[3]

    for (let i = 0; i < asia.length; i++) {
        comparacoesAsiaEuropa[i] = asia[i] === europa[i];
    }

    console.log(comparacoesAsiaEuropa)
}

// compararClassificacoes(asiaScores,euroScores)

// Bônus extra



const ParticipanteA = [5, 8, 4, 9, 5]
const ParticipanteB = [8, 7, 8, 6, 8]
const ParticipanteC = [7, 5, 10, 8, 3] 

let soma = 0;

function pontuacaoMedia(participante){
    for (let i = 0; i < participante.length; i++) {
        soma += participante[i];
    }
    let media = soma /5;
    console.log(media)
}

// pontuacaoMedia(ParticipanteB)


function pontuacaoMaior(participante){
    
    console.log(Math.max.apply(Math,participante))
}

// pontuacaoMaior(ParticipanteB)



function competicao(participante1,participante2,participante3){
    let mediaA = pontuacaoMedia(participante1)
    let maiorA = pontuacaoMaior(participante1)
    
    let mediaB = pontuacaoMedia(participante2)
    let maiorB = pontuacaoMaior(participante2)

    let mediaC = pontuacaoMedia(participante3)
    let maiorC = pontuacaoMaior(participante3)

   if( mediaA > mediaB && mediaA > mediaC){
       console.log("ParticipanteA é o vencedor da Media entre todos")
   }else if(mediaB > mediaA && mediaB > mediaC){
    console.log("ParticipanteB é o vencedor da Media entre todos")
   }else if (mediaC > mediaB && mediaC > mediaA){
    console.log("ParticipanteC é o vencedor da Media entre todos")
   }
   
}

competicao(ParticipanteA,ParticipanteB,ParticipanteC)