import { useEffect, useState } from "react";
import axios from "axios";

import "./styles.css";

const App = () => {
  const [id, setId] = useState("");
  const [users, setUsers] = useState([]);
  const [formData, setFormData] = useState({
    name: "",
    email: "",
    phone: "",
    birthDate: "",
  });

  useEffect(() => {
    getUser();
  }, []);

  async function getUser() {
    try {
      const response = await axios.get("https://backend-dh.vercel.app/users");
      setUsers(response.data);
    } catch (error) {
      alert("Erro ao buscar usuários");
    }
  }

  async function createUser() {
    try {
      const response = await axios.post("https://backend-dh.vercel.app/users", {
        name: formData.name,
        email: formData.email,
        phone: formData.phone,
        birthDate: formData.birthDate,
      });
      setFormData({ name: "", email: "", phone: "", birthDate: "" });
      setUsers([...users, response.data]);
    } catch (error) {
      alert("Erro ao tentar salvar usuário");
    }
  }

  async function fillUser(user) {
    const date = user.birthDate.split("T")[0]; // Formatando a data

    setFormData({ // setando os dados no formulário, para edição
      name: user.name,
      email: user.email,
      phone: user.phone,
      birthDate: date,
    });
    setId(user._id); // colocando o ID no estado para edição
  }

  async function editUser() {
    try {
      await axios.put(`https://backend-dh.vercel.app/users/${id}`, { // Pegando o ID, que foi capturado pelo filtro no botão
        name: formData.name,
        email: formData.email,
        phone: formData.phone,
        birthDate: formData.birthDate,
      });
      setId(""); // Limpando o ID.
      setFormData({ name: "", email: "", phone: "", birthDate: "" }); // Limpando os campos
      getUser(); // Renderizando os usuários na tabela.
    } catch (error) {
      alert("Erro ao editar o usuário");
    }
  }

  async function removeUser(id) {
    try {
      await axios.delete(`https://backend-dh.vercel.app/users/${id}`);
      getUser();
    } catch (error) {
      alert("Erro ao tentar excluir usuário");
    }
  }

  function submitForm() {
    if (id) { // Se tiver ID, edite esse ID
      editUser();
    } else { // Se não tiver ID, crie um novo usuário.
      createUser();
    }
  }

  return (
    <div>
      <form>
        <input
          placeholder="Nome"
          value={formData.name}
          onChange={(event) =>
            setFormData({ ...formData, name: event.target.value })
          }
        />
        <input
          placeholder="Email"
          value={formData.email}
          onChange={(event) =>
            setFormData({ ...formData, email: event.target.value })
          }
        />
        <input
          placeholder="Telefone"
          value={formData.phone}
          onChange={(event) =>
            setFormData({ ...formData, phone: event.target.value })
          }
        />
        <input
          placeholder="Data de Nascimento"
          type="date"
          value={formData.birthDate}
          onChange={(event) =>
            setFormData({ ...formData, birthDate: event.target.value })
          }
        />
        <button type="button" onClick={submitForm}>
          Salvar
        </button>
      </form>

      <div className="container-table">
        <table>
          <thead>
            <tr>
              <th>Nome</th>
              <th>Email</th>
              <th>Telefone</th>
              <th>Data de nascimento</th>
              <th>Ações</th>
            </tr>
          </thead>
          <tbody>
            {users.map((user) => (
              <tr key={user.id}>
                <td>{user.name}</td>
                <td>{user.email}</td>
                <td>{user.phone}</td>
                <td>{user.birthDate}</td>
                <td>
                  <button onClick={() => fillUser(user)}>Editar</button>
                  <button onClick={() => removeUser(user._id)}>Apagar</button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default App;
