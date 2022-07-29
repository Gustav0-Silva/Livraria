package br.com.livraria.bo;

import br.com.livraria.dao.LivrosDAOI;
import br.com.livraria.model.Livro;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;

public class LivrosBOImpl implements LivrosBOI {

    private LivrosDAOI livrosDAO;

    @Inject
    public LivrosBOImpl(LivrosDAOI LivrosDAO) {
        this.livrosDAO = LivrosDAO;
    }

    @Override
    public Livro salvarLivro(Livro livro) {
        if (livro.getNomeLivro().isEmpty()){
            throw new IllegalArgumentException("O campo nome não foi preenchido");
        }
        else{
            return livrosDAO.salvarLivro(livro);
        }
    }

    @Override
    public List<Livro> listarLivros() {
        return livrosDAO.listarLivros();
    }

    @Override
    public String deletarLivro(String nomeLivro) {
        if (nomeLivro.isEmpty()){
            throw new IllegalArgumentException("Não foi informado nenhum nome");
        }else {
            return livrosDAO.deletarLivro(nomeLivro);
        }
    }
}
