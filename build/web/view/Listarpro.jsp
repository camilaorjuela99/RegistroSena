<%-- 
    Document   : Listarpro
    Created on : 3/05/2023, 8:40:40 p. m.
    Author     : APRENDIZ
--%>

<%@page import="java.util.Iterator"%>
<%@page import="model.Programa"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="modeldao.ProgramaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listar</h1>
       
   
    <div class="container">
        <h1>PROGRAMAR REGISTRADOS EN EL SISTEMA</h1>
        <table>
            <thead>
            <tr>
                <th class="text-center">codprograma</th>
                <th class="text-center">nomprograma</th>
                   
            </tr>
            </thead>
            <%
            ProgramaDao dao =new    ProgramaDao();
            List <Programa>listar=dao.listadopro();
            Iterator<Programa>it=listar.iterator();  
            Programa usu = null;
            while (it.hasNext()){
                usu=it.next();
               
           
           
            %>
            <tbody>
                <tr>
            <td class="text-center"><%=usu.getCodprograma()%></td>
            <td class="text-center"><%=usu.getNomprograma()%></td>
           
           
            <td class ="text-center" >
                <a class="btn btn-warning" href="../ControladorPrograma?accion=editar&id=<%=usu.getCodprograma()%>">EDITAR</a>  
                <a class="btn btn-danger" href="../ControladorPrograma?accion=eliminar&id=<%=usu.getCodprograma()%>">ELIMINAR</a>
           
               
               
            </td>
            </tr>
            <% } %>
            </tbody>  
        </table>
    </div>
   </body>
</html>

