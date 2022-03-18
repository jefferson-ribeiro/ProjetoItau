import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	Scanner teclado = new Scanner(System.in);
	private int agencia;
	private int conta;
	private String nome;
	private String email;
	private String telefone;
	private double saldo;

	ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	int cont = 0;

	public void Cadastro() {

		Cliente c = new Cliente();

		System.out.println("#####-CADASTRO-#####");
		System.out.println();
		System.out.println("Informe a Agencia: ");
		c.setAgencia(teclado.nextInt());
		System.out.println("Informe a Conta: ");
		c.setConta(teclado.nextInt());
		System.out.println("Informe o Nome do cliente: ");
		c.setNome(teclado.next());
		System.out.println("Informe o E-mail do cliente: ");
		c.setEmail(teclado.next());
		System.out.println("Informe o Telefone do cliente: ");
		c.setTelefone(teclado.next());
		System.out.println("Informe o Saldo inicial da conta do cliente: ");
		c.setSaldo(teclado.nextDouble());

		clientes.add(c);
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

	public void GravaArq() throws IOException {
		FileWriter arquivo = new FileWriter("d:\\correntistas.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);

		gravarArquivo.printf("=====Cadastro de Correntistas=====" + "%n");
		gravarArquivo.printf("" + "%n");

		int cont = 0;
		for (Cliente c : clientes) {

			if (cont < clientes.size()) {
				cont++;
			}

			gravarArquivo.printf("Nome do cliente nº" + (cont) + "%n");
			gravarArquivo.printf(c.getNome() + "%n");

			gravarArquivo.printf("Agencia do cliente nº" + (cont) + "%n");
			gravarArquivo.printf(c.getAgencia() + "%n");

			gravarArquivo.printf("Conta do cliente nº" + (cont) + "%n");
			gravarArquivo.printf(c.getConta() + "%n");

			gravarArquivo.printf("E-mail do cliente nº" + (cont) + "%n");
			gravarArquivo.printf(c.getEmail() + "%n");

			gravarArquivo.printf("Telefone do cliente nº" + (cont) + "%n");
			gravarArquivo.printf(c.getTelefone() + "%n");

			gravarArquivo.printf("Saldo do cliente nº" + (cont) + "%n");
			gravarArquivo.printf(c.getSaldo() + "%n");

			gravarArquivo.printf("---------------------------------" + "%n");
		}
		arquivo.close();
		System.out.println("O arquivo está gravado na unidade d:\\correntistas.txt");
	}

	public Cliente() {
		this.agencia = agencia;
		this.conta = conta;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.saldo = saldo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
