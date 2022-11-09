import "./style.css"

import { useState } from 'react'

import { Card } from "./components/Card/Card"
import { Title } from "./components/Title/Title"


function App() {

  // const [formData, setFormData] = useState({
  //   nome: "",
  //   cor:""
  // })

  const [nome, setNome] = useState("")
  const [cor, setCor] = useState("")

   const [card, setCard] = useState([])
   



  const handleForm = (e) => {
    e.preventDefault();

    if(nome.length < 3 || nome == ""){
      alert("Minímo de 3 caracteres e não pode ter campo em branco")
      return;
    }

    setCard([...card, [nome, cor]])
  }

  return (
    <>
    <div className="container">
      <div className="content">
      <Title titulo="ADICIONAR NOVA COR"/>
        <form onSubmit={handleForm}>
          <div className="content_form">
            <div>
              <label>Nome</label><br/>
              <input value={nome} onChange={(e) => {setNome(e.target.value)}}/> 
            </div>
            <div>
              <label>Cor</label>  <br/>        
              <input value={cor} onChange={(e) => {setCor(e.target.value)}} placeholder="Insira sua cor no formato Hexadecimal"/> 
            </div>
          </div>
          <div className="container_btn">
            <input type="submit" value="Adicionar"/>
          </div>
        </form>
      </div>
      <Title titulo="CORES FAVORITAS"/>
    </div>    
    
    <div className="container_card">
      {card.map((item, index) => <Card key={index} nome={item[0]} cor={item[1]}/>)}
    </div>
    </>
  )
}

export default App
