



import {Image} from "../Image/Image"
import {Title} from "../Title/Title"


export const List = (props) => {
    return (
        <>
            <li>
                <Image src={props.src} alt={props.alt} />
                <Title nome={props.nome} preco={props.preco}/>
            </li>
        </>
    )
}