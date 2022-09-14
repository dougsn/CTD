package escola.Escola.repository;

import escola.Escola.entity.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Long> {


    // O uso do HQL é realizado quando o JpaRepository não possuí uma query (metodo) já pronta.
    // Se tivessemos mais parâmetros e colocarios, por exemplo, ?2 ...
    @Query("Select professor p from Professor where p.direcao = ?1")
    Optional<ProfessorEntity> findEscolaByDirecao(String direcao);

}
