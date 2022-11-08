import "./style.css"

import { useState } from 'react'

import { Card } from "./components/Card/Card"
import { Title } from "./components/Title/Title"


function App() {

  const handleForm = (e) => {
    e.preventDefault();

    

  }

  return (
    <>
      <Title/>
      <form onSubmit={handleForm}>
        <div>
          <label>Nome</label>
          {/* Fazer o estado para vincular com o setNomeEstado() */}
          <input onChange={(e) => {e.target.value}}/> 
        </div>
        <div>
          <label>Cor</label>
          {/* Fazer o estado para vincular com o setNomeEstado() */}
          <input onChange={(e) => {e.target.value}} placeholder="Insira sua cor no formato Hexadecimal"/> 
        </div>
        <button>Adicionar</button>
      </form>
      <Card/>

    </>
  )
}

export default App
