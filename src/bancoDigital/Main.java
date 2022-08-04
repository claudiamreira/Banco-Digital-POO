package bancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente claudia = new Cliente();
		claudia.setNome("Claudia");
		
		Conta cc = new ContaCorrente(claudia);
		cc.depositar(100);
		
		
		
		Conta cp = new ContaPoupanca(claudia);
		
		cc.transferir(15, cp);
		cp.sacar(10);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
