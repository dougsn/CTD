import React, { useContext } from "react";
import LanguageContext from "../providers/Context";

const Body = () => {
  /* DICA: Utilize o useContext() */
  const { language } = useContext(LanguageContext);
  return (
    <div>
      {/* DICA: Utilize os valores capturados via contexto */}
      <h1>{language.text.title}</h1>
      <p>{language.text.description}</p>
    </div>
  );
};

export default Body;
