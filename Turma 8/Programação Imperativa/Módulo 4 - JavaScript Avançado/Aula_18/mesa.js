// Tentar usar as ferramentas novas (arrow function e métodos arrays)

// 1

function loopDePares(num) {
  for (let i = 0; i < 100; i++) {
    if ((num + i) % 2 == 0) {
      console.log(`O número ${num + i} é par`)
    }
  }
}

// loopDePares(5)

// 2

function loopDeImpares(num, palavra) {
  for (let i = 0; i < 100; i++) {
    if ((num + i) % 2 == 1) {
      console.log(`A palavra é ${palavra} e o número é:${i}`)
    }
  }
}

// loopDeImpares(2, 'oi')

// 3

function soma(num) {
  for (let i = 1; i <= num; i++) {
    console.log(i)
  }
}
soma(5)
