import logo from "./assets/logo.png"
import "./style.css"


function App() {

  return (   

      <div className="container">
        <h1 className="title">Hello I'm ReactJs</h1>
        <img src={logo} alt="Imagem" />

      </div>  
  )
}

export default App;

// export {  App, App2 } // Exportando 2 Components