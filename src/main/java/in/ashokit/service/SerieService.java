package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Serie;

public interface SerieService {

	public String upsert(Serie serie);

	public Serie getById(Integer idserie);

	public List<Serie> getAllSeries();

	public String deleteById(Integer cid);

}
