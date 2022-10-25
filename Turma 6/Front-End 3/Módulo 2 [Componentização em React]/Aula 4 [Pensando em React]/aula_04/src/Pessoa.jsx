

function Pessoa ({nome, idade, peso}) {

    if(peso){
        return (
            <>
                <h1>{nome} {idade >= 18 ? "Maior de idade" : "Menor de Idade"} {peso}</h1>
            </>
        )
    } else {
        <h1>{nome} {idade >= 18 ? "Maior de idade" : "Menor de Idade"}</h1>
    }

  
}

export default Pessoa;

// Renderização condicional

// Só vai renderizar se tiver com a prop peso.