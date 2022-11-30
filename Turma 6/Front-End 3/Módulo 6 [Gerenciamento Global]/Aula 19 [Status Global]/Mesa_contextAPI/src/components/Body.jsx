import React, { useContext } from "react";
import { LanguageContext } from "../providers/Languages";


const Body = () => {
  const { language } = useContext(LanguageContext);

  return (
    <div>
     {JSON.stringify(language)}
      <h1>Título</h1>
      <p>Descrição</p>
    </div>
  );
};

export default Body;
