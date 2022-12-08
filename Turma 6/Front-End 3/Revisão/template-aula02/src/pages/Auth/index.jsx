import { useContext, useState } from "react";
import { useNavigate } from "react-router-dom";
import { AuthContext } from "../../providers/AuthContext";
import api from "../../services/api";

import styles from "./styles.module.css";

const Auth = () => {
  const navigate = useNavigate();

  const { userData, fillUsetDataState } = useContext(AuthContext);

  const [emailForm, setEmailForm] = useState("");
  const [password, setPassword] = useState("");

  function submitForm(event) {
    event.preventDefault();

    auth();
  }

  async function auth() {
    try {
      const response = await api.post("/auth", {
        email: emailForm,
        password,
      });
      navigate("/home");
      fillUsetDataState({
        name: response.data.name,
        token: response.data.token,
        user: response.data.user,
      });
      console.log(response);
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
            onChange={(event) => setEmailForm(event.target.value)}
            placeholder="Digite seu e-mail"
            type="email"
          />
          <input
            value={password}
            onChange={(event) => setPassword(event.target.value)}
            placeholder="Digite sua senha"
          />

          <button className={styles.button}>Salvar</button>
        </form>
      </div>
    </div>
  );
};

export default Auth;
