import axios from "axios";

const api = axios.create({
  baseURL: "https://backend-9cx8612q4-brunowbbs.vercel.app/public",
});

export default api;
