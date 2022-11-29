import { useParams, Link } from "react-router-dom";
import { useState, useEffect } from "react";
import hoteis from "../../hoteis.json";

const Details = () => {
  const { id } = useParams();
  const [data] = useState([...hoteis]);
  const [filter, setFilter] = useState([])

  function hotel() {
    // eslint-disable-next-line eqeqeq
    data.map((item) => (id == item.id ? setFilter(item) : ""));
  }

  useEffect(() => {
    hotel();
  });


  return (
    <div>
      {filter.name} - {filter.city}
      <Link to="/"><button>Voltar para Home</button></Link>
    </div>
  );
};

export default Details;
