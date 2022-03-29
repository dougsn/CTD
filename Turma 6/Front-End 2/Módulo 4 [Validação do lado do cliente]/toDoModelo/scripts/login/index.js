let campoEmailLogin = document.getElementById("inputEmail");
let campoSenhaLogin = document.getElementById("inputPassword");
let botaoAcessar = document.getElementById("botaoAcessar");

let campoEmailLoginNormalizado;
let campoSenhaLoginNormalizado;

let emailEValido = false; // Variavel de controle, para saber se o email e valido ou não

const usuarioObjeto = { // Objeto criado para salvar os input's de e-mail e senha
  email: "",
  senha: "",
};

botaoAcessar.addEventListener("click", (event) => {
  if (validacaoTelaDeLogin()) {
    event.preventDefault(); // só para visualizar o log no console.
    // se os campos não forem vazios, faça isso

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
    campoEmailLogin.value != "" && // Se o campo não for vazio
    /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(campoEmailLogin.value) // Validação do e-mail com regex
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
 // campoSenhaLogin.value != ""
  if ( campoSenhaLogin.value != "" && (campoSenhaLogin.value.length >= 6 && campoSenhaLogin.value.length <= 10)) {
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

function validacaoTelaDeLogin() { // Função criada para haiblitar o botão ou não.
  if (emailEValido) {
    // Se o e-mail for válido (true), ele habilita o botão e troca o texto para acessar

    botaoAcessar.removeAttribute("disabled");
    botaoAcessar.innerText = "Acessar";
    return true; // A função retorna true, pois ela pode ser utilizada como uma condicional
  } else {
    // Se o e-mail for falso (false), ele desabilita o botão e troca o texto para bloqueado.

    botaoAcessar.setAttribute("disabled", true);
    botaoAcessar.innerText = "Bloqueado";
    return false; // A função retorna false, pois ela pode ser utilizada como uma condicional
  }
}
