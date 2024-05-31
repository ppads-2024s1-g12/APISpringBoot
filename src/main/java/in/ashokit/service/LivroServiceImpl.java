package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Livro;
import in.ashokit.repo.LivroRepository;

@Service
public class LivroServiceImpl implements LivroService {

	@Autowired
	private LivroRepository livroRepo;

	@Override
	public String upsert(Livro livro) {

		livroRepo.save(livro); // upsert (insert / update based on PK)

		return "success";
	}

	@Override
	public Livro getById(Integer cid) {
		Optional<Livro> findById = livroRepo.findById(cid);

		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Livro> getAllLivros() {
		return livroRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if (livroRepo.existsById(cid)) {
			livroRepo.deleteById(cid);
			return "Delete Success";
		} else {
			return "No Record Found";
		}
	}

}
