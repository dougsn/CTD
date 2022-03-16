let firstNumber = document.querySelector("#firstNumber");
let secondNumber = document.querySelector("#secondNumber");
let result = document.querySelector("#result");

let somar = document.getElementById("somar");
let subtrair = document.getElementById("subtrair");
let multiplicar = document.getElementById("multiplicar");
let dividir = document.getElementById("dividir");


// Adição

somar.addEventListener("click", (e) => {
  e.preventDefault();
  let resultado = parseInt(firstNumber.value) + parseInt(secondNumber.value);
  result.setAttribute("value", resultado);
});

somar.addEventListener("mouseover", () => {
    somar.setAttribute("value", "+")
})

somar.addEventListener("mouseout", () => {
    somar.setAttribute("value", "Somar")
})

// Subtração

subtrair.addEventListener("click", (e) => {
  e.preventDefault();
  let resultado = parseInt(firstNumber.value) - parseInt(secondNumber.value);
  result.setAttribute("value", resultado);
});

subtrair.addEventListener("mouseover", () => {
    subtrair.setAttribute("value", "-")

})

subtrair.addEventListener("mouseout", () => {
    subtrair.setAttribute("value", "Subtrair")
})


// Multiplicação

multiplicar.addEventListener("click", (e) => {
  e.preventDefault();
  let resultado = parseInt(firstNumber.value) * parseInt(secondNumber.value);
  result.setAttribute("value", resultado);
});

multiplicar.addEventListener("mouseover", () => {
    multiplicar.setAttribute("value", "X")

})

multiplicar.addEventListener("mouseout", () => {
    multiplicar.setAttribute("value", "Multiplicar")
})



// Divisão

dividir.addEventListener("click", (e) => {
  e.preventDefault();
  let resultado = parseInt(firstNumber.value) / parseInt(secondNumber.value);
  if (parseInt(firstNumber.value) === 0 || parseInt(secondNumber.value) === 0) {
    result.setAttribute("value", "Não se pode dividir por zero");
  } else {
    result.setAttribute("value", resultado);
  }
});

dividir.addEventListener("mouseover", () => {
    dividir.setAttribute("value", "/")

})

dividir.addEventListener("mouseout", () => {
    dividir.setAttribute("value", "Dividir")
})


