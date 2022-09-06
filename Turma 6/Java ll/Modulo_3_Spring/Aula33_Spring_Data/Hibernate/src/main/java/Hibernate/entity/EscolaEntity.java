package Hibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Escola")
public class EscolaEntity {

    @Id
    @SequenceGenerator(name = "escola_sequence", sequenceName = "escola_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    private Long id;
    private String nome;
    private String direcao;
    // O mappedBy tem que ter o nome da váriavel que será mapeada no AlunoEntity, para realizar o mapeamento
    @OneToMany(mappedBy = "escolaEntity", fetch = FetchType.LAZY) // Uma escola possui varios alunos
    private Set<AlunoEntity> alunos = new HashSet<>();


    public EscolaEntity() {
    }

    public EscolaEntity(String nome, String direcao) {
        this.nome = nome;
        this.direcao = direcao;
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

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public Set<AlunoEntity> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<AlunoEntity> alunos) {
        this.alunos = alunos;
    }
}
