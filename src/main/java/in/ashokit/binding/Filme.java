package in.ashokit.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "filmes")
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idfilme;
	private String titulofilme;
	private String diretorfilme;
	private Integer anolancamentofilme;
	private String elencofilme;
	private String paisfilme;
	private String urlfilme;
	private String generofilme;

}
