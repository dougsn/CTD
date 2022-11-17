import { useRef, useState } from 'react'; 

const App = () => {

  // const inputRef = useRef(null) // O useRef pega a referencia do elemento

  const [valueInput, setValueInput] = useState("")

  const [errorInput, setErrorInput] = useState("")

  const [isChecked, setIsChecked ] = useState(false)

  const [nomes, setNomes] = useState([])

  function handleSubmit(e){

    if(valueInput.trim()){ // Vende se o input possui algum valor
      
      setNomes([...nomes, valueInput]) // Pegando os valores do nomes e acrescentando com o valueInput
      
      setErrorInput("")
      setValueInput("")


    } else {
      setErrorInput("Digite um nome no campo")
    }

    e.preventDefault();
    // alert(inputRef.current.value) // Pegando o que está sendo digitado no input

  }

  return (
    <div style={isChecked ? {background:'red'}: {}}>
    <h1>{isChecked.toString()}</h1> 
    <ul>
      {nomes.map((item) => <li>{item}</li>)}
    </ul>

      <form onSubmit={handleSubmit}>

        {/* <input ref={inputRef} /> */}

       
        <input 
        value={valueInput}  // Atralando o valor do estado com o input
        onChange={(event) => {setValueInput(event.target.value)}} />  {/* O onChange fica escutando a mudança do elemento */}
        
        <label>
          Pressionado?
          {/* Verificando se o checkbox está marcado ou não  */}
          <input 
          value={isChecked}
          type="checkbox" 
          onChange={(event) => setIsChecked(event.target.checked)}/>
        </label>
        <p>{errorInput}</p>
        
        {/* Se estiver checado, apareça, se não, desapareça (input) */}
        {isChecked ? <input type="submit" /> : null} 
      
      </form>
    </div>
  )
}

export default App;

// Componentes Uncontrolled - Componentes controlados pela DOM

// Componentes Controlled - Componentes controlado pelo react (useState)