export const Title = ({titulo, erro}) => {
    return (
    <>
        
        <div style={{display: "flex", width: "90%", marginTop: "30px", flexDirection:"column"}}><span style={{color:"#FF7070"}}>{erro}</span><h1>{titulo}</h1></div>
    </>
    )
    
}