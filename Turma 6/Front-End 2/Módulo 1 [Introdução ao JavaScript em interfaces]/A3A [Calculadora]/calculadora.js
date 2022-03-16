let somar = require('./somar')
let subtrair = require('./subtrair')
let multiplicar = require('./multiplicar')
let dividir = require('./dividir')







console.log(somar(2,2));
console.log(subtrair(12,2));
console.log(multiplicar(10,2));
console.log(multiplicar(0,2));
console.log(dividir(20,2));
console.log(dividir(0,2));

// No entanto, nos coloca para pensar...

// O que teria acontecido se, em vez de gerar um arquivo para cada operação matemática, tivéssemos programado tudo no mesmo arquivo?

    // R: Teriamos que construir todas as funções em um arquivo só, e consequentemente ficaria um pouco mais "Bagunçado" e maior.
    
// Por que o melhor caminho é gerar diferentes arquivos e depois requerê-los em um único arquivo?

    // R: Para mantermos a organização e usarmos apenas o que for necessário em nosso arquivo principal

// Esta metodologia de trabalho será uma constante a partir de agora?

    // R: Com certeza...