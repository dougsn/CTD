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



let container2 = document.querySelector('#container2')
// // console.log(container2);

// // container2.firstElementChild.remove() // Removendo o primeiro elemento

// // container2.removeChild(listaFelinos[1]) // Removendo um filho eespecifico do elemento

let Felinos = [{
  nome: "Tigre",
  src: "./imagens/tiger.jpg",
  descricao: "O tigre (Panthera tigris) é uma das espécies da subfamília Pantherinae (família Felidae) pertencente ao gênero Panthera. É encontrado de forma nativa apenas no continente asiático; é um predador carnívoro e é a maior espécie de felino do mundo junto com o leão."
},
{
  nome: "Leão",
  src: "./imagens/leon.jpg",
  descricao: "O leão (Panthera leo) é um mamífero carnívoro da família dos felinos é uma das cinco espécies do gênero  Panthera. Os leões selvagens vivem em populações cada vez mais dispersas e fragmentadas na África subsahariana (com exceção das regiões florestais e das regiões de selva da Bacia do Congo) e uma pequena área do noroeste da  Índia."
},
{
  nome: "Leopardo",
  src: "./imagens/leopardo.jpg",
  descricao: " O leopardo (Panthera pardus) é um mamífero carnívoro da família dos felinos. Como três dos outros felinos do gênero Panthera: o leão, o tigre e a onça-pintada, são caracterizados por uma modificação do osso  hióide que lhes permite rugir. É também conhecido como pantera marrom e, quando tem a pelagem completamente escura, como pantera negra (melanista)."
}]

// Criar um objeto com as informações dos card's e ir criando dinamicamente, de forma que reaproveite o código. Como acima, porém tem que criar os outros objetos, dos outros cards


let Tigre = document.createElement('div')

container2.appendChild(Tigre);

let leao = document.createElement('div');

container2.appendChild(leao)

let leopardo = document.createElement('div');

container2.appendChild(leopardo)

let pantera = document.createElement('div');

pantera.innerHTML = `
  <div class="item">
      <img src="./imagens/pantera-negra.jpg">
      <h2>A pantera negra</h2>
      <p>
        A pantera negra é uma variação escura (melanismo) de várias espécies de felinos grandes, especialmente o
        leopardo (Panthera pardus) e a onça-pintada (Panthera onca).
        Mas deve-se ressaltar que não se trata de uma espécie nova, nem mesmo de uma subespécie, é simplesmente uma
        variação negra destes animais.
      </p>
    </div>
`;

container2.appendChild(pantera)

let jaguar = document.createElement('div');

jaguar.innerHTML = `
  <div class="item">
      <img src="./imagens/jaguar.jpg">
      <h2>O jaguar</h2>
      <p>
        O jaguar, ou jaguarete (Panthera onca) é um carnívoro felídeo da sub-família Panthera e do
        gênero Panthera. É a única das cinco espécies existentes deste gênero encontradas nas Américas. Também
        é o maior felino das Américas e o terceiro maior do mundo, depois do tigre (Panthera tigris) e do leão (Panthera
        leo).
      </p>
    </div>
`

container2.appendChild(jaguar)

let guepardo = document.createElement('div')

guepardo.innerHTML = `
  <div class="item">
      <img src="./imagens/chita.jpg">
      <h2>O guepardo</h2>
      <p>
        O guepardo, ou chita (Acinonyx jubatus) é um membro atípico da família felina. É o único
        representante vivo do gênero Acinonyx. Ele caça graças à sua visão e grande velocidade. É o animal terrestre
        mais rápido
        do mundo, atingindo uma velocidade máxima de 115 km/h em corridas de até quinhentos metros.
      </p>
    </div>
`
container2.appendChild(guepardo)