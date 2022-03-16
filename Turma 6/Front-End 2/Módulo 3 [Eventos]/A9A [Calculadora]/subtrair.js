// Subtração

subtrair.addEventListener("click", (e) => {
  e.preventDefault();
  let resultado = parseInt(firstNumber.value) - parseInt(secondNumber.value);
  result.setAttribute("value", resultado);
});

subtrair.addEventListener("mouseover", () => {
  subtrair.setAttribute("value", "-");
});

subtrair.addEventListener("mouseout", () => {
  subtrair.setAttribute("value", "Subtrair");
});
