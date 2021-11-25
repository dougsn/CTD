// Exercício 1 até o 3




function Conta(numero,tipo,saldo,titular){
    this.numero = numero;
    this.tipo = tipo;
    this.saldo = saldo;
    this.titular = titular;
}

let conta1 = new Conta('5486273622','Conta Corrente',27771,'Abigael Natte');
let conta2 = new Conta('1183971869','Conta Poupança',8675,'Ramon Connell');
let conta3 = new Conta('9582019689','Conta Poupança',27363,'Jarret Lafuente');
let conta4 = new Conta('1761924656','Conta Poupança',32415,'Ansel Ardley');
let conta5 = new Conta('7401971607','Conta Poupança',18789,'Jacki Shurmer');
let conta6 = new Conta('630841470','Conta Corrente',28776,'Jobi Mawtus');
let conta7 = new Conta('4223508636','Conta Corrente',2177,'Thomasin Latour');
let conta8 = new Conta('185979521','Conta Poupança',25994,'Lonnie Verheijden');
let conta9 = new Conta('3151956165','Conta Corrente',7601,'Alonso Wannan');
let conta10 = new Conta('2138105881','Conta Poupança',33196,'Bendite Huggett');




// console.log(conta1)
// console.log()
// console.log(conta2)
// console.log()
// console.log(conta3)
// console.log()
// console.log(conta4)
// console.log()
// console.log(conta5)
// console.log()
// console.log(conta6)
// console.log()
// console.log(conta7)
// console.log()
// console.log(conta8)
// console.log()
// console.log(conta9)
// console.log()
// console.log(conta10)

// Exercício 4 até o 8

let lista = [conta1,conta2,conta3,conta4,conta5,conta6,conta7,conta8,conta9,conta10]

console.log(lista)

let banco = {
    cliente: lista,
    consultarCliente: (nome) => {
         for (let i = 0; i < lista.length; i++) {
                if(nome == lista[i].titular){
                    console.log(lista[i])
             }
             
         }
    },
    deposito: (titular,deposito) => {
        for (let i = 0; i < lista.length; i++) {
            
            if(titular == lista[i].titular){
                let novoSaldo = lista[i].saldo + deposito;
                console.log(`Depósito realizado, seu novo saldo é: ${novoSaldo}`)
            }
            
        }
    },
    extrato: (titular,valorExtraido) => {
        for (let i = 0; i < lista.length; i++) {
            let extrato = lista[i].saldo - valorExtraido;
            if(titular == lista[i].titular){
                if(extrato < 0){
                    console.log('Fundos insuficientes')
                } else {
                    console.log(`Extração feita com sucesso, seu novo saldo é: ${extrato}`)
                }
            } 
        }
    }
}

console.log();
banco.consultarCliente("Jobi Mawtus");

console.log();
banco.deposito("Jobi Mawtus",4)
console.log();

console.log();
banco.extrato("Jobi Mawtus",4)
console.log();

console.log();
banco.extrato("Jobi Mawtus",28779)
console.log();


module.exports = banco;
module.exports = lista;


// cheguei até o número 7. terminar o número 8