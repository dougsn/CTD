import { createContext, useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

export const AuthContext = createContext({});

const AuthProvider = ({ children }) => {
  const [userData, setUserData] = useState({});
  const navigate = useNavigate();

  function fillUserDataState({ name, token, user }) {
    localStorage.setItem(
      "@system_product",
      JSON.stringify({ name, token, user })
    );

    setUserData({ ...userData, name, token, user });
  }

  function emptyUserData() {
    setUserData({ name: "", token: "", email: "" });
  }

  useEffect(() => {
    const response = localStorage.getItem("@system_product");
    let user;
    if (response) {
      user = JSON.parse(response);
      fillUserDataState({
        name: user.name,
        token: user.token,
        user: user.user,
      });
      navigate("/home");
    }
  }, []);

  return (
    <AuthContext.Provider
      value={{
        userData,
        emptyUserData,
        fillUserDataState,
      }}
    >
      {children}
    </AuthContext.Provider>
  );
};

export default AuthProvider;
