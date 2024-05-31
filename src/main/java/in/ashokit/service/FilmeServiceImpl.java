package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Filme;
import in.ashokit.repo.FilmeRepository;

@Service
public class FilmeServiceImpl implements FilmeService {

	@Autowired
	private FilmeRepository filmeRepo;

	@Override
	public String upsert(Filme filme) {

		filmeRepo.save(filme); // upsert (insert / update based on PK)

		return "success";
	}

	@Override
	public Filme getById(Integer cid) {
		Optional<Filme> findById = filmeRepo.findById(cid);

		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Filme> getAllFilmes() {
		return filmeRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if (filmeRepo.existsById(cid)) {
			filmeRepo.deleteById(cid);
			return "Delete Success";
		} else {
			return "No Record Found";
		}
	}

}
