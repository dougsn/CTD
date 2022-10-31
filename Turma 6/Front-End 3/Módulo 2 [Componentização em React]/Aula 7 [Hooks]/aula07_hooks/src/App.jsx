// Esse HOOK, é responsável por REENDERIZAR na tela

import { useState } from 'react';


const App = () => {

  const [numero, setNumero] = useState(0); // Variavel numero começa com 0 e o setNumero altera a variavel numero

  // const [valores, setValores] = useState([10, 20, 30, 40]);
  const [nomes, setNomes] = useState(["Maria","Ana"]);

  const handleButton = () => {
    setNumero(numero + 1); // Alterando o valor do número com o set
    // setValores([...valores, numero + 1]) // Pegando o valor do array e somando + 1;
    // O operador expred "...valores" lê o valores que estão no array e "jogam" em um novo
  }

  const addPessoa = () => {
    
    setNomes([...nomes, "Douglas"])
  }


  return (
    <>
      <h1>{numero}</h1>
      <ul>
        {
          nomes.map((vals) => <li>{vals}</li>)
        }
      </ul>
      <button onClick={handleButton}>aperte</button>
      <button onClick={addPessoa}>Add pessoa</button>
    </>
  )
}

export default App;