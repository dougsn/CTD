// Adição

somar.addEventListener("click", (e) => {
  e.preventDefault();
  let resultado = parseInt(firstNumber.value) + parseInt(secondNumber.value);
  result.setAttribute("value", resultado);
});

somar.addEventListener("mouseover", () => {
  somar.setAttribute("value", "+");
});

somar.addEventListener("mouseout", () => {
  somar.setAttribute("value", "Somar");
});
