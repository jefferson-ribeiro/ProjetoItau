import java.util.Scanner;

public class ControleCorrentistas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int agencia = 0;
		int conta = 0;
		String nome = null;
		String email = null;
		long telefone = 0;
		double saldo = 0;

		int opcao = 0;

		Cliente cliente = new Cliente(agencia, conta, nome, email, telefone, saldo);

		do {
			System.out.println("=====CONTROLE DE CORRENTISTAS=====");
			System.out.println();
			System.out.println("1 - Cadastrar Clientes");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Gravar em arquivo texto");
			System.out.println("4 - Consultar arquivo texto");
			System.out.println("5 - Sair");
			System.out.println();
			System.out.println("Digite a opção desejada: ");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("Cadastrar Clientes:");
				cliente.Cadastro();
				break;
			}
			case 2: {
				System.out.println("Listar Clientes:");
				cliente.Consulta();
				break;
			}
			case 3: {
				System.out.println("Gravar em arquivo");
				break;
			}
			case 4: {
				System.out.println("Consulta arquivo de texto");
				break;
			}
			case 5: {
				System.out.println("Obrigado por utilizar o sistema. Até mais!!");
				return;
			}
			default:
				System.out.println("ERRO!!! - Digite a opção correta do menu. ");
			}

		} while (opcao >= 1 || opcao <= 4);

	}
}
