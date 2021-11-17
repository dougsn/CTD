/*
Precisamos desenvolver um menu para um microondas super veloz, onde teremos 5 opções de comida com seus respectivos tempos pré-definidos. 

      1 - Pipoca – 10 segundos (padrão);
      2 - Macarrão – 8 segundos (padrão);
      3 - Carne – 15 segundos (padrão);
      4 - Feijão – 12 segundos (padrão);
      5 - Brigadeiro – 8 segundos (padrão); 

- O usuário poderá alterar o tempo padrão, aumentando ou diminuindo de acordo com sua vontade. Se o tempo informado for maior que 2x o necessário, exibir mensagem que a comida queimou.
- Se o tempo for menor que o padrão, exibir a mensagem: "tempo insuficiente"; 
- Opções não listadas no menu, devem exibir uma mensagem de erro: "Prato inexistente";
- Se o tempo for 3x maior que o necessário para o prato, o microondas deve exibir a mensagem: “kabumm”;
- No final de cada tarefa, o microondas deverá exibir a mensagem: "Prato pronto, bom apetite!!!".*/
let tempo
function menuMicroondas(comida, tempoEscolhido) {
  switch (comida) {
    case 'Pipoca':
      tempo = 10
      break
    case 'Macarrão':
      tempo = 8
      break
    case 'Carne':
      tempo = 15
      break
    case 'Feijão':
      tempo = 12
      break
    case 'Brigadeiro':
      tempo = 8
      break
    default:
      console.log('Prato inexistente')
      break
  }

  if (tempoEscolhido > 2 * tempo && tempoEscolhido < 3 * tempo) {
    console.log('A comida queimou')
  } else if (tempoEscolhido < tempo) {
    console.log('Tempo Insuficiente')
  } else if (tempoEscolhido > 3 * tempo) {
    console.log('Kabuuuuuuuuum !!!')
  } else {
    console.log('Prato pronto, bom apetite !!!')
  }
}

console.log()
menuMicroondas('Pipoca', 21)
console.log()
menuMicroondas('Macarrão', 31)
console.log()
menuMicroondas('Chocolate', 1)
console.log()
