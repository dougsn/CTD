

export const Title = (props) => {
    return (
        <div className="titles">
            <h2>{props.nome}</h2>
            <h3>{props.preco}</h3>
        </div>
    )
}