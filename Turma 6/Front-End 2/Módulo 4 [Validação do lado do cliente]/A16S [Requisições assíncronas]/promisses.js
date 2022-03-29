let validacao = true;

let usuarioObjeto = {
    nome: "Usuario",
    endereco: {
        cidade: {
            nome: "Rio de Janeiro",
            cep: "24744321"
        }
    }
}

let usuarioJson = JSON.stringify(usuarioObjeto)

let minhaPromisse = new Promise(function (resolve, reject) { // resolve (se resolvido), reject (se rejeitado)
  setTimeout(() => { // Simulando um tempo de requisição no servidor
    if (validacao) {
      resolve(usuarioJson); // Se for true, cai no resolve e posteriormente vai para o .then()
    } else {
      reject(validacao); // Se for false, cai no reject e posteriormente vai para o .catch()
    }
  }, 4000);
});

minhaPromisse
  .then(function (resultado) { // .then(se a promisse for true, então faça o bloco de código do .then())
    console.log(resultado);
    let resultadoJs = JSON.parse(resultado)
    return resultadoJs
  })
  .catch(function (erro) { // .catch (se a promisse for false, então faça o bloco de código do .catch())
    console.log(erro);
  });
