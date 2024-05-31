package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Filme;
import in.ashokit.service.FilmeService;

@RestController
public class FilmeRestController {

	@Autowired
	private FilmeService filmeService;

	@PostMapping("/filme")
	public ResponseEntity<String> createCourse(@RequestBody Filme filme) {
		String status = filmeService.upsert(filme);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/filme/{idfilme}")
	public ResponseEntity<Filme> getFilme(@PathVariable Integer idfilme) {
		Filme filme = filmeService.getById(idfilme);
		return new ResponseEntity<>(filme, HttpStatus.OK);
	}

	@GetMapping("/filmes")
	public ResponseEntity<List<Filme>> getAllCourses() {
		List<Filme> allFilmes = filmeService.getAllFilmes();
		return new ResponseEntity<>(allFilmes, HttpStatus.OK);
	}

	@PutMapping("/filme")
	public ResponseEntity<String> updateFilme(@RequestBody Filme filme) {
		String status = filmeService.upsert(filme);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@DeleteMapping("/filme/{idfilme}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer idfilme) {
		String status = filmeService.deleteById(idfilme);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
