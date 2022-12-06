import { createContext } from "react";
import EN from "../languages/english.json";
import PTBR from "../languages/portuguese.json";

export const languages = {
  english: {
    id: "EN",
    text: EN,
  },
  portuguese: {
    id: "PTBR",
    text: PTBR,
  },
};

/* DICA: Use o createContext e inicie o idioma inglês como padrão(default) */
export const LanguageContext = createContext({});

export default LanguageContext;
