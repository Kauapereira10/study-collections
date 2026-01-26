package study.collections.projects.catalog_mangas.test;

import java.util.List;

import study.collections.projects.catalog_mangas.dominio.Catalogo;
import study.collections.projects.catalog_mangas.dominio.Manga;
import study.collections.projects.catalog_mangas.service.CatalogoService;

public class CatalogoTest {
	public static void main(String[] args) {
		CatalogoService service = new CatalogoService();
		Catalogo catalogo = new Catalogo();
		
		List<Manga> mangas = List.of(
			    new Manga(1L, "Berserk", 13.99, 0),
			    new Manga(2L, "Pokemon", 29.99, 5),
			    new Manga(1L, "Berserk", 13.99, 0)
			);
		
		mangas.forEach(m -> service.adicionarNovoManga(catalogo, m));;

		
		System.out.println("Antes:");
		service.listarOrdenadoPorId(catalogo).forEach(System.out::println);

		service.limparSemEstoque(catalogo);
		
		System.out.println("\nDepois:");
        service.listarOrdenadoPorId(catalogo).forEach(System.out::println);
		
        
	}
}
