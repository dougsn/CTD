const { validateInput } = require('../util');



describe('Validando os inputs', () => { 
    test('Validando input', () => { 
        const text = validateInput('texto');
        expect(text).toBeTruthy;
    })

    test('Validando input sem informação', () =>{
        const ret = validateInput();
        expect(ret).toBeFalsy();
    });

    test('Validate Input function number', () =>{
        const ret = validateInput(null,true,false);
        expect(ret).toBeFalsy();
    });
    test('Validate Input function text empty', () =>{
        const ret = validateInput(" ",true,false);
        expect(ret).toBeFalsy();
    });
    test('Validate Input function text NaN', () =>{
        const ret = validateInput(NaN,false,true);
        expect(ret).toBeFalsy();
    });
 })

   
    