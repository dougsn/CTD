import axios from "axios";



const data = axios.create({
    baseURL: "https://jsonplaceholder.typicode.com/posts"
})

export default data;