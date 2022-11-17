import { useState } from "react";
import { Users } from "./components/Users";

function App() {
  const [toggle, setToggle] = useState(false);

  return (
    <>
    {toggle && <Users />}
      <button onClick={() => setToggle(!toggle)}>{toggle ? "Ocultar" : "Ver"} Lista</button>
    </>
  );
}

export default App;
