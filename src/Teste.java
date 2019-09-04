
public class Teste {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		ContaCorrente cp = new ContaCorrente(); 
		cliente1.setNome("Matheus Garai");
		cliente1.setEndereco("Inferno");
		cliente1.setSaldo(12.22);
		cliente1.setCpf("123213");
		cp.setSaldo(2132);
		cp.ImprimirExtrato(); 
		qualClasse(cp); 
	}
	
	public static void qualClasse(Conta c) {
		System.out.println("A classe é: "+ c.getClass());
	}

}
