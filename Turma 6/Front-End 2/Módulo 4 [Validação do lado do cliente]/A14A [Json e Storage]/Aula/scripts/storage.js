
//@@@ sessionStorage -> Armazenar informações na SESSÃO do navegador

// localStorage.setItem('1', 'Teste 1');
// localStorage.setItem('2', 'Teste 2');
// localStorage.setItem('3', 'Teste 3');

//@@@ localStorage -> Armazenar informações de forma LOCAL no navegador


localStorage.clear()


let usuario = {
    nome: "Douglas",
    idade: 23,
}

let usuarioConvertidoJson = JSON.stringify(usuario) // convertendo o objeto JS em JSON

localStorage.setItem(1, usuarioConvertidoJson)

let objetoCapturado = localStorage.getItem(1)

let objetoConvertidoJs = JSON.parse(objetoCapturado) // convertendo o localstorage em JS para usar

console.log(objetoConvertidoJs.idade);
