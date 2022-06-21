const { divisao } = require("../calc"); // Importando o arquivo com a função soma


describe('Testes de divisao', () => { 

    test('Divisao de dois numeros', () => { 
        expect(divisao(10,2)).toBe(5);
    })

})

