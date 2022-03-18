import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	Scanner teclado = new Scanner(System.in);
	private int agencia;
	private int conta;
	private String nome;
	private String email;
	private long telefone;
	private double saldo;

	ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public void Cadastro() {

		System.out.println("#####-CADASTRO-#####");
		System.out.println();
		System.out.println("Informe a Agencia: ");
		this.agencia = teclado.nextInt();
		System.out.println("Informe a Conta: ");
		this.conta = teclado.nextInt();
		System.out.println("Informe o Nome do cliente: ");
		this.nome = teclado.next();
		System.out.println("Informe o E-mail do cliente: ");
		this.email = teclado.next();
		System.out.println("Informe o Telefone do cliente: ");
		this.telefone = teclado.nextLong();
		System.out.println("Informe o Saldo inicial da conta do cliente: ");
		this.saldo = teclado.nextDouble();

		clientes.add(this);

	}

	public void Consulta() {

		for (Cliente c : clientes) {

			System.out.println();
			System.out.println("Cliente: " + c.getNome());
			System.out.println("Agência: " + c.getAgencia());
			System.out.println("Conta: " + c.getConta());
			System.out.println("Telefone: " + c.getTelefone());
			System.out.println("Email: " + c.getEmail());
			System.out.println(".........................");
			System.out.println("Saldo = R$" + c.getSaldo());
			System.out.println();
		}
	}

	public Cliente(int agencia, int conta, String nome, String email, long telefone, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
