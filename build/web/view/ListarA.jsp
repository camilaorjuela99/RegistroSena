<%-- 
    Document   : ListarA
    Created on : 3/05/2023, 7:16:51 p. m.
    Author     : APRENDIZ
--%>


<%@page import="java.util.Iterator"%>
<%@page import="model.Aprendiz"%>
<%@page import="java.util.List"%>
<%@page import="modeldao.AprendizDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listar</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <div class="container">
            <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <h1>APRENDICES REGISTRADOS</h1>
        <table>
            <thead>
                <tr>
                    <th class="text-center">ID</th>
                    <th class="text-center">DOCUMENTO</th>
                    <th class="text-center">NOMBRE</th>
                    <th class="text-center">APELLIDO</th>
                    <th class="text-center">EMAIL</th>
                    <th class="text-center">CELULAR</th>
                </tr>
                
                
                
            </thead>
            <% 
                AprendizDao dao = new AprendizDao();
                List<Aprendiz>listar=dao.listadoA();
                Iterator<Aprendiz>it=listar.iterator();
                Aprendiz usu =null;
                while(it.hasNext()){
                    usu=it.next();
                
                
            %>
            <tbody>
                <tr>
                    <td class="text-center"><%=usu.getId()%></td>
                    <td class="text-center"><%=usu.getDocu()%></td>
                    <td class="text-center"><%=usu.getNombrea()%></td>
                    <td class="text-center"><%=usu.getApellidoa()%></td>
                    <td class="text-center"><%=usu.getCorreoa()%></td>
                    <td class="text-center"><%=usu.getNumcontacto()%></td>
                    
                    <td class="text-center">
                        <a class="btn btn-danger" href="../ControladorAprendiz?accion=editar&id=<%=usu.getId()%>">EDITAR</a>
                        <a class="btn btn-warning" href="../ControladorAprendiz?accion=eliminar&id=<%=usu.getId()%>">ELIMINAR</a>
                    </td>
                </tr>
                <% } %>
                    </tbody>
        </table>
        </div>
    </body>
</html>
