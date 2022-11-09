import styles from "./Card.module.css"

export const Card = ({nome, cor}) => {
    return (
        <div className={styles.container}>
            <div className={styles.content}>
                <div className={styles.text} style={{backgroundColor: cor}}>
                <p>{nome}</p>
                <h3>{cor}</h3>
                </div>
            </div>
        </div>
    )
}