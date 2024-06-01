package in.ashokit.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "series")
public class Serie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idserie;
	private String tituloserie;
	private Integer anolancamentoserie;
	private String elencoserie;
	private String paisserie;
	private String plataforma;
	private Integer temporadas;
	private String urlserie;
    private String generoserie;

}
