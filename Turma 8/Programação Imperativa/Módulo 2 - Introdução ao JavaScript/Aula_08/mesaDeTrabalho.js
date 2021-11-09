// 1

function podeIr(altura, acompanhante) {
  if (altura > 1.4 && altura < 2) {
    return true
  } else if (altura < 1.4 && altura > 1.2) {
    return acompanhante
  } else if (altura <= 1.2 || altura > 2) {
    return 'Acesso negado !'
  }
}

console.log()
console.log(podeIr(1.41))
console.log()
console.log(podeIr(1.39, false))
console.log()
console.log(podeIr(2.1))
console.log()
console.log(podeIr(1.19))
console.log()

// 2

function podeSubir(altura) {
  if (altura > 1.4 && altura < 2) {
    return 'Acesso autorizado !'
  } else if (altura < 1.4 && altura > 1.2) {
    return 'Acesso autorizado somente com acompanhante.'
  } else if (altura < 1.2 || altura > 2) {
    return 'Acesso negado !'
  }
}

console.log(podeSubir(1.41))
console.log('Maior que 1.40 metros')
console.log()
console.log(podeSubir(1.39))
console.log('Menor que 1.40 metros')
console.log()
console.log(podeSubir(2.1))
console.log('Maior que 2 metros')
console.log()
console.log(podeSubir(1.19))
console.log('Menor que 1.2 metros')
