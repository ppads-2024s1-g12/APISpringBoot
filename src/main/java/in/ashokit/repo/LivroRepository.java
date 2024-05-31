package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.binding.Livro;

public interface LivroRepository extends JpaRepository<Livro, Serializable> {

}
