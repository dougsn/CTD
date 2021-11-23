// 1 -> Primeiro temos que fazer o laço de repetição (FOR), para que o array seja 'lido' com o length e de acordo com a condição if() dentro do for, acrescente mais  1 ponto ao participante. Após finalizar essa parte, e feito um if() fora do for(), para verificar qual dos participantes tinha mais pontos, e por fim, retornar o resultado do ganhador.

// Observações..: Tomar cuidado com o retorno, se utilizar o RETURN não esquecer de quando chamar a função para execução, utilizar o console.log(). Caso não utilize o RETURN mais sim o CONSOLE.LOG() dentro da função, chamar a função apenar pelo seu nome e passando os seus devidos parâmetros.

const alicia = [ 23, 82, 46 ];
const bob = [ 45, 8, 32];

function encontrarGanhador(a,b){
   
    let pontosPrimeiroParticipante = 0;
    let pontosSegundoParticipante = 0;

    for(let i = 0; i <= b.length; i++){
        

        if(a[i] > b[i]){
            pontosPrimeiroParticipante += 1;
        } else if(a[i] < b[i]){
            pontosSegundoParticipante += 1;
        }
       
    }

    if(pontosPrimeiroParticipante > pontosSegundoParticipante){
        console.log("O vencedor é o primeiro participante")
    } else if(pontosSegundoParticipante > pontosPrimeiroParticipante){
        console.log("O vencedor é o segundo participante")
    } else {
        console.log("Empate")
    }
   
}
// console.log()
// encontrarGanhador(alicia,bob)
// console.log()

// 2

function digitalHouse(a,b){
    
    for (let i = 0; i <= 100; i++) {
        console.log(i)

        if(i % a == 0){
            console.log("Digital")
        }  
        if(i % b == 0){
            console.log("House")
        }  
        if (i % a == 0 && i % b == 0){
            console.log("Digital House")
        }
    }
}

// digitalHouse(2, 4)


// 3 

function somaArray(array){

    for (let i = 0; i < array.length; i++) {
        console.log(array[i])
        
    }
}

somaArray(["o","l","a"]);
console.log()
somaArray(["t","c","a","u"])