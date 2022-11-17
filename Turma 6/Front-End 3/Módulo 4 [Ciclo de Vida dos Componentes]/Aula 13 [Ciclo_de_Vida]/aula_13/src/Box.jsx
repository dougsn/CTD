import { useEffect } from "react";

const Box = () => {
  useEffect(() => {
    return () => console.log("O componente foi desmontado"); // Essa mensagem aparece quando o componente é desmontado
  }, []);

  return (
    <div>
      <h1>Essa box está sendo mostrada</h1>
    </div>
  );
};

export default Box;
