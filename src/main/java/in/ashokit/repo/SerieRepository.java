package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.binding.Serie;

public interface SerieRepository extends JpaRepository<Serie, Serializable> {

}
