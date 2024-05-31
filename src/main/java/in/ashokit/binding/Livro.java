package in.ashokit.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "livros")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idlivro;
	private String titulolivro;
	private String autorlivro;
	private Integer anopublicacaolivro;
	private String editoralivro;
	private String paislivro;
	private String capa;
	private String generolivro;

}
