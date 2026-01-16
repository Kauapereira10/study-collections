package study.collections.projects.to_do_list;

import java.util.Scanner;

public class TarefaTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TarefaService service = new TarefaService();

		int opcao;

		do {
			System.out.println("\n=== TO-DO LIST ===");
			System.out.println("1 - Adicionar tarefa");
			System.out.println("2 - Remover tarefa");
			System.out.println("3 - Listar tarefa");
			System.out.println("4 - Concluir tarefa");
			System.out.println("0 - Sair");
			System.out.println("Escolha: ");

			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Descrição: ");
				service.adicionar(sc.nextLine());
				break;

			case 2:
				service.listar();
				System.out.println("Indice da Tarefa:");
				service.remover(sc.nextInt());
				sc.nextLine();
				break;

			case 3:
				System.out.println("Lista de Tarefas:");
				service.listar();
				break;

			case 4:
				service.listar();
				System.out.println("Indice de Tarefa:");
				service.concluir(sc.nextInt());
				sc.nextLine();
				break;

			case 0:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida.");
			}

		} while (opcao != 0);

		sc.close();
	}
}
