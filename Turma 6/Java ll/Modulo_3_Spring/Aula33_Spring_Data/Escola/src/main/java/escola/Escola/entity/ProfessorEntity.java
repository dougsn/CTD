package escola.Escola.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Professor")
public class ProfessorEntity {

    @Id
    @SequenceGenerator(name = "professor_sequence", sequenceName = "professor_sequence", allocationSize = 1)
    // Vai criar e controlar toda a criação dos nossos ID's
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "professor_sequence")
    // Será a forma que essa sequencia será gerada.
    private Long id;
    private String nome;
    private String curso;
    @OneToMany(mappedBy = "professorEntity", fetch = FetchType.LAZY)
    private Set<AlunoEntity> alunos = new HashSet<>();

    public ProfessorEntity() {
    }

    public ProfessorEntity(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Set<AlunoEntity> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<AlunoEntity> alunos) {
        this.alunos = alunos;
    }
}
