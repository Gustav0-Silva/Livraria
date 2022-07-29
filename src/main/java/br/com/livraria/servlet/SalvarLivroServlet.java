package br.com.livraria.servlet;

import br.com.livraria.bo.LivrosBOI;
import br.com.livraria.model.Livro;

import java.util.List;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/livro-save-servlet")
public class SalvarLivroServlet extends HttpServlet {

    private LivrosBOI livrosBO;
    @Inject
    public SalvarLivroServlet(LivrosBOI livrosBO) {
        this.livrosBO = livrosBO;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeLivro = request.getParameter("nomeLivro");
        String nomeAutor = request.getParameter("nomeAutor");

        Livro livro = new Livro(nomeLivro,nomeAutor);
        Livro livroSalvo = livrosBO.salvarLivro(livro);

        request.setAttribute("nomeLivroSalvo", livroSalvo.getNomeLivro());
        request.setAttribute("idLivroSalvo", livroSalvo.getIdLivro());
        request.setAttribute("autorLivroSalvo", livroSalvo.getNomeAutor());

        RequestDispatcher dispatcher = request.getRequestDispatcher("livro-adicionado.jsp");
        dispatcher.forward(request,response);

    }
}
