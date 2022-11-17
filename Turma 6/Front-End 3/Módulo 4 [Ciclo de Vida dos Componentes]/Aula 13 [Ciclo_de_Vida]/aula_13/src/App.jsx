import { useState, useEffect } from "react";
import Box from "./Box";

function App() {
  const [count, setCount] = useState(0);

  const [visibleBox, setVisibleBox] = useState(true);

  useEffect(() => {
    // Espera o componente aparecer na tela, e depois executa
    setCount(count + 1)
  }, []);

  return (
    <div>
      { visibleBox ? <Box /> : null }
      <button onClick={() => setVisibleBox(!visibleBox)}>Handle Box</button>
      <h1>{count}</h1>
    </div>
  );
}

export default App;
