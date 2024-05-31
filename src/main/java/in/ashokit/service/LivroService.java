package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Livro;

public interface LivroService {

	public String upsert(Livro livro);

	public Livro getById(Integer idlivro);

	public List<Livro> getAllLivros();

	public String deleteById(Integer idlivro);
}
