


// 3 - DESENVOLVA UM ALGORITOMO QUE IRA RECEBER O MODULO ARRAY DE JSON E CRIE DINAMICAMENTE OS  OBJETOS CONTA BANCARIA EM UM SEGUNDO ARRAY LISTA USUARIOS ARMAZENE ESSE OBJETOS 






const json = require('./json') // Exportando o arquivo


let listaUsuarios = [] // Criando o array que ficara responsavel por receber as contas

function Conta(numero, tipo, saldo, titular) {
  this.numero = numero
  this.tipo = tipo        // Função construtora responsavel pela criação das contas
  this.saldo = saldo
  this.titular = titular
}


for (let i = 0; i < json.length; i++) {
  listaUsuarios.push(new Conta(json[i].numero, json[i].tipo,json[i].saldo,json[i].titular));
} 

// Laço de repetição responsavel por criar os objetos das contas bancarias dinamicamente e colocar no array com o push().




// 4 - CRIE DE UM OBJETO LITERAL CHAMADO BANCO QUE TERÁ UMA PROPRIEDADE CHAMADA CLIENTES, ELE SERÁ COMPOSTO  PELA LISTA DE OBJETOS GERADOS NO PONTO ANTERIOR.


// (consultarClientes) -> Metodo responsavel por ler o array criado com as contas bancarias e comparar o nome escolhido para acessar as informações do usuarios 

let banco = { 
  cliente:listaUsuarios,
  consultarClientes: (titular) => {   
    for (let i = 0; i < listaUsuarios.length; i++) {
      
      if(listaUsuarios[i].titular == titular){
        console.log(listaUsuarios[i])
      }
      
    }
  }
};


// 5 - O OBJETO DO BANCO CRIARÁ UM MÉTODO CHAMADO CONSULTARCLIENTE QUE RECEBERÁ UM NOME (TITULAR) POR PARÂMETRO E DEVE PESQUISAR NA LISTA DE CONTAS E RETORNAR AO OBJETO DO CLIENTE QUE CORRESPONDE A ESSE NOME INSERIDO.

banco.consultarClientes('Abigael Natte')

banco.consultarClientes('Ramon Connell')