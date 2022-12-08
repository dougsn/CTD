import { BrowserRouter, Routes, Route, Navigate } from "react-router-dom";

import Auth from "./pages/Auth";
import Home from "./pages/Home";
import Details from "./pages/Details";
import Contact from "./pages/Contact";
import NotFound from "./pages/NotFound";
import Navbar from "./components/Navbar";
import AuthProvider, { AuthContext } from "./providers/AuthContext";
import { useContext } from "react";
import ProductsRouterTemplate from "./templates/ProductsRouterTemplate";

const PrivateRoute = ({ children }) => {
  const { userData } = useContext(AuthContext);
  return userData.token ? children : <Navigate to="/" />;
};

const App = () => (
  <BrowserRouter>
    <AuthProvider>
      {/* <Navbar /> */}
      <Routes>
        <Route path="/" element={<Auth />} />
        {/* <Route path="/products" element={<Home />} /> */}
        {/* <Route path="/details/:id" element={<Details />} /> */}
        <Route path="/contact" element={<Contact />} />

        <Route path="/products" element={<ProductsRouterTemplate />}>
          <Route
            path=""
            element={
              <PrivateRoute>
                <Home />
              </PrivateRoute>
            }
          />
          <Route
            path=":id"
            element={
              <PrivateRoute>
                <Details />
              </PrivateRoute>
            }
          />
          {/* <Route path="info" element={<Contact />} /> */}
        </Route>

        {/* <Route path="dashboard" element={<Contact />}>
          <Route path="/" element={<Contact />} />
          <Route path="/reports" element={<Contact />}>
            <Route path="/vendas" element={<Contact />} />
          </Route>
        </Route> */}

        {/* <Route path="*" element={<NotFound />} /> */}
      </Routes>
    </AuthProvider>
  </BrowserRouter>
);

export default App;
