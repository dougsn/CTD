import { useEffect, useState } from "react";

export function Users() {
  const [users, setUsers] = useState([]);

  const getUsersData = async () => {
    try {
      const response = await fetch(
        "https://jsonplaceholder.typicode.com/users"
      );
      const userData = await response.json();
      setUsers(userData);
    } catch (error) {
      console.log(error.message);
    }
  };

  useEffect(() => {
    getUsersData();
    console.log("Montou");
    return () => console.log("Desmontou");
  }, []);
  return (
    <table>
      <thead>
        <tr>
          <td>Name</td>
          <td>E-mail</td>
        </tr>
      </thead>
      <tbody>
        {users.length > 0 &&
          users.map((user) => {
            return (
              <tr key={user.id}>
                <td>{user.name}</td>
                <td>{user.email}</td>
              </tr>
            );
          })}
      </tbody>
    </table>
  );
}
