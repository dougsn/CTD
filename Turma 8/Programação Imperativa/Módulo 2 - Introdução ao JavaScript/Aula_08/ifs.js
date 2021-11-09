let pipoca = 10;
let macarrao = 8;
let carne = 15;
let feijao = 12;
let brigadeiro = 8;

function menuMicroondas(comida,tempo){
   

    if(tempo >= 2 * comida){
        return console.log('A comida queimou');
    } else if(tempo < comida){
        return console.log('Tempo insuficiente');
    } else if((comida != pipoca) && (comida != macarrao) && (comida != carne) && (comida != feijao) && (comida != brigadeiro)){
        return console.log('Prato inexistente');
    } else if(tempo > 3 * comida){
        return console.log('Kabumm');
    } else {
        return console.log('Prato pronto, bom apetite!!!')
    }


}

menuMicroondas(pipoca,20);
console.log();
menuMicroondas(pipoca,9);
console.log();
menuMicroondas(feijao,24);
console.log();
menuMicroondas('chocolate',24);
console.log();
menuMicroondas(carne,46);
