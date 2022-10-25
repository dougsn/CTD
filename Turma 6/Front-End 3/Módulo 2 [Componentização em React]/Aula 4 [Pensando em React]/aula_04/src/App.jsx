import { Button } from "./Button";
import { Title } from "./Title";
import  Pessoa  from "./Pessoa";

// // Clean Code
// const App = () => <h1>Hello World</h1>

function App() {

  function btn1Func(){
    alert("Btn 1");
  }

  function btn2Func(){
    alert("Btn 2");
  }

  function btn3Func(){
    alert("Btn 3");
  }

  return (
    <>
      <Title text="Hello World" numero="2"/>
      <Title/>
      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Est, reprehenderit.</p>
      <Button name="Clique aqui" color="red" click={btn1Func}/>
      <Button name="Pressione" color="blue" click={btn2Func}/>
      <Button name="Clique aqui" color="green"click={btn3Func}/>

      <Pessoa nome="Douglas" idade={17} peso={79}/>
      <Pessoa nome="João"  idade={25} peso={71}/>
      <Pessoa nome="Ana"  idade={22} peso={48}/>
      <Pessoa nome="Carlos"  />

    </>
  )
}

export default App;
