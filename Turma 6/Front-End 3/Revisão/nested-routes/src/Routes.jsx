import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "./pages/Home";

import Dashboard from "./pages/Dashboard";
import DashboardHome from "./pages/Dashboard/Home";
import DashboardReport from "./pages/Dashboard/Reports";

import Products from "./pages/Products";
import HomeProducts from "./pages/Products/Home";
import DetailsProducts from "./pages/Products/Details";

const AppRoutes = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />

        <Route path="/dashboard" element={<Dashboard />}>
          <Route path="" element={<DashboardHome />} />
          <Route path="reports" element={<DashboardReport />} />
        </Route>

        <Route path="/products" element={<Products />}>
          <Route path="" element={<HomeProducts />} />
          <Route path=":id" element={<DetailsProducts />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
};

export default AppRoutes;
