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

    if(selectValue == "database" && nota <= 10 && nota > 0){
      setDatabase(database + 1);
      setNotaDataBase(Number(nota) + Number(notaDataBase));
      setError("")
    } else if(selectValue == "frontend" && nota <= 10 && nota > 0){
      setFrontEnd(frontEnd + 1)
      setNotaFronEnd(Number(nota) + Number(notaFronEnd));
      setError("")
    } else if(selectValue == "backend" && nota <= 10 && nota > 0){
      setBackEnd(backEnd + 1)
      setNotaBackEnd(Number(nota) + Number(notaBackEnd));
      setError("")
    } else {
      setError("Selecione um valor válido")
    }
  }


  return (
    <div className="container">
      <h1>Média de Alunos por Disciplina</h1>
      <form className="form" onSubmit={handleSubmit}>
        <div className="container_input">
          <select value={selectValue} onChange={(e) => {setSelectValue(e.target.value)}}>
            <option disabled>
              Selecione uma disciplina
            </option>
            <option value="database">Banco de Dados</option>
            <option value="backend">Desenvolvimento Backend</option>
            <option value="frontend">Desenvolvimento Frontend</option>
            <option value="devops">Devops</option>
          </select>          
          <input value={nota} onChange={(e) => {setNota(e.target.value)}} />
        </div>
        <span style={{color:"red"}}>{error}</span>
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
              <td>{notaDataBase / database || 0}</td>
            </tr>

            <tr>
              <td>Desenvolvimento Frontend</td>
              <td>{frontEnd}</td>
              <td>{notaFronEnd / frontEnd || 0}</td>
            </tr>

            <tr>
              <td>Desenvolvimento Backend</td>
              <td>{backEnd}</td>
              <td>{notaBackEnd / backEnd || 0}</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default App;
