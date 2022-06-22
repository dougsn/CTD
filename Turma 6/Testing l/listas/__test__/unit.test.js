const { generateText } = require('../util');

describe('Validação de texto de saída', () => {
    
    test('Saida de nome e idade', () => { 
        const text = generateText("Douglas Silva",23)
        expect(text).toBe("Douglas Silva (23 anos)")
    })
    
});

