package br.com.desafioavanade.searchdev.repository;

import br.com.desafioavanade.searchdev.model.AnalystEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * The Annotation @Repository can be considerate optional, didactic
 */
@Repository
public interface AnalystRepository extends JpaRepository<AnalystEntity, Integer> {
	@Query(value = "SELECT a FROM analyst a WHERE a.pId = :pId")
	Optional<AnalystEntity> findbyPId(@Param("pId") Long pId);
}
