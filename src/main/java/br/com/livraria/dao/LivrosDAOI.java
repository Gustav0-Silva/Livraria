package br.com.livraria.dao;

import br.com.livraria.model.Livro;
import java.util.List;

public interface LivrosDAOI {

    Livro salvarLivro(Livro livro);
    List<Livro> listarLivros();

    String deletarLivro(String nomeLivro);
}
