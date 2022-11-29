import { useEffect } from "react";
import { useState } from "react";
import { Link } from "react-router-dom";


const Hotel = ({data}) => {

    const [info, setInfo] = useState([])

    useEffect(() => {
        setInfo(data)
    } , [data])

    return (
        <>
        {info.map((item) => (
          <tr key={item.id}>
            <td>{item.name}</td>
            <td>{item.city}</td>
            <td>{item.stars}</td>
            <Link to={`/details/${item.id}`}><button>Saiba +</button></Link>
          </tr>
        ))}
        </>
    )
}

export default Hotel;