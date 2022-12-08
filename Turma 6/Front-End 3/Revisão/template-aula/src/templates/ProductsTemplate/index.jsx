import Navbar from "../../components/Navbar";

const ProductsTemplate = ({ children }) => {
  return (
    <div>
      <Navbar />
      {children}
    </div>
  );
};

export default ProductsTemplate;
