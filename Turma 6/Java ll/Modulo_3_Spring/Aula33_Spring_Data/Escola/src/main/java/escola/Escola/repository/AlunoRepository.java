package escola.Escola.repository;

import escola.Escola.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {

    // O uso do HQL é realizado quando o JpaRepository não possuí uma query (metodo) já pronta.
    @Query("Select aluno a from Aluno where a.nome = ?1") // O ?1 se refere ao primeiro parâmetro
    // Se tivessemos mais parâmetros e colocarios, por exemplo, ?2 ...
    Optional<AlunoEntity> findAlunoByName(String nome);

}
