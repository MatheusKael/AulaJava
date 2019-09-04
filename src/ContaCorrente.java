
public class ContaCorrente extends Conta implements Interfacebook {
	public double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ImprimirExtrato() {
		double saldoAtual = getSaldo();
		saldoAtual--;
		setSaldo(saldoAtual);
		System.out.println("Saldo: "+ saldoAtual);
		
	}

	

	
}
