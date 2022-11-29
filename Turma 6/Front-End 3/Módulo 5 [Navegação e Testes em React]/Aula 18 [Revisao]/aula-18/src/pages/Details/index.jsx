import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import api from "../../services/api";

const Details = () => {
  const { id } = useParams();
  const [loading, setLoading] = useState(true);
  const [product, setProduct] = useState({});

  useEffect(() => {
    getProducts();
  }, []);

  async function getProducts() {
    try {
      const response = await api.get(`/products/${id}`);
      setProduct(response.data);
    } catch (error) {
      alert("Erro ao buscar produto");
    } finally {
        setLoading(false);
    }
  }

  if(loading){
    return <div>Carregando ...</div>
  }

  if(!product._id){
    return <div>Produto não encontrado</div>
  }

  return (
    <div>
      <h1>{product.name}</h1>
      <img src={product.image} />
      <p>{product.manufactures}</p>
      <p>{product.description}</p>
      <p>{product.price}</p>
    </div>
  );
};

export default Details;
