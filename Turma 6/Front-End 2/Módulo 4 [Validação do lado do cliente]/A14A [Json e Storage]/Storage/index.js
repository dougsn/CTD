let nome = localStorage.getItem('nome'); // Verificando o nome

if(nome === null) { // Se o nome for nulo (não ter informação dele), ai o prompt vem para pegar
    nome = prompt("Digite seu nome: ") // ai sobreescreve o nome para pegar o nome
}

let spanNome = document.getElementById('nome')

spanNome.innerHTML = nome;

localStorage.setItem('nome', nome) // Colocando o item na localStorage, que salva no navegador;
// localStorage salva a informação de forma indeterminada no navegador do usuário.


// Se fosse utilizado o sessionStorage, ficaria salva na aba do navegador (sessão), assim que a aba fosse fechada, a irformação seria perdida. 

// .setItem() -> Agrega valor a uma key(chave) no localStorage / sessionStorage

// .removeItem() -> Remove valores de uma key localStorage / sessionStorage

// .clear() -> Apaga todos os conteúdos da localStorage / sessionStorage