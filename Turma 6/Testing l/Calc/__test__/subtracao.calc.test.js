const { subtracao } = require("../calc"); // Importando o arquivo com a função soma


describe('Testes de subtracao', () => { 

    test('Subtracao de dois numeros', () => { 
        expect(subtracao(4,2)).toBe(2);
    })

    test('Subtracao de dois zeros', () => { 
        expect(subtracao(0,0)).toBe(0);
    })

    test('Subtracao de strings', () => { 
        expect(subtracao('a', 'b')).toBe(NaN);
    })

    test('Subtracao de numeros negativo com positivo', () => { 
        expect(subtracao(-5, 5)).toBe(-10);
    })

    test('Subtracao de numeros negativos', () => { 
        expect(subtracao(-5, -5)).toBe(0);
    })

})

