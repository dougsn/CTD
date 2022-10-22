

const Pai = (props) => {
  return (
    <div
    style={{
      width: "75%",
      background: "#FFEFD5",
      height: "200px",
      padding: "20px", 
    }}
    >

    <h5>Sou um Pai</h5>
    {props.children}
    </div> 
  );
};

const Filho = (props) => {

  return (
    <div
    style={{
      width: "50%",
      background: "#FA9072",
      height: "100px",
      padding: "10px",
      color: "white",
      fontSize: "30px",
    }}
    >
      {props.autor}
    </div>
  )

}


const App = () => {
  return (
    <Pai>
      <Filho autor ="Sou um Filho" />
    </Pai>
  )
}



export default App
