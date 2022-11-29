import { Link } from "react-router-dom";
import { useParams } from "react-router-dom";

const Details = () => {
  const { nome } = useParams(); // o nome do estado tem que ser igual ao que foi configurado na pagina de roteamento.

  return (
    <div>
      <h1>Hello Details Page</h1>
      <h2>{nome}</h2>
      <Link to="/">Ir para Home</Link>
    </div>
  );
};

export default Details;
