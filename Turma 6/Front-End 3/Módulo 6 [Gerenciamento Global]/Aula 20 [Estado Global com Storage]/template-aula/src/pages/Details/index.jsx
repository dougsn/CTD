import { useNavigate } from "react-router-dom";

import styles from "./styles.module.css";
import arrowBack from "../../assets/imgs/arrow_back.png";

const product = {
  _id: "638741b80ee1ee0008ff71bc",
  name: "Notebook Nitro 5 ",
  description:
    "Processador Intel Core i5-10300H - Quad Core – 10ª Geração Tecnologia DTS X: Ultra Áudio Teclado retroiluminado na cor vermelha Tecla Nitro Sense Habilitado para upgrade\nTela de 15,6” IPS com resolução Full HD\nNome da marca do produto: Acer\nNVIDIA GeForce GTX 1650 com 4 GB de memória dedicada GDDR6",
  price: "4500,00",
  manufacturer: "Acer",
  image: "https://m.media-amazon.com/images/I/51WqIqjSOxL._AC_SX679_.jpg",
};

const Details = () => {
  const navigate = useNavigate();

  return (
    <>
      <div className={styles.container}>
        <img
          src={arrowBack}
          className={styles.arrow_back}
          onClick={() => navigate("/home")}
        />
        <div className={styles.container}>
          <img src={product.image} />

          <div className={styles.content}>
            <h1>{product.name}</h1>
            <p className={styles.id}>{product._id}</p>
            <p className={styles.price}>R$ {product.price}</p>
            <p className={styles.manufacturer}>{product.manufacturer}</p>
            <p className={styles.description}>{product.description}</p>
          </div>
        </div>
      </div>
    </>
  );
};

export default Details;
