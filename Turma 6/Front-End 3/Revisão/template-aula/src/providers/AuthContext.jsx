import { createContext, useEffect, useState } from "react";
import { useNavigate, useLocation } from "react-router-dom";

export const AuthContext = createContext({});

const AuthProvider = ({ children }) => {
  const [userData, setUserData] = useState({});

  const navigate = useNavigate();
  const location = useLocation();

  function fillUsetDataState({ name, token, user }) {
    localStorage.setItem(
      "@system_product",
      JSON.stringify({ name, token, user })
    );

    setUserData({ ...userData, name: name, token: token, user: user });
  }

  function emptyUserData() {
    setUserData({ name: "", email: "", token: "" });
  }

  useEffect(() => {
    const response = localStorage.getItem("@system_product");

    let user;

    if (response) {
      user = JSON.parse(response);

      fillUsetDataState({
        name: user.name,
        token: user.token,
        user: user.user,
      });
      // console.log();
      // navigate("/products");
      navigate(location?.pathname);
    }
  }, []);

  return (
    <AuthContext.Provider
      value={{
        userData,
        fillUsetDataState,
        emptyUserData,
      }}
    >
      {children}
    </AuthContext.Provider>
  );
};

export default AuthProvider;
