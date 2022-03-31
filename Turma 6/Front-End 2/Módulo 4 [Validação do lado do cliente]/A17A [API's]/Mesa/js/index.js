function renderizarDadosUsuario(dados) {
  /* -------------------------------- Tarefa 1 -------------------------------- */
  // Aqui devem desenvolver uma função que seja exibida na tela:
  // a foto, o nome completo do usuário e o e-mail.
  // Isto deve ser baseado nas informações que obtemos da API e inseridas no HTML.

  let card = document.querySelector(".card");

  card.innerHTML = `
          <img src="${dados.picture.large}" alt="">
          <h1>${dados.name.title} ${dados.name.first} ${dados.name.last}</h1>
          <p>${dados.email}</p>
      `;
}

/* --------------------------- Tarefa 2 (extra) --------------------------- */
// Aqui você pode ir para o ponto extra de usar o botão que está comentado no HTML.
// Você pode descomentar o código no index.html e usar esse botão para executar uma nova solicitação API, sem recarregar a página.
// Cabe aos desenvolvedores decidirem qual bloco de código deve ser contido dentro de uma função para que ele possa ser executado toda vez que um clique de botão for realizado.

// Aqui realizamos a consulta da promisse, esperando sua resposta assíncrona

let randomButton = document.getElementById("random");

randomButton.addEventListener("click", () => {
  fetch("https://randomuser.me/api/")
    .then((response) => {
      return response.json(); // Convertendo o JSON para JavaScript
    })
    .then((result) => {
      //manipulamos a resposta
      return result.results[0]; // Separando a parte que eu quero manipular (que é o primeiro elemento do array)
    })
    .then((render) => {
      return renderizarDadosUsuario(render); // Renderizando na página quando clicar no botão, que aciona a função criada.
    });
});
