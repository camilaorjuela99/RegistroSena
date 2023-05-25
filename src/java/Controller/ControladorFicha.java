/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ficha;
import modeldao.FichaDao;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ControladorFicha", urlPatterns = {"/ControladorFicha"})
public class ControladorFicha extends HttpServlet {
    
    String fichaagregar = "view/Fficha.jsp";
    String fichalistar = "view/ListarFi.jsp";
    
    Ficha fi = new Ficha();
    FichaDao fidao = new FichaDao();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorFicha</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorFicha at " + request.getContextPath() + "</h1>");
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
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("fichalistar"))
        {
            acceso=fichalistar;
        }else if(action.equalsIgnoreCase("afichaagregar"))
        {
         acceso = fichaagregar;
        }else if(action.equalsIgnoreCase("AgreFicha"))
        {
            int codfi = Integer.parseInt(request.getParameter("txtcoficha"));
            int numeapre = Integer.parseInt(request.getParameter("txtnumaprendiz"));
            int listaprog = Integer.parseInt(request.getParameter("listaPrograma"));
            int listaapren = Integer.parseInt(request.getParameter("listAprendiz"));

            fi.setCodFicha(codfi);
            fi.setCantiaprendices(numeapre);
            fi.setCodaprendiz(listaprog);
            fi.setCodprograma(listaapren);
            
            fidao.registroficha(fi);
              acceso=fichalistar; 
        
       }//else if(action.equalsIgnoreCase("eliminar")){
        
          //  int id=Integer.parseInt(request.getParameter("id"));
           // p.setCodprograma(id);
           // pdao.eliminarpro(id);
            //acceso=listarpro;
            
        //}
        
            
            RequestDispatcher view=request.getRequestDispatcher(acceso);
            view.forward(request, response);
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

}
