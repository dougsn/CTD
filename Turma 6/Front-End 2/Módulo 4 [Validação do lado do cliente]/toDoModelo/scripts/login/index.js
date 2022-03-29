let campoEmailLogin = document.getElementById("inputEmail");
let campoSenhaLogin = document.getElementById("inputPassword");
let botaoAcessar = document.getElementById("botaoAcessar");

let campoEmailLoginNormalizado;
let campoSenhaLoginNormalizado;

let emailEValido = false;

const usuarioObjeto = {
  email: "",
  senha: "",
};

botaoAcessar.addEventListener("click", (event) => {
  if (validacaoTelaDeLogin()) {
    event.preventDefault();
    // se os campos nnão forem vazios, faça isso

    // Tirando os espaços em brancos dos valores
    campoEmailLoginNormalizado = retiraEspacosDeUmValor(campoEmailLogin.value);
    campoSenhaLoginNormalizado = retiraEspacosDeUmValor(campoSenhaLogin.value);
    campoEmailLoginNormalizado = conventerValorRecebidoParaMinusculo(campoEmailLoginNormalizado);
    campoSenhaLogin = conventerValorRecebidoParaMinusculo(
      campoSenhaLoginNormalizado
    );

    console.log(campoEmailLoginNormalizado);
    console.log(campoSenhaLogin);

    //Populando o objeto com as informações normalizadas

    usuarioObjeto.email = campoEmailLoginNormalizado;
    usuarioObjeto.senha = campoSenhaLoginNormalizado;

     console.log(usuarioObjeto);
  } else {
    alert("Ambos os campos devem ser informados!"); // se não, alerte.
    event.preventDefault(); //Não permite que o formulário seja executado / realizado o 'submit'
  }
});

// Validação quando sair do campo do input (blur)
campoEmailLogin.addEventListener("blur", (event) => {
  let inputEmailValidacao = document.getElementById("inputEmailValidacao");

  if (
    campoEmailLogin.value != "" &&
    /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(campoEmailLogin.value) // Validação do e-mail
  ) {
    inputEmailValidacao.innerText = "";
    campoEmailLogin.style.border = "1px solid green";

    emailEValido = true;
  } else {
    //Se o campo estiver sem nenhum valor...
    inputEmailValidacao.innerText = "E-mail inválido";
    inputEmailValidacao.style.color = "red";
    inputEmailValidacao.style.fontSize = "8px";
    inputEmailValidacao.style.fontWeight = "bold";

    campoEmailLogin.style.border = "1px solid red";

    emailEValido = false;
  }

  validacaoTelaDeLogin();
});

campoSenhaLogin.addEventListener("change", (event) => {
  // O change valida em tempo real
  let inputSenhaValidacao = document.getElementById("inputSenhaValidacao");

  if (campoSenhaLogin.value != "") {
    inputSenhaValidacao.innerText = "";
    campoSenhaLogin.style.border = "1px solid green";
    emailEValido = true;
  } else {
    inputSenhaValidacao.innerText = "Senha inválida";
    inputSenhaValidacao.style.color = "red";
    inputSenhaValidacao.style.fontSize = "8px";
    inputSenhaValidacao.style.fontWeight = "bold";

    campoSenhaLogin.style.border = `1px solid red`;

    emailEValido = false;
  }
});

function validacaoTelaDeLogin() {
  if (emailEValido) {
    botaoAcessar.removeAttribute("disabled");
    botaoAcessar.innerText = "Acessar";
    return true; // A função retorna true, pois ela pode ser utilizada como uma condicional
  } else {
    botaoAcessar.setAttribute("disabled", true);
    botaoAcessar.innerText = "Bloqueado";
    return false; // A função retorna false, pois ela pode ser utilizada como uma condicional
  }
}
