
public class ContaPoupanca extends Conta {
	// Programar em JavaScript � muito melhor!@!
	// VS code � muito melhor 
	
	public void imprimirExtrato() {
		// nao cobra taxa para extrato
		
		double saldoAtual = getSaldo();
		saldoAtual -=2;
		setSaldo(saldoAtual);
		
		
		System.out.println("Saldo: " + saldoAtual);
		
	}

}
