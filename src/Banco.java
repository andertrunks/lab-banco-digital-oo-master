import java.util.List;
import lombok.Setter;
import lombok.Getter;

public class Banco {
	@Getter
	@Setter
	private String nome;
	
	@Getter
	@Setter
	private List<Conta> contas;
	
}
