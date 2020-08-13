package intenties;

public class Bank {

	private int conta;
	private String nome;
	private double saldo;
	private final double TAXA = 5.00;
	
	public Bank(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	public Bank(int conta, String nome, double saldo) {
		this.conta = conta;
		this.nome = nome;
		deposito(saldo);
	}

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getsaldo() {
		return saldo;
	}

	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	public void saque(double saque) {
		saldo -= saque + TAXA;
	}
	
	public String toString() {
		return "Account " + conta + ", Holder: " + nome + ", Balance: $ " + String.format("%.2f", saldo);	
	}
}
