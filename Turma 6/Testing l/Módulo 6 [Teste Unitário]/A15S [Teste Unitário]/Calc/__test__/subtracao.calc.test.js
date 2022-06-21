const { subtracao } = require("../calc"); // Importando o arquivo com a função soma


describe('Testes de subtracao', () => { 

    test('Subtracao de dois numeros', () => { 
        expect(subtracao(4,2)).toBe(2);
    })

})

