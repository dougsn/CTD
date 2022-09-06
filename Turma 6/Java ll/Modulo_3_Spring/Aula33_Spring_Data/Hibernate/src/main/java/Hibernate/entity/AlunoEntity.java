package Hibernate.entity;


import javax.persistence.*;

@Entity
@Table(name = "Aluno")
public class AlunoEntity {

    @Id
    @SequenceGenerator(name = "aluno_sequence", sequenceName = "aluno_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    private Long id;
    private String nome;
    private int idade;
    // são vários alunos para 1 escola
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "escola_id") // Onde que o aluno faz join com a tabela da escola.
    private EscolaEntity escolaEntity;

    public AlunoEntity() {
    }

    public AlunoEntity(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public EscolaEntity getEscolaEntity() {
        return escolaEntity;
    }

    public void setEscolaEntity(EscolaEntity escolaEntity) {
        this.escolaEntity = escolaEntity;
    }
}
