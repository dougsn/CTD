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
  dividir.setAttribute("value", "/");
});

dividir.addEventListener("mouseout", () => {
  dividir.setAttribute("value", "Dividir");
});
