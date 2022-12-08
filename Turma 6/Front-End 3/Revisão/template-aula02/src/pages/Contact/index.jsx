import styles from "./styles.module.css";

const Contact = () => {
  return (
    <div className={styles.container}>
      <div className={styles.container_description}>
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
