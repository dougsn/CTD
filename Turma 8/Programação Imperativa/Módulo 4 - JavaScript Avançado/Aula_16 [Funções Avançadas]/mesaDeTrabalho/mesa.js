// Neste exercício, você terá que criar uma função FizzBuzz que recebe dois
// parâmetros numéricos.

// A função deve atender aos seguintes requisitos:
// ● Você deve imprimir os números de 1 a 100;
// ● Se o número a ser impresso for um múltiplo de seu PRIMEIRO
// parâmetro, você deve imprimir a palavra “Fizz” em vez do número
// correspondente;

// ● Se o número a ser impresso for um múltiplo do seu SEGUNDO parâmetro,
// você deve imprimir a palavra Buzz em vez do número correspondente;
// ● Se o número for um múltiplo de AMBOS os parâmetros, você deve imprimir
// a palavra “FizzBuzz”.

let FizzBuzz = (num1, num2, texto1, texto2) => {
  for (let i = 1; i <= 100; i++) {
    if (i % num1 == 0 && i % num2 == 0) {
      console.log(`${texto1} ${texto2}`)
    } else if (i % num1 == 0) {
      console.log(texto1)
    } else if (i % num2 == 0) {
      console.log(texto2)
    } else {
      console.log(i)
    }
  }
}

FizzBuzz(2, 3, 'Ola', 'Mundo')
