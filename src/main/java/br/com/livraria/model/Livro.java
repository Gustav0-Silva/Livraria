package br.com.livraria.model;

import lombok.Data;

@Data
public class Livro {
    private String nomeLivro;
    private String nomeAutor;
    private long idLivro;

    public Livro(String nomeLivro, String nomeAutor) {
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
    }
}
