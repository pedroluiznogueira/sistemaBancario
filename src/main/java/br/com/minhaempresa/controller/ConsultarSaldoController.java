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
}
