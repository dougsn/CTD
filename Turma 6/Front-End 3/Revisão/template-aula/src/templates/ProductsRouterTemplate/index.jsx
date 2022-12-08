import { Outlet } from "react-router-dom";
import Navbar from "../../components/Navbar";

const ProductsRouterTemplate = () => {
  return (
    <div>
      <Navbar />
      <Outlet />
      {/* {children} */}
    </div>
  );
};

export default ProductsRouterTemplate;
