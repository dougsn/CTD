import { useContext, useState } from "react";
import { useNavigate } from "react-router-dom";
import { ToastContainer, toast } from "react-toastify";
import { Button, Carousel } from "react-bootstrap";

import { FiEye, FiEyeOff } from "react-icons/fi";

import { AuthContext } from "../../providers/AuthContext";
import api from "../../services/api";

import styles from "./styles.module.css";

const Auth = () => {
  const navigate = useNavigate();

  const { userData, fillUsetDataState } = useContext(AuthContext);

  const [emailForm, setEmailForm] = useState("teste@teste.com");
  const [password, setPassword] = useState("abc123");

  const [isVisble, setIsVisible] = useState(false);

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
      toast("Sucesso", { type: "success" });
      navigate("/products");
      fillUsetDataState({
        name: response.data.name,
        token: response.data.token,
        user: response.data.user,
      });
      console.log(response);
    } catch (error) {
      toast.error("asdasdasd", { position: "bottom-center" });
    }
  }

  function handleVisible() {
    setIsVisible(!isVisble);
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
          <div className={styles.container_input}>
            <input
              type={isVisble ? "text" : "password"}
              value={password}
              onChange={(event) => setPassword(event.target.value)}
              placeholder="Digite sua senha"
            />
            <div className={styles.icon} onClick={handleVisible}>
              {isVisble ? (
                <FiEye size={30} color="red" />
              ) : (
                <FiEyeOff size={30} />
              )}
            </div>
          </div>
          {/* <button className={styles.button}>Salvar</button> */}
          <Button variant="warning" type="submit">
            Secondary
          </Button>
        </form>
      </div>
      <ToastContainer />
    </div>
  );
};

export default Auth;
