import { createContext, useEffect, useState } from "react";

//import saveProduct from "../services/productService";

import api from "../services/api";

export const ProductsContext = createContext({});

const ProductsProvider = ({ children }) => {
  const [products, setProducts] = useState([]);

  const [error, setError] = useState(false);

  const [loading, setLoading] = useState(false);

  // async function postProduct(token, product) {
  //   saveProduct(product, token, setError, setLoading);
  // }

  async function getProducts() {
    setLoading(true);
    try {
      const response = await api.get("/products");

      setProducts(response.data);
    } catch (error) {
      setError(true);
    } finally {
      setLoading(false);
    }
  }

  useEffect(() => {
    getProducts();
  }, []);

  return (
    <ProductsContext.Provider
      value={{ products, error, loading, getProducts /*postProduct*/ }}
    >
      {children}
    </ProductsContext.Provider>
  );
};

export default ProductsProvider;
