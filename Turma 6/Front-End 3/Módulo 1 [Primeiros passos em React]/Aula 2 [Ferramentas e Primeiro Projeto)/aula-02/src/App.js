import MeuComponente from './MeuComponente';

import './style.css'

function App() {
  return (
    <>        
      <h1>Hello World</h1>

      <p className='title'>Meu conteúdo</p>

      <button onClick={() => alert("Olá")}>Clique-me</button>
      <MeuComponente />
      <MeuComponente />
    </>
  );
}

export default App;
 