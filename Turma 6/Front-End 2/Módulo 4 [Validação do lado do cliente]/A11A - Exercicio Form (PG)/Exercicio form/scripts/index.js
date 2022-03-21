const registerBtn = document.querySelector(".register-btn");

registerBtn.addEventListener("click", () => {
  /// Escreva aqui o seu código, seguindo estas orientações passo a passo:

  // 1. Obter o valor introduzido no input do e-mail.

  let mail = document.getElementById("email-input").value;

  // 2. Obter o valor introduzido no input de senha.

  let password = document.getElementById("password-input").value;

  // 3. Obter o valor do input de rádio.

  let agesYes = document.getElementById("age_yes").checked; // Verificando se está checado

  // 4. Obter o valor do input com o checkbox.

  let checkbox = document.getElementById("tyc-input").checked;

  // 5. Validar se o utilizador for maior de idade. Caso contrário, mostramos
  // uma mensagem de erro: "Tem de ser maior de idade para se registar no site".

  if (agesYes === false) {
    alert("Tem de ser maior de idade para se registar no site");
  }

  // 6. Validamos se o utilizador aceitou os termos e condições. Caso contrário, exibimos
  // uma mensagem de erro: "Deve aceitar os termos e condições para se registar no site".

  if (checkbox === false) {
    alert("Deve aceitar os termos e condições para se registar no site");
  }

  // 7. Por fim, se tudo estiver correto, exibimos um objeto no console com as informações definidas pelo utilizador.

  console.log({
    email: mail,
    senha: password,
    legalAge: agesYes,
    tycAccept: checkbox,
  });
});
