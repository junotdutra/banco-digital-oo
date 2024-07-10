
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Banco banco = new Banco("001", "Banco do Brasil");
		
		Conta cc = new ContaCorrente(venilton, banco);
		Conta poupanca = new ContaPoupanca(venilton, banco);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		
		((ContaPoupanca) poupanca).aplicar(1.0, 12, 100.0);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
