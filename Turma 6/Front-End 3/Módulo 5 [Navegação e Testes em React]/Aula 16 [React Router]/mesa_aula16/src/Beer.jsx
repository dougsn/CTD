import axios from "axios";
import React, { useState, useEffect } from "react";
import { useParams, Link } from "react-router-dom";
import Navbar from "./components/Navbar";
import api from "./services/api";

//Esta página irá renderizar cada bebida individualmente

const Beer = () => {
  const { id } = useParams();
  const [beer, setBeer] = useState([]);

  const getBeer = async () => {
    const response = await api.get(`/beers/${id}`);
    setBeer(response.data);
  };

  console.log(beer);
  useEffect(() => {
    getBeer();
  }, []);

  return (
    <div>
      <Navbar/>
      <h2>Cerveja número: {id}</h2>
      {beer.map((beer) => (
        <div className="card" key={beer.id}>
          <img src={beer.image_url} alt="beer-detail" />
          <p>{beer.tagline}</p>
          <p>{beer.description}</p>
          <p>{beer.brewers_tips} </p>
        </div>
      ))}
      <Link to={"/"}>
        <button>Voltar</button>
      </Link>
    </div>
  );
};

export default Beer;
