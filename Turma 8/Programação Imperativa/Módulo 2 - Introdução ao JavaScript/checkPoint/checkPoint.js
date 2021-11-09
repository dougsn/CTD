let tempo;

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
    case 'Brigadeiro':
      tempo = 8
      break
    default:
      console.log('Prato inexistente')
      break
  }
  if (tempoEscolhido > 2 * tempo && tempoEscolhido < 3 * tempo) {
    console.log('Comida queimou')
  } else if (tempoEscolhido < tempo) {
    console.log('Tempo insuficiente')
  } else if (tempoEscolhido > 3 * tempo) {
    console.log('Kabuuuuuuuuuuuuuuuuuum !')
  } else {
    console.log('Prato pronto, bom apetite!')
  }
}
console.log()
menuMicroondas('Pipoca', 21)
console.log()
menuMicroondas('Macarrão', 7)
console.log()
menuMicroondas('Carne', 46)
console.log()
menuMicroondas('Feijão', 12)
console.log()
menuMicroondas('Brigadeiro', 8)
console.log()
menuMicroondas('Chocolate', 2)
console.log()
