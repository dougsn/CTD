import '';



let escolhaUsuario = parseInt(prompt("Escolha a opção da operação matemática: \n 1 - somar \n 2 - subtrair \n 3 - multiplicar \n 4 - dividir"))

console.log(escolhaUsuario);

let num1 = parseInt(prompt("Escolha um número: "))
let num2 = parseInt(prompt("Escolha outro número: "))

console.log(num1);
console.log(num2);

if(escolhaUsuario === 1) { // soma2
    console.log(num1 + num2);
} else if(escolhaUsuario === 2) { // subtração
    console.log(num1 - num2);
} else if(escolhaUsuario === 3){ // multiplicação
    if(num1 === 0 || num2 === 0){
        console.log(0);
    } else {
        console.log(num1 * num2);
    }
} else if(escolhaUsuario === 4){ // divisão
    if(num1 === 0 || num2 === 0){
        console.log("Não se pode dividir por zero");
    } else {
        console.log(num1 / num2)
    }
}

