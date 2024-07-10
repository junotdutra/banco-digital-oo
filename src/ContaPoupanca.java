
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
		
	}

	  void aplicar(Double jurosMes, Integer anos, Double parcelaMensal) {

		Double rendimentoMensal = 0.0;
		Double total= 0.0;
		for (int i = 0; i < anos; i++) {
			total = total + parcelaMensal;
			rendimentoMensal = (total * jurosMes)/100;
			total = total+rendimentoMensal;
		}
		
		System.out.println("=========Aplicação==========");
		System.out.println("===========Juros============");
		System.out.println(String.format("%.2f",jurosMes));
		System.out.println("===========Tempo============");
		System.out.println(anos + " anos");
		System.out.println("===========Parcela Mensal===");
		System.out.println(String.format("%.2f", parcelaMensal));
		System.out.println("===========Total============");
		System.out.println(String.format("%.2f", total));

	}
}
