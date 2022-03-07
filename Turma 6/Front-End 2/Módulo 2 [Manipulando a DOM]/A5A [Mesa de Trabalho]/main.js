/* Os seguintes estilos são os que usaremos para aplicar o modo escuro, 
você terá que modificar os seletores a fim de poder resolver o exercício. /* 

// A cor de fundo 
{
  background-color: rgb(39, 39, 39);
}

// Modificações no titulo 'A família dos felinos'
{ 
  background-color: rgb(19, 19, 19);
  color: rgb(170, 170, 170);
  border-color: black;
}
// Modificações nos items
{
  background-color: rgb(19, 19, 19);
  border-color: black;
}
// Modificações nos textos dos itens e cabeçalhos dos itens
{
  color: rgb(230, 230, 230);
}
*/



let body = document.querySelector('body');


let h1 = document.querySelector('h1');



let item = document.querySelectorAll('.item')



let itemCabecalho = document.querySelector('.item h2')



let itemDescricao = document.querySelector('.item p')

let btn = document.querySelector('button')


// console.log(body, h1, item, itemCabecalho, itemDescricao);


 function toggleDark(){


    body.classList.toggle('dark');
    h1.classList.toggle('title');
    itemCabecalho.classList.toggle('itemTitle');
    itemDescricao.classList.toggle('itemDescription');
    btn.classList.toggle('btn-dark')
    item.forEach(div => {
        div.classList.toggle('itemTitle');
    })
    item.forEach(card => {
        card.classList.toggle('card')
    })
    
}

