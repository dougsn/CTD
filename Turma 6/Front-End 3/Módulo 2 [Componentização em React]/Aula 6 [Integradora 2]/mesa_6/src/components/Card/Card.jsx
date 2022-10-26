import styles from "./styles.module.css";


import {Population} from "../Population"
import Title from "../Title"
import { City } from "../City"

export const Card = ({ item }) => {

    const {id,country, city, population, color} = item;
    return (
        <>
            <div className={styles.container_card}>
                <Title title={country}/>
                <City id={id} city={city}/>
                <Population population={population} color={color}/>
            </div>
        </>
    )
}

