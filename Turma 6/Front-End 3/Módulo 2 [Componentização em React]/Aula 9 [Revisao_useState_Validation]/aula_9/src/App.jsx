import { useState } from "react"

function App() {

  // Gerenciando varios estados em 1 useState apenas, criando um "objeto" de estado.
  const [formData, setFormData] = useState({nome: "", conteudo: ""}) // 1 estado, sendo 1 objeto que está armazenado todos os campos do formulario. Boas práticas

  // const [numero, setNumero] = useState(0);

  // const incrementar = () => {
  //   setNumero(numero + 1)
  // }

  // const [nome, setNome] = useState("")
  // const [conteudo, setConteudo] = useState("")


  const handleForm = (e) => {
    e.preventDefault();

    

  } 

  

  return (
    <>
      {/* <h1>Numero atual: {numero}</h1>
      <button onClick={incrementar}>Incrementar</button> */}

      {formData.nome ? <h2>Nome: {formData.nome}</h2> : <h2>Input Vazio</h2>}
      {formData.conteudo ? <h2>Conteudo: {formData.conteudo}</h2> : <h2>Esperando o usuário selecionar</h2>}

      <form onSubmit={handleForm}>
        {/* o value é necessário para limpar o campo após o submit */}
        <input value={formData.nome} onChange={(e) => setFormData({...formData, nome:e.target.value})} />
        

        <select value={formData.conteudo} onChange={(e) => {setFormData({...formData, conteudo: e.target.value})}}>
          <option value="front-end">Front-end</option>
          <option value="back-end">Back-end</option>
          <option value="ux-ui">UX/UI</option>
        </select>

        <input type="submit"/>
        

      </form>


    </>
  )
}

export default App
