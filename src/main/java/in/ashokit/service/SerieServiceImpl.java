package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Serie;
import in.ashokit.repo.SerieRepository;

@Service
public class SerieServiceImpl implements SerieService {

	@Autowired
	private SerieRepository serieRepo;

	@Override
	public String upsert(Serie serie) {

		serieRepo.save(serie); // upsert (insert / update based on PK)

		return "success";
	}

	@Override
	public Serie getById(Integer cid) {
		Optional<Serie> findById = serieRepo.findById(cid);

		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Serie> getAllSeries() {
		return serieRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if (serieRepo.existsById(cid)) {
			serieRepo.deleteById(cid);
			return "Delete Success";
		} else {
			return "No Record Found";
		}
	}

}
