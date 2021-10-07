package br.com.minhaempresa.controller;

import br.com.minhaempresa.domain.Cliente;
import br.com.minhaempresa.domain.Conta;
import br.com.minhaempresa.domain.ContaCorrente;

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
        // preciso de uma instância de cliente para passar como parâmetro para conta
        Cliente cliente = new Cliente();

        // preciso de uma instância de conta, fazendo do tipo mais generalista
        Conta contacorrente = new ContaCorrente();

        resp.getWriter().println("servlet funcionando");
    }
}
