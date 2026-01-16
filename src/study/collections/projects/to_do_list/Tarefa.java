package study.collections.projects.to_do_list;

public class Tarefa {
	private String descricao;
	boolean concluida;

	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.concluida = false;
	}

	@Override
	public String toString() {
		return (concluida ? "[✔]" : "[ ]") + descricao;
	}

	public void concluir() {
		this.concluida = true;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

}
