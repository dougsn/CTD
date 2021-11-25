

const somar = () => {
    console.log("Estou em uma arrow function")
}

console.log();
somar();




const horaAtual = () => {
    let data = new Date();

    return 'A hora atual é: ' + data.getHours() + ':' + data.getMinutes();
}

console.log()
console.log(horaAtual())


// Micro Desafio


let print = (mensagem) => {
    console.log(mensagem)
}

console.log()
print('Olá, bom dia')


let soma = (n1,n2) => {
    console.log(n1 + n2);
}

console.log()
soma(10,10);