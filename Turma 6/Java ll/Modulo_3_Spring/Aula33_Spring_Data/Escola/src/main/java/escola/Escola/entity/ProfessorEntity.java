package escola.Escola.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Professor")
public class ProfessorEntity {

    @Id
    @SequenceGenerator(name = "professor_sequence", sequenceName = "professor_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    private Long id;
    private String nome;
    private String curso;
    @OneToMany(mappedBy = "professorEntity", fetch = FetchType.LAZY)
    private Set<AlunoEntity> alunos = new HashSet<>();

    public ProfessorEntity() {
    }

    public ProfessorEntity(String nome) {
        this.nome = nome;
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
