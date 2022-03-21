let nome = document.getElementById("name");

let lastName = document.getElementById("lastName");

let btn = document.getElementById("btn");

let divSaidaForm = document.querySelector(".saidaForm");

let pTrim = document.createElement("p");
let pUpperCase = document.createElement("p");
let pLowerCase = document.createElement("p");
let pConcat = document.createElement("p");
let pReplace = document.createElement('p');

// Quando ocorrer entrada de dados nos dois campos de texto e o botão submit for pressionado, imprima no html três saídas utilizando os métodos: trim(), toUpperCase(), toLowerCase().

// Imprima também mais uma saída usando o concat() do nome com o sobrenome.


// // Por fim, para a última saída você deve utilizar o replace(), substituindo todas as letras “a” por “@” e letras “e” por “3”.

btn.addEventListener("click", (e) => {
  e.preventDefault();

  divSaidaForm.appendChild(pTrim);
  divSaidaForm.appendChild(pUpperCase);
  divSaidaForm.appendChild(pLowerCase);
  divSaidaForm.appendChild(pConcat);
  divSaidaForm.appendChild(pReplace);
  pTrim.innerText = `Método trim: ${nome.value.trim()}`;
  pUpperCase.innerText = `Método toUpperCase: ${nome.value.toUpperCase()}`;
  pLowerCase.innerText = `Método toLowerCase: ${nome.value.toLowerCase()}`;

  let nomeCompleto = nome.value.concat(' ' + lastName.value);
  pConcat.innerText = `Método concat: ${nomeCompleto}`;
  
  pReplace.innerText = `Método replace: ${nomeCompleto.replaceAll("a", "@").replaceAll("e","3")}`
  

});


