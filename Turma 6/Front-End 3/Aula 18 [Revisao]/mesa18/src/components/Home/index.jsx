import { useState, useEffect } from "react";
import { Table } from "react-bootstrap";
import hoteis from "../../hoteis.json";
import Hotel from "../Hotel";

const Home = () => {
  const [data, setData] = useState([]);

  useEffect(() => {
    setData(hoteis);
  }, []);

  return (
    <Table striped bordered hover>
      <thead>
        <tr>
          <th>Hotel</th>
          <th>Cidade</th>
          <th>Estrela</th>
        </tr>
      </thead>
      <tbody>
        <Hotel data={data} />
      </tbody>
    </Table>
  );
};

export default Home;
