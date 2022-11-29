import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import api from "./services/api";

import Card from "./components/Card";
import Navbar from "./components/Navbar";

const Home = () => {
  const [beers, setBeers] = useState([]);

  const getBeers = async () => {
    const res = await api.get("/beers");
    setBeers(res.data);
  };

  useEffect(() => {
    getBeers();
  });

  return (
    <>
      <Navbar />
      <h1>Mais do que bebidas, vamos celebrar o encontro!!</h1>
      <div className="grid">
        {beers.length
          ? beers.map((beer) => (
              <Link key={beer.id} to={`/beers/${beer.id}`}>
                <Card data={beer} />
              </Link>
            ))
          : null}
      </div>
    </>
  );
};

export default Home;
