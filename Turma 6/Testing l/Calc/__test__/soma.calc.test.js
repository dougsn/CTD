const { soma } = require("../calc"); // Importando o arquivo com a função soma


describe('Testes de soma', () => { 

    test('Soma de dois numeros', () => { 
        expect(soma(2,2)).toBe(4);
    })

    test('Soma de dois zeros', () => { 
        expect(soma(0,0)).toBe(0);
    })

    test('Soma de dois nulos', () => { 
        expect(soma(null,null)).toBe(0);
    })

    test('Soma de string', () => { 
        expect(soma('a','b')).toBe('ab');
    })

})

