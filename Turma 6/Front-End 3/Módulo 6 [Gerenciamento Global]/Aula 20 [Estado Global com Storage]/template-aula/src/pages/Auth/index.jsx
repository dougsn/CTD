import { useContext, useState } from "react";
import { useNavigate } from "react-router-dom";
import { AuthContext } from "../../providers/AuthContext";
import api from "../../services/api";

import styles from "./styles.module.css";

const Auth = () => {
  const navigate = useNavigate();

  const { userData, fillUserDataState } = useContext(AuthContext);

  const [emailForm, setEmailForm] = useState("");
  const [senha, setSenha] = useState("");

  function submitForm(event) {
    event.preventDefault();

    auth();
  }

  // https://backend-9cx8612q4-brunowbbs.vercel.app/

  async function auth() {
    try {
      const response = await api.post("/auth", {
        email: emailForm,
        password: senha,
      });

      console.log(response);
      navigate("/home");
      fillUserDataState({
        name: response.data.name,
        token: response.data.token,
        user: response.data.token,
      }); // Preenchendo o Provider.
    } catch (error) {
      alert("Erro ao fazer login");
    }
  }

  return (
    <div className={styles.container}>
      <div className={styles.card}>
        <h1>Login {userData.token}</h1>

        <p>Entre com seus dados corretamente para acessar o sistema</p>

        <form onSubmit={submitForm}>
          <input
            value={emailForm}
            onChange={(e) => setEmailForm(e.target.value)}
            placeholder="Digite seu e-mail"
            type="email"
          />
          <input
            value={senha}
            onChange={(e) => setSenha(e.target.value)}
            placeholder="Digite sua senha"
          />

          <button className={styles.button}>Salvar</button>
        </form>
      </div>
    </div>
  );
};

export default Auth;
