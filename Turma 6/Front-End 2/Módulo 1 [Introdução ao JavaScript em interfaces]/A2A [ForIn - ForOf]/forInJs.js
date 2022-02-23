let carro = {
    nome: "fox",
    ano: "2011"
}

for(let props in carro){
    console.log(carro[props]);

    if(carro[props] === "fox"){
        console.log("Uauuuu, esse é um fox");
    }
};

// Funciona como forEach, se cria um variavel (props) para representar cada propriedade do meu objeto. o 'in' especifica em qual objeto a variavel (props) ira possuir as propriedades.

// O forIn nos permite iterar sobre cada uma das PROPRIEDADES de um OBJETO.