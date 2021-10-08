package br.com.minhaempresa.controller;

import br.com.minhaempresa.services.DepositoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/depositar")
public class DepositoController extends HttpServlet {

    // vou usar doPost aqui pois estou criando algo na aplicação com a requisição, que é o depósito
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        String valor = req.getParameter("valor");

        DepositoService depositarService = new DepositoService();
        depositarService.depositar(nome, sobrenome, Double.valueOf(valor));
        resp.getWriter().println("Depósito realizado com sucesso!");
    }
}
