// Basicamente um callback é uma função que é passado como parâmetro para outra função.



const somar = (a,b) =>  a + b ;


const calculadora = (a,b, operacao) => operacao(a,b);


console.log();
console.log(calculadora(10,20, somar))
console.log();
console.log(calculadora(10,20, (a,b) => a - b))


// Exemplo do PG


function nomeCompleto(nome, sobrenome) {
    console.log(nome + ' ' + sobrenome);
}

function bomDia(nome,sobrenome,callback){
    return 'Olá' + callback(nome,sobrenome)
}

bomDia('Douglas','Silva',nomeCompleto)