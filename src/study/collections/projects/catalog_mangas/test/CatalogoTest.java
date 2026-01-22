package study.collections.projects.catalog_mangas.test;

import study.collections.projects.catalog_mangas.dominio.Manga;
import study.collections.projects.catalog_mangas.service.CatalogoService;

public class CatalogoTest {
	public static void main(String[] args) {
		CatalogoService service = new CatalogoService();
		
		service.adicionar(new Manga(1L, "Berserk", 13.99, 0));
		service.adicionar(new Manga(2L, "Pokemon", 29.99, 5));
		service.adicionar(new Manga(1L, "Berserk", 13.99, 0)); // duplicado
		
		System.out.println("Antes:");
		service.listarPorId().forEach(System.out::println);

		service.removerSemEstoque();
		
		System.out.println("\nDepois:");
        service.listarPorId().forEach(System.out::println);
		
        
	}
}
