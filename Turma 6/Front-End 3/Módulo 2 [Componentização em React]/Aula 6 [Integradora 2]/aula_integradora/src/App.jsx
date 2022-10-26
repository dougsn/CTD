import styles from './styles.module.css'

import ItemList from './components/ItemList';

import { carros } from "./mock/carros"; // Separando o array do componente

const App = () => {
  return (
    <ul className={styles.item_list}>
      {carros.map((carro) => 
       
       <ItemList key={`carros-list-${carro.id}`} item={carro}/> // Passando o array com as informações para o componente ItemList

      )}
    </ul>
  )
}
export default App
