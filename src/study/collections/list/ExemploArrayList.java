package study.collections.list;

import java.util.ArrayList;
import java.util.List;


public class ExemploArrayList {
	public static void main(String[] args) {
		List<String> frutas = new ArrayList<String>();
		
		frutas.add("Maçã");
		frutas.add("Banana");
		frutas.add("Laranja");
	
		System.out.println("Lista de frutas: " + frutas);
		
		String primeiraFruta = frutas.get(0);
		System.out.println("Primeira fruta: " + primeiraFruta);
		
		frutas.add(1, "Uva");
		System.out.println("Lista após adicionar Uva: " + frutas);
		
		frutas.remove("Banana");
		System.out.println("Lista apos remover Banana: " + frutas);
		
		System.out.println("Tamanho da lista: " + frutas.size());
		
		System.out.println("Iterando sobre a lista: ");
		for (String fruta : frutas) {
			System.out.println(" - " + fruta);
		}
		
		boolean contemLaranja  = frutas.contains("Laranja");
		System.out.println("Contem Laranja? " + contemLaranja);
		
		frutas.clear();
		System.out.println("Lista após limpar: " + frutas);
		
		System.out.println("A lista esta vazia? " + frutas.isEmpty());
		
		
		
	}
}
