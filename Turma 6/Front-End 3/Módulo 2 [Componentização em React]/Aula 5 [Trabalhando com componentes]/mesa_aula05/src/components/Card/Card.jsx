
const produtos = [
    {
      nome: "Macbook Air 13 Chip M1 256gb",
      image: "https://m.media-amazon.com/images/I/41O807iqbCL._AC_SX522_.jpg",
      preco: "R$ 7999.00",
    },
    {
      nome: "Echo Dot (4ª Geração)",
      image: "https://m.media-amazon.com/images/I/714Rq4k05UL._AC_SL1000_.jpg",
      preco: "R$ 379.00",
    },
    {
      nome: "Câmera Ip Sem Fio 360°",
      image: "https://m.media-amazon.com/images/I/51F70OM213S._AC_SL1000_.jpg",
      preco: "R$ 199.00",
    },
    {
      nome: "Fechadura Eletrônica Digital Inteligente Zigbee",
      image: "https://m.media-amazon.com/images/I/51RXeqMLceL._AC_SL1500_.jpg",
      preco: "R$ 1599.00",
    },
  ];

import { List } from "../List/List";

export const Card = () => {
    return (
        <>
            <ul className="container">
                {produtos.map((produto, index) =>
                <List 
                  key={index}
                  src={produto.image} alt="Foto do produto"
                  nome={produto.nome} preco={produto.preco}
                />               
                )}
            </ul>
        </>
    )
}