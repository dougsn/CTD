import { useContext } from "react";
import { ProductsContext } from "../../../contexts/ProductsContext";

const Home = () => {
  const { products, error, loading /* getProducts, postProduct*/ } =
    useContext(ProductsContext);

  if (loading) {
    return <h1>...loading</h1>;
  }

  if (error) {
    return <h2>Erro ao buscar dados</h2>;
  }

  // postProduct(token, product)

  //saveProduct({ name: "Celular", price: 3000 }, q80918019809);

  return (
    <div>
      {products.map((product) => (
        <p key={product._id}>{JSON.stringify(product)}</p>
      ))}
    </div>
  );
};

export default Home;
