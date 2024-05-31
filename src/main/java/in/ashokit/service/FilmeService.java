package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Filme;

public interface FilmeService {

	public String upsert(Filme filme);

	public Filme getById(Integer idfilme);

	public List<Filme> getAllFilmes();

	public String deleteById(Integer cid);

}
