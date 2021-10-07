package br.com.minhaempresa.controller;

import br.com.minhaempresa.domain.Cliente;
import br.com.minhaempresa.domain.ContaCorrente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// declaração do servlet extendendo a classe HttpServlet
@WebServlet(urlPatterns = "/ConsultarSaldo")
public class ConsultarSaldoController extends HttpServlet {

    // usando doGet pois precisamos vai ser "pegado" algo do servidor e não trazido algo para o servidor
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // criando um cliente para passar como parâmetro da conta que vai ser consultada
        Cliente clienteUm = new Cliente("pedro", "luiz");
        // criando uma conta corrente
        ContaCorrente contaCorrente = new ContaCorrente(clienteUm);

        // printando o saldo da conta usando o método consultarSaldo
        resp.getWriter().println(contaCorrente.consultarSaldo());
    }
}
