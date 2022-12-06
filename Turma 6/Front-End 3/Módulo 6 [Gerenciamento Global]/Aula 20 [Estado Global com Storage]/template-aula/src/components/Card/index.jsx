import { useNavigate } from "react-router-dom";

import styles from "./styles.module.css";

const Card = (props) => {
  const { product } = props;
  const navigate = useNavigate();

  function navigateToDetails() {
    navigate(`/details/${product._id}`);
  }

  return (
    <div className={styles.card} onClick={navigateToDetails}>
      <h1>{product.name}</h1>
      <img src={product.image} />
      <p className={styles.brand}>{product.manufacturer}</p>
      <p className={styles.price}>R$ {product.price}</p>
    </div>
  );
};

export default Card;
