import { useState } from "react";



const App = () => {
  const [pessoa, setPessoa] = useState([])
  // const [nomes, setNomes] = useState([]) // Para salvar os inputs
  // const [idade, setIdade] = useState([]) // Para salvar os inputs
  // const [pokemon, setPokemon] = useState([]) // Para salvar os inputs
  const [valueInputNome, setValueInputNome] = useState("") // Pegando os valores
  const [valueInputIdade, setValueInputIdade] = useState("")
  const [valueInputPokemon, setValueInputPokemon] = useState("")
  const [errorNome, setErrorNome] = useState("")
  const [errorIdade, setErrorIdade] = useState("")
  const [errorPokemon, setErrorPokemon] = useState("")



  function handleForm(e) {
    e.preventDefault();

    if(valueInputNome.trim() && valueInputIdade.trim() && valueInputPokemon.trim()){

      // setNomes([...nomes, valueInputNome])
      // setIdade([...idade, valueInputIdade])
      // setPokemon([...pokemon, valueInputPokemon])
      
      setPessoa([...pessoa, [valueInputNome, valueInputIdade, valueInputPokemon]])

      setErrorNome("")
      setErrorIdade("")
      setErrorPokemon("")
    } else {
      valueInputNome.trim() ? setErrorNome("") : setErrorNome("Digite um nome") 
      valueInputIdade.trim() ? setErrorIdade("") : setErrorIdade("Digite uma Idade") 
      valueInputPokemon.trim() ? setErrorPokemon("") : setErrorPokemon("Digite um Pokemon")
    }


  }

  return (
    <>
      <form onSubmit={handleForm}>
        <label>
          Nome
          <input 
          value={valueInputNome} // vinculando o input com o estado
          onChange={(e) => {setValueInputNome(e.target.value)}} // Escutando o input
          />
        </label>
        <p>{errorNome}</p>
        <br/>
        <label>
          Idade
          <input 
          value={valueInputIdade} // vinculando o input com o estado
          onChange={(e) => {setValueInputIdade(e.target.value)}} // Escutando o input
          />
        </label>
        <p>{errorIdade}</p>
        <br/>
        <label>
          Pokemon
          <input 
          value={valueInputPokemon} // vinculando o input com o estado
          onChange={(e) => {setValueInputPokemon(e.target.value)}} // Escutando o input
          />
        </label>
        <p>{errorPokemon}</p>
        <br/>
        <input type="submit"/>
      </form>
      <ul>
        {pessoa.map((item, index) => <li key={index}>{item[0]} - {item[1]} - {item[2]}</li>)}
      </ul>
    </>
  )
}

export default App;