

function Nome(props){
  return (
    <>
      {props.name}
    </>
  )
}


function Hello(props){
  return (
    <div className="container">
      {props.hello}
      {props.children}
    </div>
  )
}


function App() {
  return(
    <Hello hello="Hello ">
      <Nome name="Douglas"/>
    </Hello>
  )
}

export default App
