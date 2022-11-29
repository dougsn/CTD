import { useState, useCallback, useMemo, useEffect } from "react";

function App() {
  const [nome, setNome] = useState("");
  const [numero, setNumero] = useState(0);

  // Sempre que precisar cachear uma função( de modo que ela não seja redeclarada, use o useCallback)
  // O useCallback eu memorizo funções
  // Salvando a função na memória coom o useCallback, para não ficar gastando memória
  const handleName = useCallback((e) => setNome(e.target.value), []);
  const incrementValue = () => setNumero(numero + 1);

  // O Recomendado é fazer a chamada da API pelo useCallback para cachear as informações
  const getUser = useCallback(async () => {
    const response = await fetch("...");
    console.log(response);
  }, []);

  useEffect(() => {
    getUser();
  }, [getUser]);

  // O useMemo eu memorizo valores
  const data = useMemo(() => Array(33_000_000).fill({ foo: "baar" }), []);

  return (
    <div>
      {nome}
      <input value={nome} onChange={(e) => handleName(e)} />
      <br />
      <button onClick={incrementValue}>Incrementar</button>
      {numero}
    </div>
  );
}

export default App;
