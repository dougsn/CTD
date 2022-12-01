import "./App.css";
import Navbar from "./components/Navbar";
import Body from "./components/Body";
import LanguageContext, { languages } from "./providers/Context";
import React, { useState } from "react";

function App() {
  const [language, setLanguage] = useState(languages.english);

  const handleChangeLA = () => {
    setLanguage(() =>
      language === languages.english ? languages.portuguese : languages.english
    );
  };

  return (
    <LanguageContext.Provider value={{ language, handleChangeLA }}>
      <Navbar />
      <Body />
    </LanguageContext.Provider>

  );
}

export default App;
