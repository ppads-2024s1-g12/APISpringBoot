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

import in.ashokit.binding.Serie;
import in.ashokit.service.SerieService;

@RestController
public class SerieRestController {

	@Autowired
	private SerieService serieService;

	@PostMapping("/serie")
	public ResponseEntity<String> createCourse(@RequestBody Serie serie) {
		String status = serieService.upsert(serie);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/serie/{idserie}")
	public ResponseEntity<Serie> getFilme(@PathVariable Integer idserie) {
		Serie serie = serieService.getById(idserie);
		return new ResponseEntity<>(serie, HttpStatus.OK);
	}

	@GetMapping("/series")
	public ResponseEntity<List<Serie>> getAllCourses() {
		List<Serie> allSeries = serieService.getAllSeries();
		return new ResponseEntity<>(allSeries, HttpStatus.OK);
	}

	@PutMapping("/serie")
	public ResponseEntity<String> updateFilme(@RequestBody Serie serie) {
		String status = serieService.upsert(serie);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@DeleteMapping("/serie/{idserie}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer idserie) {
		String status = serieService.deleteById(idserie);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
