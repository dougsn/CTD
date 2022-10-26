import "./App.css"

import { Card } from "./components/Card/Card"
import { Container } from "./components/Container"



import { cidade } from "./mock/cidades"

const App = () => {
  return (
    <>
      <Container>
        {cidade.map((content) => {

          if(content.country == "BRA"){
            return (
                <Card key={content.id} item={content}/>
            )
          }
        })}
      </Container>
    </>
  )
}

export default App; 