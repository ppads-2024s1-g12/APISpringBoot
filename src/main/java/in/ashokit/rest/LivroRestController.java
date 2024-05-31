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

import in.ashokit.binding.Livro;
import in.ashokit.service.LivroService;

@RestController
public class LivroRestController {

	@Autowired
	private LivroService livroService;

	@PostMapping("/livro")
	public ResponseEntity<String> createCourse(@RequestBody Livro livro) {
		String status = livroService.upsert(livro);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/livro/{idlivro}")
	public ResponseEntity<Livro> getFilme(@PathVariable Integer idlivro) {
		Livro livro = livroService.getById(idlivro);
		return new ResponseEntity<>(livro, HttpStatus.OK);
	}

	@GetMapping("/livros")
	public ResponseEntity<List<Livro>> getAllCourses() {
		List<Livro> allLivros = livroService.getAllLivros();
		return new ResponseEntity<>(allLivros, HttpStatus.OK);
	}

	@PutMapping("/livro")
	public ResponseEntity<String> updateFilme(@RequestBody Livro livro) {
		String status = livroService.upsert(livro);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@DeleteMapping("/livro/{idlivro}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer idlivro) {
		String status = livroService.deleteById(idlivro);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
