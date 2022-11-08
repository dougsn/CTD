import { useState } from "react";

import "./styles.css";



function App() {

  const [selectValue, setSelectValue] = useState("");
  const [error, setError] = useState("");

  const [nota, setNota] = useState(0);
  const [notaDataBase, setNotaDataBase] = useState(0);
  const [notaFronEnd, setNotaFronEnd] = useState(0);
  const [notaBackEnd, setNotaBackEnd] = useState(0);

  const [database, setDatabase] = useState(0);
  const [frontEnd, setFrontEnd] = useState(0);
  const [backEnd, setBackEnd] = useState(0);



  function handleSubmit(event) {
    event.preventDefault();

    if(selectValue == "database" ){
      setDatabase(database + 1);
      setNotaDataBase(database);
    } else if(selectValue == "frontend"){
      setFrontEnd(frontEnd + 1)
      setNotaFronEnd(nota);
    } else if(selectValue == "backend"){
      setBackEnd(backEnd + 1)
      setNotaBackEnd(nota);
    } else {
      setError("Selecione uma escolha válida")
    }
  }

  return (
    <div className="container">
      <h1>Média de Alunos por Disciplina</h1>
      <form className="form" onSubmit={handleSubmit}>
        <div className="container_input">
          <select value={selectValue} onChange={(e) => {setSelectValue(e.target.value)}}>
            <option selected disabled>
              Selecione uma disciplina
            </option>
            <option value="database">Banco de Dados</option>
            <option value="backend">Desenvolvimento Backend</option>
            <option value="frontend">Desenvolvimento Frontend</option>
            <option value="devops">Devops</option>
          </select>          
          <input value={nota} onChange={(e) => {setNota(e.target.value)}} />
          <span>{error}</span>
        </div>
        <input type="submit" value="Salvar" />
      </form>

      <div className="container">
        <table border="1" className="line_title">
          <thead>
            <tr>
              <th>Disciplina</th>
              <th>Quantidade de Alunos</th>
              <th>Média das notas dos alunos</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>Banco de Dados</td>
              <td>{database}</td>
              <td>{notaDataBase}</td>
            </tr>

            <tr>
              <td>Desenvolvimento Frontend</td>
              <td>{frontEnd}</td>
              <td>{notaFronEnd}</td>
            </tr>

            <tr>
              <td>Desenvolvimento Backend</td>
              <td>{backEnd}</td>
              <td>{notaBackEnd}</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default App;
