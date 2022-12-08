import { useContext, useEffect, useState } from "react";
import Card from "../../components/Card";
import { AuthContext } from "../../providers/AuthContext";
import api from "../../services/api";
import styles from "./styles.module.css";

// const products = [
//   {
//     _id: "638741b80ee1ee0008ff71bc",
//     name: "Notebook Nitro 5 ",
//     description:
//       "Processador Intel Core i5-10300H - Quad Core – 10ª Geração Tecnologia DTS X: Ultra Áudio Teclado retroiluminado na cor vermelha Tecla Nitro Sense Habilitado para upgrade\nTela de 15,6” IPS com resolução Full HD\nNome da marca do produto: Acer\nNVIDIA GeForce GTX 1650 com 4 GB de memória dedicada GDDR6",
//     price: "4500,00",
//     manufacturer: "Acer",
//     image: "https://m.media-amazon.com/images/I/51WqIqjSOxL._AC_SX679_.jpg",
//   },
//   {
//     _id: "63876043f346960008b474b6",
//     name: "Echo Dot (8ª Geração)",
//     description:
//       'Conheça o Echo Dot (4ª Geração): nosso smart speaker com Alexa de maior sucesso ainda melhor. O novo design de áudio com direcionamento frontal (1 speaker de 1,6") garante mais graves e um som completo.\nControle músicas apenas com sua voz. Ouça músicas do Amazon Music, Apple Music, Spotify, Deezer e outros por toda sua casa com o recurso música multiambiente ou ainda escute estações de rádios.',
//     price: "700,96",
//     manufacturer: "Amazon prime",
//     image: "https://m.media-amazon.com/images/I/714Rq4k05UL._AC_SX679_.jpg",
//   },
//   {
//     _id: "63876043f346960008b474b6",
//     name: "Echo Dot (8ª Geração)",
//     description:
//       'Conheça o Echo Dot (4ª Geração): nosso smart speaker com Alexa de maior sucesso ainda melhor. O novo design de áudio com direcionamento frontal (1 speaker de 1,6") garante mais graves e um som completo.\nControle músicas apenas com sua voz. Ouça músicas do Amazon Music, Apple Music, Spotify, Deezer e outros por toda sua casa com o recurso música multiambiente ou ainda escute estações de rádios.',
//     price: "700,96",
//     manufacturer: "Amazon prime",
//     image: "https://m.media-amazon.com/images/I/714Rq4k05UL._AC_SX679_.jpg",
//   },
//   {
//     _id: "63876043f346960008b474b6",
//     name: "Echo Dot (8ª Geração)",
//     description:
//       'Conheça o Echo Dot (4ª Geração): nosso smart speaker com Alexa de maior sucesso ainda melhor. O novo design de áudio com direcionamento frontal (1 speaker de 1,6") garante mais graves e um som completo.\nControle músicas apenas com sua voz. Ouça músicas do Amazon Music, Apple Music, Spotify, Deezer e outros por toda sua casa com o recurso música multiambiente ou ainda escute estações de rádios.',
//     price: "700,96",
//     manufacturer: "Amazon prime",
//     image: "https://m.media-amazon.com/images/I/714Rq4k05UL._AC_SX679_.jpg",
//   },
//   {
//     _id: "63876043f346960008b474b6",
//     name: "Echo Dot (8ª Geração)",
//     description:
//       'Conheça o Echo Dot (4ª Geração): nosso smart speaker com Alexa de maior sucesso ainda melhor. O novo design de áudio com direcionamento frontal (1 speaker de 1,6") garante mais graves e um som completo.\nControle músicas apenas com sua voz. Ouça músicas do Amazon Music, Apple Music, Spotify, Deezer e outros por toda sua casa com o recurso música multiambiente ou ainda escute estações de rádios.',
//     price: "700,96",
//     manufacturer: "Amazon prime",
//     image: "https://m.media-amazon.com/images/I/714Rq4k05UL._AC_SX679_.jpg",
//   },
//   {
//     _id: "63876043f346960008b474b6",
//     name: "Echo Dot (8ª Geração)",
//     description:
//       'Conheça o Echo Dot (4ª Geração): nosso smart speaker com Alexa de maior sucesso ainda melhor. O novo design de áudio com direcionamento frontal (1 speaker de 1,6") garante mais graves e um som completo.\nControle músicas apenas com sua voz. Ouça músicas do Amazon Music, Apple Music, Spotify, Deezer e outros por toda sua casa com o recurso música multiambiente ou ainda escute estações de rádios.',
//     price: "700,96",
//     manufacturer: "Amazon prime",
//     image: "https://m.media-amazon.com/images/I/714Rq4k05UL._AC_SX679_.jpg",
//   },
//   {
//     _id: "63876043f346960008b474b6",
//     name: "Echo Dot (8ª Geração)",
//     description:
//       'Conheça o Echo Dot (4ª Geração): nosso smart speaker com Alexa de maior sucesso ainda melhor. O novo design de áudio com direcionamento frontal (1 speaker de 1,6") garante mais graves e um som completo.\nControle músicas apenas com sua voz. Ouça músicas do Amazon Music, Apple Music, Spotify, Deezer e outros por toda sua casa com o recurso música multiambiente ou ainda escute estações de rádios.',
//     price: "700,96",
//     manufacturer: "Amazon prime",
//     image: "https://m.media-amazon.com/images/I/714Rq4k05UL._AC_SX679_.jpg",
//   },
//   {
//     _id: "63876043f346960008b474b6",
//     name: "Echo Dot (8ª Geração)",
//     description:
//       'Conheça o Echo Dot (4ª Geração): nosso smart speaker com Alexa de maior sucesso ainda melhor. O novo design de áudio com direcionamento frontal (1 speaker de 1,6") garante mais graves e um som completo.\nControle músicas apenas com sua voz. Ouça músicas do Amazon Music, Apple Music, Spotify, Deezer e outros por toda sua casa com o recurso música multiambiente ou ainda escute estações de rádios.',
//     price: "700,96",
//     manufacturer: "Amazon prime",
//     image: "https://m.media-amazon.com/images/I/714Rq4k05UL._AC_SX679_.jpg",
//   },
//   {
//     _id: "63876043f346960008b474b6",
//     name: "Echo Dot (8ª Geração)",
//     description:
//       'Conheça o Echo Dot (4ª Geração): nosso smart speaker com Alexa de maior sucesso ainda melhor. O novo design de áudio com direcionamento frontal (1 speaker de 1,6") garante mais graves e um som completo.\nControle músicas apenas com sua voz. Ouça músicas do Amazon Music, Apple Music, Spotify, Deezer e outros por toda sua casa com o recurso música multiambiente ou ainda escute estações de rádios.',
//     price: "700,96",
//     manufacturer: "Amazon prime",
//     image: "https://m.media-amazon.com/images/I/714Rq4k05UL._AC_SX679_.jpg",
//   },
//   {
//     _id: "63876043f346960008b474b6",
//     name: "Echo Dot (8ª Geração)",
//     description:
//       'Conheça o Echo Dot (4ª Geração): nosso smart speaker com Alexa de maior sucesso ainda melhor. O novo design de áudio com direcionamento frontal (1 speaker de 1,6") garante mais graves e um som completo.\nControle músicas apenas com sua voz. Ouça músicas do Amazon Music, Apple Music, Spotify, Deezer e outros por toda sua casa com o recurso música multiambiente ou ainda escute estações de rádios.',
//     price: "700,96",
//     manufacturer: "Amazon prime",
//     image: "https://m.media-amazon.com/images/I/714Rq4k05UL._AC_SX679_.jpg",
//   },
// ];

const Home = () => {
  const [products, setProducts] = useState([]);

  const { userData } = useContext(AuthContext);

  const { token } = userData;

  useEffect(() => {
    getProducts();
  }, []);

  async function getProducts() {
    console.log(token);
    try {
      const response = await api.get("/products", {
        headers: {
          token: token,
        },
      });
      setProducts(response.data);
    } catch (error) {}
  }

  return (
    <div className={styles.container}>
      <div className={styles.container_form}>
        <form>
          <h2>Cadastro de Produto</h2>
          <input placeholder="Nome" />

          <div className={styles.line_inputs}>
            <input placeholder="Preço" />

            <select placeholder="Fabricante">
              <option>aaaa</option>
            </select>
          </div>

          <input placeholder="Imagem" />

          <textarea placeholder="Descrição"></textarea>

          <button className={styles.button}>Salvar</button>
        </form>
      </div>

      <div className={styles.container_list}>
        <h2>Produtos</h2>

        <div className={styles.list}>
          {products.map((product) => (
            <Card product={product} />
          ))}
        </div>
      </div>
    </div>
  );
};

export default Home;
