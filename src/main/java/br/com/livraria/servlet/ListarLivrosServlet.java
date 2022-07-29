package br.com.livraria.servlet;

import br.com.livraria.bo.LivrosBOI;
import br.com.livraria.model.Livro;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listar-livros-servlet")
public class ListarLivrosServlet extends HttpServlet {
    private LivrosBOI livrosBO;
    @Inject
    public ListarLivrosServlet(LivrosBOI livrosBO) {
        this.livrosBO = livrosBO;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Livro> listaLivros = livrosBO.listarLivros();

        request.setAttribute("listaLivros", listaLivros);

        RequestDispatcher dispatcher = request.getRequestDispatcher("listar-livros.jsp");
        dispatcher.forward(request,response);
    }
}
