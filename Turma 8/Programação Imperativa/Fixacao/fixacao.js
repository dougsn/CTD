// 1

function loopDePares(x) {
  for (let i = 0; i <= 100; i++) {
    if ((x + i) % 2 == 0) {
      console.log(`O número ${i} é par`)
    }
  }
}

loopDePares(2)

function loopeDeImpares(y) {
  for (let i = 0; i <= 100; i++) {
    if ((y + i) % 2 != 0) {
      console.log(`O número ${i} é ímpar`)
    } else {
      console.log(i)
    }
  }
}

loopeDeImpares(10)

function soma(num) {
  let array = []
  for (let i = 1; i <= num; i++) {
    array.push(i)
  }

  let somaArray = array.reduce((acum, index) => {
    return acum + index
  })

  return somaArray
}

// console.log(soma(3))
// console.log(soma(8))

// 4

function newArray(num) {
  let array2 = []
  for (let i = 0; i <= num; i++) {
    array2.push(i)
  }
  console.log(array2)
}

// newArray(5)
// newArray(10)

// 5

function split(str) {
  let array = []
  for (let i = 0; i < str.length; i++) {
    array.push(str[i])
  }
  console.log(array)
}

// split('olá')
// split('tchau')

// 6

function moverZeros(array) {
  let novoArray = array.filter(array => {
    return array != 0
  })

  array.forEach(element => {
    if (element == 0) {
      novoArray.push(element)
    }
  })

  console.log(novoArray)
}

// moverZeros([1, 2, 0, 1, 0, 1, 0, 3, 0, 1])
// moverZeros([false, 1, 0, 1, 2, 0, 1, 3, 'a'])

function arrayHandler(array1, array2) {
  for (let i = 0; i < array2.length; i++) {
    console.log(
      `Eu sou o ${array1[i]} do primeiro array | e eu sou o ${array2[i]} do segundo array`
    )
  }
}

// arrayHandler([1, 2, 3], ['o', 'l', 'á'])

// 8

function arrayObjects(num) {
  let array = []
  for (let i = 1; i <= num; i++) {
    array.push({ valor: i })
  }

  return array
}

// console.log(arrayObjects(5))

// 8

function arrayObjectsTwo(num, palavra) {
  let array = []
  for (let i = 1; i <= num; i++) {
    array.push({ [palavra]: i })
  }

  return array
}

console.log(arrayObjectsTwo(5, 'Olá'))
