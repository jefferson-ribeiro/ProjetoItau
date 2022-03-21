import java.io.IOException;
import java.util.Scanner;

public class ControleCorrentistas {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);

		int opcao = 0;

		Cliente cliente = new Cliente();

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
				cliente.GravaArq();
				System.out.println("Gravar em arquivo");
				break;
			}
			case 4: {
				cliente.ConsultaArq();
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
