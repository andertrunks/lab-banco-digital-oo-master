
public class Main {

	public static void main(String[] args) {
		//Aqui é criado o primeiro cliente conforme treinamento
		//É criado uma nova classe de ContaInvestimento
		
		Cliente luis = new Cliente();
		luis.setNome("Luis");
				
		Conta cc = new ContaCorrente(luis);
		Conta poupanca = new ContaPoupanca(luis);
		Conta investimento = new ContaInvestimento(luis);

		cc.depositar(300);
		cc.transferir(100, poupanca);
		cc.transferir(50, investimento);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		investimento.imprimirExtrato();
		
				
		//Aqui é criado um novo cliente
		Cliente anderson = new Cliente();
		anderson.setNome("Anderson");
		
		Conta cc1 = new ContaCorrente(anderson);
		Conta poupanca1 = new ContaPoupanca(anderson);
		Conta investimento1 = new ContaInvestimento(anderson);

		cc1.depositar(500);
		cc1.transferir(200, poupanca1);
		cc1.transferir(100, investimento1);
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		investimento1.imprimirExtrato();
		
		luis.imprimirCliente();
		anderson.imprimirCliente();
				
	}

}
