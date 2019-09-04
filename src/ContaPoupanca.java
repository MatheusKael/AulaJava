
public class ContaPoupanca extends Conta {
	// Programar em JavaScript é muito melhor!@!
	// VS code é muito melhor 
	
	public void imprimirExtrato() {
		// nao cobra taxa para extrato
		
		double saldoAtual = getSaldo();
		saldoAtual -=2;
		setSaldo(saldoAtual);
		
		
		System.out.println("Saldo: " + saldoAtual);
		
	}

}
