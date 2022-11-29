import React from "react";
import Navbar from "./components/Navbar";

const Contact = () => {
  return (
    <div className="grid">
      <Navbar />
      <h2>Quer saber mais sobre nós?</h2>
      <h2>Você é revendedor e quer saber os preços ?</h2>
      <p>
        Não hesite em nos contatar
        <code>Email: punkapi@beers.com</code>
        <code>Telefone: 11324568</code>
      </p>
    </div>
  );
};

export default Contact;
