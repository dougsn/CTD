import styles from './styles.module.css'

const ItemList = ({ item }) => { // Desestruturando o carro.item

    const { marca, modelo, descricao, cor, img } = item; // Desestruturando a item

    return (
    <li style={{ backgroundColor: cor }} className={styles.item_list}  >
        <h2 >{modelo}</h2>
        <h3>{marca}</h3>
        <p>{descricao}</p>
        <img src={img} alt={descricao}/>
    </li>
    );
};

export default ItemList;    