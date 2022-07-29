package br.com.livraria.servlet;

import br.com.livraria.bo.LivrosBOI;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deletar-livro-servlet")
public class DeletarLivroServlet extends HttpServlet {
    private LivrosBOI livrosBO;
    @Inject
    public DeletarLivroServlet(LivrosBOI livrosBO) {
        this.livrosBO = livrosBO;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeLivro = request.getParameter("nomeLivro");

        String respostaDeletado = livrosBO.deletarLivro(nomeLivro);

        request.setAttribute("respostaDeletado", respostaDeletado);

        RequestDispatcher dispatcher = request.getRequestDispatcher("livro-deletado.jsp");
        dispatcher.forward(request,response);
    }
}
