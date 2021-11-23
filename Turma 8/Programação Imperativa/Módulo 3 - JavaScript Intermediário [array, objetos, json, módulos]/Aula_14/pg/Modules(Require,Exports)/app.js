const fs = require('fs');

let moment = require('moment');

const herois = require('./superHerois');

let data = moment().format('MMM do YY');

let dados = fs.readFileSync(__dirname + '/dados.txt', 'utf8');

// O __dirname (pega a raiz do diretório), o restante é o nome do arquivo e como ele deve ser apresentado



console.log(herois)