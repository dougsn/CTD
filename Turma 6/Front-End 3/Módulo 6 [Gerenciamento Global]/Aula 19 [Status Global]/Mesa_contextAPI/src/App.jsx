import "./App.css";
import React, { useState } from "react";
import Languages from "./providers/Languages";
import Navbar from "./components/Navbar";
import Body from "./components/Body";
import { BrowserRouter, Routes, Route } from "react-dom";

function App() {
  const [language, setLanguage] = useState("");

  const handleChangeLA = () => {
    setLanguage(() => {
      //DICA: Função que troca um idioma por outro (ao clicar no botão)
    });
  };

  return (
    <Languages>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route path="/" element={<Body />} />
        </Routes>
      </BrowserRouter>
    </Languages>
  );
}

export default App;
