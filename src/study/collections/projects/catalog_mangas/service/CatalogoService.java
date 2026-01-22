package study.collections.projects.catalog_mangas.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import study.collections.projects.catalog_mangas.dominio.Manga;

public class CatalogoService {
	Set<Manga> catalogo = new HashSet<Manga>();
	
	public void adicionar(Manga manga) {
		catalogo.add(manga);
	}
	
	public List<Manga> listarPorId() {
		List<Manga> lista = new ArrayList<>(catalogo);
		Collections.sort(lista, Comparator.comparing(Manga::getId));
		return lista;
	}
	
	public void removerSemEstoque() {
		catalogo.removeIf(manga -> manga.getQuantidade() == 0);
	}
	
	public Manga[] converterParaArray() {
		return catalogo.toArray(new Manga[0]);	
	}
}
