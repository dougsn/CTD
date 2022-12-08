import { Link } from "react-router-dom";
import styles from "./styles.module.css";

const NotFound = () => {
  return (
    <div className={styles.container}>
      <h1>Ooooops!!!</h1>
      <p>Essa página não existe em nosso sitema.</p>
      <Link to="/home" className={styles.link}>
        Voltar para a pagina inicial
      </Link>
    </div>
  );
};

export default NotFound;
