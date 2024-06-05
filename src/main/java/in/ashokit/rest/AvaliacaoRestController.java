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

import in.ashokit.binding.Avaliacao;
import in.ashokit.service.AvaliacaoService;

@RestController
public class AvaliacaoRestController {

	@Autowired
	private AvaliacaoService avaliacaoService;

	@PostMapping("/avaliacao")
	public ResponseEntity<String> createCourse(@RequestBody Avaliacao avaliacao) {
		String status = avaliacaoService.upsert(avaliacao);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/avaliacao/{idavaliacao}")
	public ResponseEntity<Avaliacao> getAvaliacao(@PathVariable Integer idavaliacao) {
		Avaliacao avaliacao = avaliacaoService.getById(idavaliacao);
		return new ResponseEntity<>(avaliacao, HttpStatus.OK);
	}

	@GetMapping("/avaliacoes")
	public ResponseEntity<List<Avaliacao>> getAllCourses() {
		List<Avaliacao> allAvaliacaos = avaliacaoService.getAllAvaliacaos();
		return new ResponseEntity<>(allAvaliacaos, HttpStatus.OK);
	}

	@PutMapping("/avaliacao")
	public ResponseEntity<String> updateAvaliacao(@RequestBody Avaliacao avaliacao) {
		String status = avaliacaoService.upsert(avaliacao);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@DeleteMapping("/avaliacao/{idavaliacao}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer idavaliacao) {
		String status = avaliacaoService.deleteById(idavaliacao);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
