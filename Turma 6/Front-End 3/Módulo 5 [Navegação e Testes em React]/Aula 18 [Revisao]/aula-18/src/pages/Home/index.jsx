import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import api from "../../services/api";
import "./styles.css";

const Home = () => {
  const [id, setId] = useState("");
  const [products, setProducts] = useState([]);
  const [formData, setFormData] = useState({
    name: "",
    description: "",
    price: "",
    manufacturer: "",
    image: "",
  });

  useEffect(() => {
    getProducts();
  }, []);

  async function getProducts() {
    try {
      const response = await api.get("/products");
      setProducts(response.data);
    } catch (error) {
      alert("Erro ao buscar produto");
    }
  }

  async function newProduct() {
    try {
      await api.post("/products", {
        name: formData.name,
        price: formData.price,
        description: formData.description,
        manufacturer: formData.manufacturer,
        image: formData.image,
        // OU ...formData
      });
      getProducts();
      setFormData("");
    } catch (error) {
      alert("Erro ao cadastrar novo produto");
    }
  }

  async function removeProduct(id) {
    try {
      await api.delete(`/products/${id}`);
      getProducts();
    } catch (error) {
      alert("Erro ao remover o produto");
    }
  }

  async function fillProduct(product) {
    setFormData({
      name: product.name,
      description: product.description,
      price: product.price,
      manufacturer: product.manufacturer,
      image: product.image,
    });
    setId(product._id);
  }

  async function editProduct() {
    try {
      await api.put(`/products/${id}`, {
        name: formData.name,
        description: formData.description,
        price: formData.price,
        manufacturer: formData.manufacturer,
        image: formData.image,
      });
      setId("")
      setFormData({ name: "", description:"", price:"", manufacturer:"", image:""})
      getProducts()
    } catch (error) {
      alert("Erro ao editar o produto");
    }
  }

  function submitForm(){
    if (id) {
        editProduct();
    } else {
        newProduct();
    }
  }

  return (
    <div className="container">
      <form>
        {id ? <h2>Editar Produto {formData.name}</h2> : <h2>Cadastrar Produto</h2>}
        <input
          placeholder="Nome"
          value={formData.name}
          onChange={(event) =>
            setFormData({ ...formData, name: event.target.value })
          }
        />
        <input
          placeholder="Preço"
          value={formData.price}
          onChange={(event) =>
            setFormData({ ...formData, price: event.target.value })
          }
        />
        <input
          placeholder="Fabricante"
          value={formData.manufacturer}
          onChange={(event) =>
            setFormData({ ...formData, manufacturer: event.target.value })
          }
        />
        <input
          placeholder="Image"
          value={formData.image}
          onChange={(event) =>
            setFormData({ ...formData, image: event.target.value })
          }
        />
        <textarea
          placeholder="Descrição"
          value={formData.description}
          onChange={(event) =>
            setFormData({ ...formData, description: event.target.value })
          }
        />
        <button type="button" onClick={submitForm}>
          Salvar
        </button>
      </form>

      <div className="products">
        <h1>Produtos</h1>
        <div className="content">
          {products.map((product) => (
            <div key={product._id}  className="container-item">
              <Link to={`/details/${product._id}`}>
                <img src={product.image} />
                <p>{product.price}</p>
                <p>{product.name}</p>
              </Link>
              <button onClick={() => removeProduct(product._id)}>
                Remover
              </button>
              <button onClick={() => fillProduct(product)}>Editar</button>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
};

export default Home;
