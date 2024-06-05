package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Avaliacao;
import in.ashokit.repo.AvaliacaoRepository;

@Service
public class AvaliacaoServiceImpl implements AvaliacaoService {

	@Autowired
	private AvaliacaoRepository avaliacaoRepo;

	@Override
	public String upsert(Avaliacao avaliacao) {

		avaliacaoRepo.save(avaliacao); // upsert (insert / update based on PK)

		return "success";
	}

	@Override
	public Avaliacao getById(Integer cid) {
		Optional<Avaliacao> findById = avaliacaoRepo.findById(cid);

		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Avaliacao> getAllAvaliacaos() {
		return avaliacaoRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if (avaliacaoRepo.existsById(cid)) {
			avaliacaoRepo.deleteById(cid);
			return "Delete Success";
		} else {
			return "No Record Found";
		}
	}

}
