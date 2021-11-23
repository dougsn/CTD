const fs = require('fs');
const path = require('path');

let caminhoArquivo = path.join("prova.txt") 

fs.appendFileSync(caminhoArquivo, "Prova 2");

