

let Felinos = [{ // @@ Array de objetos, contento as informações para inserir dinâmicamento no DOM
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
},
{
  nome: "Pantera Negra",
  src: "./imagens/pantera-negra.jpg",
  descricao: " A pantera negra é uma variação escura (melanismo) de várias espécies de felinos grandes, especialmente o leopardo (Panthera pardus) e a onça-pintada (Panthera onca).  Mas deve-se ressaltar que não se trata de uma espécie nova, nem mesmo de uma subespécie, é simplesmente uma variação negra destes animais."
},
{
  nome: "Jaguar",
  src: "./imagens/jaguar.jpg",
  descricao: " O jaguar, ou jaguarete (Panthera onca) é um carnívoro felídeo da sub-família Panthera e do gênero Panthera. É a única das cinco espécies existentes deste gênero encontradas nas Américas. Também é o maior felino das Américas e o terceiro maior do mundo, depois do tigre (Panthera tigris) e do leão (Panthera leo)."
},
{
  nome: "Guepardo",
  src: "./imagens/chita.jpg",
  descricao: " O guepardo, ou chita (Acinonyx jubatus) é um membro atípico da família felina. É o único representante vivo do gênero Acinonyx. Ele caça graças à sua visão e grande velocidade. É o animal terrestre mais rápido do mundo, atingindo uma velocidade máxima de 115 km/h em corridas de até quinhentos metros."
}]

<<<<<<< HEAD
// Criar um objeto com as infgi ormações dos card's e ir criando dinamicamente, de forma que reaproveite o código. Como acima, porém tem que criar os outros objetos, dos outros cards
=======
>>>>>>> 10e4c4b12f35b2cd0b2ae261567239fa0a13c242


Felinos.forEach(f => { // @@ Criando o loop no array de objetos, para poder manipular as informações que tem neles.
  
  let container2 = document.querySelector('#container2')
  let div1 = document.createElement('div');
  let img = document.createElement('img');    // @@ Criando os elementos para colocar na página
  let h2 = document.createElement('h2');
  let p = document.createElement('p');

  container2.appendChild(div1)
  div1.appendChild(img)
  div1.appendChild(h2)        // @@ Fazendo a estrutura de nó, div dentro do container, dps tudo dentro da div.
  div1.appendChild(p)

  div1.setAttribute("class","item")
  img.setAttribute("src", `${f.src}`)   // @@ Colocando os atributos e textos dinâmicamento, conforme solicitado.
  h2.innerText = `${f.nome}`
  p.innerText = `${f.descricao}`
})


let body = document.querySelector('body');
let h1 = document.querySelector('h1');
let item = document.querySelectorAll('.item')
let itemCabecalho = document.querySelector('.item h2')    // @@ Selecionando os elementos do HTML para manipular o DOM
let itemDescricao = document.querySelector('.item p')
let btn = document.querySelector('button')

function toggleDark(){ // @@ Criando a função toggle do atributo que está no HTML (onclick())


  body.classList.toggle('dark');
  h1.classList.toggle('title');
  itemCabecalho.classList.toggle('itemTitle');
  itemDescricao.classList.toggle('itemDescription');    //@@ Modificando os elementos dinâmicamente, quando clicarem no botão.
  btn.classList.toggle('btn-dark')
  item.forEach(div => {
      div.classList.toggle('itemTitle');
  })
  item.forEach(card => {
      card.classList.toggle('card')
  })
  
}



