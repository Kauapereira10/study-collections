package study.collections.util.test;

import java.util.List;

import study.collections.util.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MangaByNomeComparator implements Comparator<Manga> {
	@Override
	public int compare(Manga m1, Manga m2) {
		return m1.getNome().compareTo(m2.getNome());
	}
	
}

class MangaByPrecoDescendenteComparator implements Comparator<Manga> {
	@Override
	public int compare(Manga m1, Manga m2) {
		return Double.compare(m2.getPreco(), m1.getPreco());
	}
}

class MangaPrecoENomeComparator implements Comparator<Manga> {
	@Override
	public int compare(Manga m1, Manga m2) {
		int comparePrecoManga = Double.compare(m2.getPreco(), m1.getPreco());
	
		if(comparePrecoManga != 0) {
			return comparePrecoManga;
		}
		
		return m1.getNome().compareTo(m2.getNome());
	}
}

public class SortMangaTest01 {
	public static void main(String[] args) {
	
		List<Manga> mangas = new ArrayList<>();
		
	    mangas.add(new Manga(1L, "Berserk", 50.0));
	    mangas.add(new Manga(2L, "Akira", 50.0)); // Mesmo preço que Berserk
	    mangas.add(new Manga(3L, "Naruto", 30.0));
	    
	    System.out.println("--- Ordenando por Preço e Nome (Desempate) ---");
	    Collections.sort(mangas, new MangaPrecoENomeComparator());
	    
	    for (Manga manga : mangas) {
			System.out.println(manga);
		}
	    
	    System.out.println("--- Ordenando por Nome ---");
	    Collections.sort(mangas, new MangaByNomeComparator());
	    for (Manga manga : mangas) {
			System.out.println(manga);
		}
	    
	    System.out.println("--- Ordenando por ID ---");
	    Collections.sort(mangas);
	    for (Manga manga : mangas) {
			System.out.println(manga);
		}
	    
	}
}	
