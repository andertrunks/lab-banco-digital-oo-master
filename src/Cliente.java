
import lombok.Getter;
import lombok.Setter;

public class Cliente {
	
	@Getter @Setter
	private String nome;

	
	protected void imprimirCliente(){
		System.out.println(getNome());
	    
    }
}
