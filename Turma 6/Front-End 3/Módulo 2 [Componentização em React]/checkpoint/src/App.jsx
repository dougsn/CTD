import "./style.css"
import ScrollReveal from "scrollreveal"

import { useState } from 'react'

import { Card } from "./components/Card/Card"
import { Title } from "./components/Title/Title"


function App() {

  const [nome, setNome] = useState("")
  const [cor, setCor] = useState("")
  const [erro, setErro] = useState("")
  const [card, setCard] = useState([])
   
  function regex(cor) {
    const validationRegex = /^#([A-Fa-f0-9]{6})|^([A-Fa-f0-9]{6})$/;
    return !validationRegex.test(cor);
  }


  const handleForm = (e) => {
    e.preventDefault();

    

    if(nome.length < 3 || nome == "" && cor.length < 6 || cor == "" || regex(cor)){
      setErro("Por favor, verifique os dados inseridos no formulário")
      return;
    }
    

    setErro("")
    // setNome("")
    // setCor("")

    setCard([...card, [nome, cor]])
    
    
  }

  ScrollReveal().reveal(".container_card #card", { 
    duration: 2000,
    origin: 'left',
    distance: '50px' 
  });

  console.log(card);

  return (
    <>
    <div className="container">
      <div className={erro ? "content_erro" : "content"}>
      <Title titulo="ADICIONAR NOVA COR"/>
        <form onSubmit={handleForm}>
          <div className="content_form">
            <div>
              <label>Nome</label><br/>
              <input className={erro ? "input_error" : "input"} value={nome} onChange={(e) => {setNome(e.target.value)}}/> 
            </div>
            <div>
              <label>Cor</label>  <br/>        
              <input className={erro ? "input_error" : "input"} value={cor} onChange={(e) => {setCor(e.target.value)}} placeholder="Insira sua cor no formato Hexadecimal"/> 
            </div>
          </div>
          <div className="container_btn">
            <input className={erro ? "btn_erro" : "btn"} type="submit" value="Adicionar"/>
          </div>
        </form>
      </div>
      <Title titulo="CORES FAVORITAS" erro={erro ? erro : ""}/>
    </div>    
    
    <div className="container_card" >
      {card.map((item, index) => <Card key={index} nome={item[0]} cor={item[1]}/>)}
    </div>
    </>
  )
}

export default App;
