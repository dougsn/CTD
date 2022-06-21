const { soma } = require("../calc"); // Importando o arquivo com a função soma


describe('Testes de soma', () => { 

    test('Soma de dois numeros', () => { 
        expect(soma(2,2)).toBe(4);
    })

})

