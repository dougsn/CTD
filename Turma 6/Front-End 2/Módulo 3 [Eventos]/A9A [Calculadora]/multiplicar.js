// Multiplicação

multiplicar.addEventListener("click", (e) => {
  e.preventDefault();
  let resultado = parseInt(firstNumber.value) * parseInt(secondNumber.value);
  result.setAttribute("value", resultado);
});

multiplicar.addEventListener("mouseover", () => {
  multiplicar.setAttribute("value", "X");
});

multiplicar.addEventListener("mouseout", () => {
  multiplicar.setAttribute("value", "Multiplicar");
});
