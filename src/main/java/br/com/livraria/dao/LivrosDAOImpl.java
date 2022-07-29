package br.com.livraria.dao;

import br.com.livraria.model.Livro;
import java.util.ArrayList;
import java.util.List;


public class LivrosDAOImpl implements LivrosDAOI {

    private static List<Livro> listaLivros = new ArrayList<>();
    private static long idLivro;

    @Override
    public Livro salvarLivro(Livro livro) {
        idLivro++;
        livro.setIdLivro(idLivro);
        listaLivros.add(livro);
        return livro;

    }

    @Override
    public List<Livro> listarLivros() {
        return listaLivros;
    }

    @Override
    public String deletarLivro(String nomeLivro) {
        for (Livro livro: listaLivros) {
            if (livro.getNomeLivro().equals(nomeLivro)){
                listaLivros.remove(livro);
                return "O livro foi removido do sistema";
            }
        }
        return "Livro não encontrado no sistema, não foi removido";
    }
}
