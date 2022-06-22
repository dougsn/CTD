const { createElement } = require('../util');

describe('Criando elementos', () => { 
    test('Criando novos elementos com dados', () => {
        const element = createElement('li', "exampleElement", 'user-item');
        expect(element.textContent).toBe("<li class='user-item'>exempleElement</li>");
    });
    test('Create new element without data', () => {
        const element = createElement(null);
        expect(element.textContent).toBe("");
    });
 })