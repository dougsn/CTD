import styles from "./styles.module.css";
import { Carousel, Button } from "react-bootstrap";
import { useNavigate } from "react-router-dom";

const Contact = () => {
  const navigate = useNavigate();

  return (
    <div className={styles.container}>
      <div className={styles.container_description}>
        <Button variant="light" onClick={() => navigate("/products")}>
          Voltar
        </Button>{" "}
        <Carousel>
          <Carousel.Item>
            <img
              className="d-block w-100"
              src="https://shethink.in/wp-content/uploads/2021/07/react.js-img.png"
              alt="First slide"
            />
            <Carousel.Caption>
              <h3>First slide label</h3>
              <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
            </Carousel.Caption>
          </Carousel.Item>
          <Carousel.Item>
            <img
              className="d-block w-100"
              src="https://bitnetinfotech.com/wp-content/uploads/2022/08/Frameworks-for-React-JS.jpg"
              alt="Second slide"
            />

            <Carousel.Caption>
              <h3>Second slide label</h3>
              <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
            </Carousel.Caption>
          </Carousel.Item>
          <Carousel.Item>
            <img
              className="d-block w-100"
              src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAjrWlAVb1-mefsFzePNb6pjJIiDjP-SLzp8W6mxJQlrzRh5X7lO9h0xk9wdQ5-a86lAA&usqp=CAU"
              alt="Third slide"
            />

            <Carousel.Caption>
              <h3>Third slide label</h3>
              <p>
                Praesent commodo cursus magna, vel scelerisque nisl consectetur.
              </p>
            </Carousel.Caption>
          </Carousel.Item>
        </Carousel>
        <h1>Sobre Nós</h1>
        <p>
          Mollit fugiat est nulla ad ipsum qui aliqua. Ea aute dolor veniam
          nostrud ex esse officia. Cupidatat quis ipsum occaecat quis dolore
          reprehenderit laboris aliquip tempor exercitation. Consectetur veniam
          veniam id aliquip. Ad magna mollit aute id commodo proident laborum
          est.
        </p>
        <p>
          Mollit fugiat est nulla ad ipsum qui aliqua. Ea aute dolor veniam
          nostrud ex esse officia. Cupidatat quis ipsum occaecat quis dolore
          reprehenderit laboris aliquip tempor exercitation. Consectetur veniam
          veniam id aliquip. Ad magna mollit aute id commodo proident laborum
          est.
        </p>
        <p>
          Mollit fugiat est nulla ad ipsum qui aliqua. Ea aute dolor veniam
          nostrud ex esse officia. Cupidatat quis ipsum occaecat quis dolore
          reprehenderit laboris aliquip tempor exercitation. Consectetur veniam
          veniam id aliquip. Ad magna mollit aute id commodo proident laborum
          est.
        </p>
      </div>

      <div className={styles.container_form}>
        <form>
          <h3>Fale conosco</h3>
          <p>
            Mollit fugiat est nulla ad ipsum qui aliqua. Ea aute dolor veniam.
            Cupidatat quis ipsum occaecat quis dolore reprehenderit laboris
            aliquip tempor exercitatio
          </p>
          <div className={styles.input_row}>
            <input placeholder="E-mail" />
            <input placeholder="Telefone" />
          </div>
          <textarea placeholder="Digite sua mensagem"></textarea>
          <button>Enviar</button>
        </form>
      </div>
    </div>
  );
};

export default Contact;
