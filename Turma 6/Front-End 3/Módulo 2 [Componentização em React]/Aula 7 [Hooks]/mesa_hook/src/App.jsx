import { useState } from "react";

const App = () => {

  const [items, setItems] = useState([1]);


  const addItem = () => {
    setItems([...items, items.length + 1]); // Pegando o último elemento do array e somando mais 1 no items.
  }

  return (
    <>
    
      <ul>
        {
          items.map((val) => (
            <li>{`O item ${val} foi adicionado à lista!`}</li>
          ))
        }
      </ul>
      <button onClick={addItem}>Adicione itens na lista</button>
    </>
  )


}

export default App;