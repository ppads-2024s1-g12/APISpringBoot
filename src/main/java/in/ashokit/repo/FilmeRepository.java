package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.binding.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Serializable> {

}
