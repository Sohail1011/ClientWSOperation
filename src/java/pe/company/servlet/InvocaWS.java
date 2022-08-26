package pe.company.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "InvocaWS", urlPatterns = {"/InvocaWS"})
public class InvocaWS extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Double num1 = Double.parseDouble(request.getParameter("a"));
        Double num2 = Double.parseDouble(request.getParameter("b"));

        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultados</title>");
            out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\" crossorigin=\"anonymous\">");
            out.println("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa\" crossorigin=\"anonymous\"></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado de la suma: " + suma(num1, num2) + "</h1>");
            out.println("<h1>Resultado de la resta: " + resta(num1, num2) + "</h1>");
            out.println("<h1>Resultado de la multiplicación: " + multiplicar(num1, num2) + "</h1>");
            out.println("<h1>Resultado de la división: " + dividir(num1, num2) + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static double suma(double a, double b) {
        pe.company.ws.Calculos_Service service = new pe.company.ws.Calculos_Service();
        pe.company.ws.Calculos port = service.getCalculosPort();
        return port.suma(a, b);
    }

    private static double resta(double a, double b) {
        pe.company.ws.Calculos_Service service = new pe.company.ws.Calculos_Service();
        pe.company.ws.Calculos port = service.getCalculosPort();
        return port.resta(a, b);
    }

    private static double dividir(double a, double b) {
        pe.company.ws.Calculos_Service service = new pe.company.ws.Calculos_Service();
        pe.company.ws.Calculos port = service.getCalculosPort();
        return port.dividir(a, b);
    }

    private static double multiplicar(double a, double b) {
        pe.company.ws.Calculos_Service service = new pe.company.ws.Calculos_Service();
        pe.company.ws.Calculos port = service.getCalculosPort();
        return port.multiplicar(a, b);
    }
}
