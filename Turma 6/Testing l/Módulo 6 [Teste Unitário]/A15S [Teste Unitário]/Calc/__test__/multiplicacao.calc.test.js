const { multiplicacao } = require("../calc"); // Importando o arquivo com a função soma


describe('Testes de multiplicacao', () => { 

    test('Multiplicacao de dois numeros', () => { 
        expect(multiplicacao(4,2)).toBe(8);
    })

})

