import ProductsProvider from "./contexts/ProductsContext";
import AppRoutes from "./Routes";

const App = () => {
  return (
    <ProductsProvider>
      <AppRoutes />
    </ProductsProvider>
  );
};

export default App;
