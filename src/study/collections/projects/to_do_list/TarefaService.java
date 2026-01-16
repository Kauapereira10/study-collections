package study.collections.projects.to_do_list;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {
	private List<Tarefa> tarefas = new ArrayList<>();

	public void adicionar(String descricao) {
		tarefas.add(new Tarefa(descricao));
	}

	public void listar() {
		if (tarefas.isEmpty()) {
			System.out.println("Você não tem mais nenhuma tarefa!");
			return;
		} else {
			for (int i = 0; i < tarefas.size(); i++) {
				System.out.println(i + " - " + tarefas.get(i));
			}
		}

	}

	public void concluir(int indice) {
		if (indice >= 0 && indice < tarefas.size()) {
			tarefas.get(indice).concluir();
		} else {
			System.out.println("Índice inválido.");
		}
	}

	public void remover(int indice) {
		if (indice >= 0 && indice < tarefas.size()) {
			tarefas.remove(indice);
		} else {
			System.out.println("Índice inválido.");
		}
	}

}
