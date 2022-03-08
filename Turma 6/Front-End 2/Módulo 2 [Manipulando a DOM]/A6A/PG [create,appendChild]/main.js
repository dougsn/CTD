var botaoVerMais = document.createElement("button");

// @@ salva a criação do botão na variavel

var botaoTexto = document.createTextNode("Ver Mais");

// @@ salva a criação do texto na variavel

botaoVerMais.appendChild(botaoTexto)

// @@ Coloca o texto criado como filho do botão

document.body.appendChild(botaoVerMais)

// @@ Coloca o nó criado no DOM