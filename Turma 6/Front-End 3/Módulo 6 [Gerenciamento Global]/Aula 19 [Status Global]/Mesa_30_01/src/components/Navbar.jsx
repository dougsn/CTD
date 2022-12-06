import React, { useContext } from "react";
import "../App.css";
import LanguageContext from "../providers/Context";

const Navbar = () => {
  const { language, handleChangeLA } = useContext(LanguageContext);
  console.log(language);
  return (
    <div className="navbar">
      {/* DICA: Deixe essas informações dinâmicas, utilize os valores capturados via contexto (veja 'text', na linha 8) */}

      <p>{language.text.home}</p>
      <p>
        {language.text.current} - {language.id}
      </p>
      <button onClick={handleChangeLA}>Alterar idioma</button>
    </div>
  );
};

export default Navbar;
