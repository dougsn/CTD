/*


2 - MOLDE AS INFORMAÇÕES DO ARQUIVO https://drive.google.com/file/d/16L2NejZU49mCLbo6RTmSKtuElOTOYUXv/view
PARA O FORMATO JSON, E EXPORTE ESSE JSON COMO MODULO

3 - DESENVOLVA UM ALGORITOMO QUE IRA RECEBER O MODULO ARRAY DE JSON E CRIE DINAMICAMENTE OS 
OBJETOS CONTA BANCARIA EM UM SEGUNDO ARRAY LISTA USUARIOS ARMAZENE ESSE OBJETOS 

4 - CRIE DE UM OBJETO LITERAL CHAMADO BANCO QUE TERÁ UMA PROPRIEDADE CHAMADA CLIENTES, ELE SERÁ COMPOSTO 
PELA LISTA DE OBJETOS GERADOS NO PONTO ANTERIOR.

5 - O OBJETO DO BANCO CRIARÁ UM MÉTODO CHAMADO CONSULTARCLIENTE QUE RECEBERÁ UM
NOME (TITULAR) POR PARÂMETRO E DEVE PESQUISAR NA LISTA DE CONTAS E RETORNAR AO
OBJETO DO CLIENTE QUE CORRESPONDE A ESSE NOME INSERIDO.


*/

// 2


let json = {
  "conta1": {
    "numero":5486273622,
    "tipo":"Conta Corrente",
    "saldo":27771,
    "titular":"Abigael Natte"
  },
  "conta2": {
    "numero":1183971869,
    "tipo":"Conta Poupança",
    "saldo":8675,
    "titular":"Ramon Connell"
  },
  "conta3": {
    "numero":9582019689,
    "tipo":"Conta Poupança",
    "saldo":27363,
    "titular":"Jarret Lafuente"
  },
  "conta4": {
    "numero":1761924656,
    "tipo":"Conta Poupança",
    "saldo":32415,
    "titular":"Ansel Ardley"
  },
  "conta5": {
    "numero":7401971607,
    "tipo":"Conta Poupança",
    "saldo":18789,
    "titular":"Jacki Shurmer"
  },
  "conta6": {
    "numero":630841470,
    "tipo":"Conta Corrente",
    "saldo":28776,
    "titular":"Jobi Mawtus"
  },
  "conta7": {
    "numero":4223508636,
    "tipo":"Conta Corrente",
    "saldo":2177,
    "titular":"Thomasin Latour"
  },
  "conta8": {
    "numero":185979521,
    "tipo":"Conta Poupança",
    "saldo":25994,
    "titular":"Lonnie Verheijden"
  },
  "conta9": {
    "numero":3151956165,
    "tipo":"Conta Corrente",
    "saldo":7601,
    "titular":"Alonso Wannan"
  },
  "conta10": {
    "numero":2138105881,
    "tipo":"Conta Poupança",
    "saldo":33196,
    "titular":"Bendite Huggett"
  },
} 



let contaJson = [json.conta1,json.conta2,json.conta3,json.conta4,json.conta5,json.conta6,json.conta7,json.conta8,json.conta9,json.conta10];
// console.log(contaJson[0])
// console.log(contaJson)

module.exports = contaJson;











// Mudar para esse tipo de array

// let arquivos = [
//   {
//       "numero": "5486273622",
//       "tipo": "Conta Corrente",
//       "saldo": "27771",
//       "titular": "Abigael Natte"
//   },
//   {
//       "numero": "1183971869",
//       "tipo": "Conta Poupança",
//       "saldo": "8675",
//       "titular": "Ramon Connell"
//   },
//   {
//       "numero": "9582019689",
//       "tipo": "Conta Poupança",
//       "saldo": "27363",
//       "titular": "Jarret Lafuente"
//   },
//   {
//       "numero": "1761924656",
//       "tipo": "Conta Poupança",
//       "saldo": "32415",
//       "titular": "Ansel Ardley"
//   },
//   {
//       "numero": "7401971607",
//       "tipo": "Conta Poupança",
//       "saldo": "18789",
//       "titular": "Jacki Shurmer"
//   },
//   {
//       "numero": "630841470",
//       "tipo": "Conta Corrente",
//       "saldo": "28776",
//       "titular": "Jobi Mawtus"
//   },
//   {
//       "numero": "4223508636",
//       "tipo": "Conta Corrente",
//       "saldo": "2177",
//       "titular": "Thomasin Latour"
//   },
//   {
//       "numero": "185979521",
//       "tipo": "Conta Poupança",
//       "saldo": "25994",
//       "titular": "Lonnie Verheijden"
//   },
//   {
//       "numero": "3151956165",
//       "tipo": "Conta Corrente",
//       "saldo": "7601",
//       "titular": "Alonso Wannan"
//   },
//   {
//       "numero": "2138105881",
//       "tipo": "Conta Poupança",
//       "saldo": "33196",
//       "titular": "Bendite Huggett"
//   }
// ]