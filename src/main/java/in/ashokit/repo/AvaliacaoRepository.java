package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.binding.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Serializable> {

}
