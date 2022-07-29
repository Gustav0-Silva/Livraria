package br.com.livraria.bo;

import br.com.livraria.model.Livro;

import java.util.List;

public interface LivrosBOI {
    Livro salvarLivro(Livro livro);
    List<Livro> listarLivros();

    String deletarLivro(String nomeLivro);
}
