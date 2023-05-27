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
import javax.swing.JOptionPane;
import model.Aprendiz;
import modeldao.AprendizDao;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ControladorAprendiz", urlPatterns = {"/ControladorAprendiz"})
public class ControladorAprendiz extends HttpServlet { 
    
    String editar ="view/EditarA.jsp";
     String agregar ="view/AgregarA.jsp";
      String listar ="view/ListarA.jsp"; 
     
      Aprendiz p=new Aprendiz();
      AprendizDao dao = new AprendizDao();
      int id; 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorAprendiz</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorAprendiz at " + request.getContextPath() + "</h1>");
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
        
        if (action.equalsIgnoreCase("listar")){
        acceso="listar";
        }else if (action.equalsIgnoreCase("agregar")){
        acceso="agregar"; 
        }
        else if (action.equalsIgnoreCase("AgregarP")){
        
            int documento=Integer.parseInt(request.getParameter("txtdoc")); 
            String nombre=request.getParameter("txtnom"); 
            String apellido =request.getParameter("txtape");
             String correo =request.getParameter("txtcorreo"); 
              int  contacto = Integer.parseInt(request.getParameter("txtcon")); 
              p.setDocu(documento); 
              p.setNombrea(nombre); 
              p.setApellidoa(apellido); 
              p.setCorreoa(correo); 
              p.setNumcontacto(contacto);  
              dao.resgistrar(p); 
              acceso=listar; 
              JOptionPane.showMessageDialog(null, "usuario registrado");
              
        }else if(action.equalsIgnoreCase("eliminar")){
        
            id=Integer.parseInt(request.getParameter("id"));
            p.setId(id);
            dao.eliminar(id);
            acceso=listar;
            
            
        }else if(action.equalsIgnoreCase("editar")){
            
            request.setAttribute("id", request.getParameter("id"));
            acceso=editar;
            
            
            
            
        }else if(action.equalsIgnoreCase("EditarA")){
        
                id=Integer.parseInt(request.getParameter("txtid"));
                int documento=Integer.parseInt(request.getParameter("txtdoc")); 
                String nombre=request.getParameter("txtnom"); 
                String apellido =request.getParameter("txtape");
                String correo =request.getParameter("txtcorreo"); 
                int  contacto = Integer.parseInt(request.getParameter("txtcon")); 
                p.setId(id);
                p.setDocu(id);
                p.setNombrea(nombre);
                p.setApellidoa(apellido);
                p.setCorreoa(correo);
                p.setNumcontacto(contacto);
                dao.actualizar(p);
                
                acceso=listar;
        }
        
            
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
