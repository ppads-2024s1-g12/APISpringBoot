package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Avaliacao;

public interface AvaliacaoService {

	public String upsert(Avaliacao avaliacao);

	public Avaliacao getById(Integer idavaliacao);

	public List<Avaliacao> getAllAvaliacaos();

	public String deleteById(Integer cid);

}
