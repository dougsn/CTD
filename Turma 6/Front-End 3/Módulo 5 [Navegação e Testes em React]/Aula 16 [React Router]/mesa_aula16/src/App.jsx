import { BrowserRouter, Routes, Route } from "react-router-dom";
import Beer from "./Beer";
import Contact from "./Contact";

import Home from "./Home";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/contact" element={<Contact />} />
        <Route path="/beers/:id" element={<Beer />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
