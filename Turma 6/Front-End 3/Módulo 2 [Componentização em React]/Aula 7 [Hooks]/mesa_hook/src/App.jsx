import { useState } from "react";

const App = () => {

  const [items, setItems] = useState([]);


  function addItem(){
    setItems([...items, items.length + 1]); // Pegando o último elemento do array e somando mais 1 no items.
  }

  return (
    <>
      <ul>
        {
          items.map((item) => {
            <li>{`O item ${item} foi adicionado à lista!`}</li>
          })
        }
      </ul>
      <button onClick={addItem}>Aperte</button>
    </>
  )


}

export default App;