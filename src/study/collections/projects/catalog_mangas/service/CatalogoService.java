package study.collections.projects.catalog_mangas.service;

import java.util.List;

import study.collections.projects.catalog_mangas.dominio.Catalogo;
import study.collections.projects.catalog_mangas.dominio.Manga;

public class CatalogoService {
	
	public void limparSemEstoque(Catalogo catalogo) {
		catalogo.removerSemEstoque();
	}
	
	public List<Manga> listarOrdenadoPorId(Catalogo catalogo){
		return catalogo.listarPorId();
	}
	public void adicionarNovoManga(Catalogo catalogo, Manga manga) {
		if(manga.getNome() == null || manga.getNome().isBlank()){
			throw new IllegalArgumentException("O nome do mangá não pode estar vazio!");
		}
		if(manga.getPreco() < 0) {
			throw new IllegalArgumentException("O preço não pode ser negativo!");
		}
		catalogo.adicionar(manga);
	}
} 
