import { useEffect, useState } from "react";
import { createContext } from "react";
import EN from "../languages/english.json";
import PTBR from "../languages/portuguese.json";
import ES from "../languages/spanish.json";

export const languages = {
  english: {
    id: "EN",
    text: EN,
  },
  portugues: {
    id: "PTBR",
    text: PTBR,
  },
  espanhol: {
    id: "ES",
    text: ES,
  },
  /* DICA: Adicione os novos idiomas desejados */
};

const [language, setLanguage] = useState({});

useEffect(() => {
    setLanguage(languages.english)
}, [])

/* DICA: Use o createContext e inicie o idioma inglês como padrão(default) */
export const LanguageContext = createContext({});

const Languages = ({ children }) => {
  return (
    <LanguageContext.Provider value={{language, setLanguage}}>
      {children}
    </LanguageContext.Provider>
  );
};

export default Languages;

// const MyProvider = ({ children }) => {
//     const [nome, setNome] = useState("Wesley");

//     const [counter, setCounter] = useState(0);

//     function incrementCount() {
//       setCounter(counter + 1);
//     }

//     return (
//       <MyContext.Provider value={{ nome, setNome, counter, incrementCount }}>
//         {children}
//       </MyContext.Provider>
//     );
//   };

//   export default MyProvider;
