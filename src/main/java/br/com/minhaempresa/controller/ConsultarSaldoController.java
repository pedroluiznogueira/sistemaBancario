package br.com.minhaempresa.controller;

import br.com.minhaempresa.domain.Cliente;
import br.com.minhaempresa.domain.Conta;
import br.com.minhaempresa.domain.ContaCorrente;
import br.com.minhaempresa.services.ConsultarSaldoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// declaração do servlet extendendo a classe HttpServlet
@WebServlet(urlPatterns = "/consultar-saldo")
public class ConsultarSaldoController extends HttpServlet {

    // usando doGet pois precisamos vai ser "pegado" algo do servidor e não trazido algo para o servidor
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // req é o parâmetro vindo da requisição quando o doGet for requisitado
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");

        // consultando um saldo apartir da camada de serviço
        ConsultarSaldoService consultarSaldoService = new ConsultarSaldoService();
        double saldo = consultarSaldoService.consultarSaldo(nome, sobrenome);

        // rep será a resposta que meu servlet vai dar
        resp.getWriter().println(saldo);
    }
}
