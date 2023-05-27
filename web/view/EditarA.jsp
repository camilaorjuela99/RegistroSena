<%-- 
    Document   : EditarA
    Created on : 8/05/2023, 8:43:04 p. m.
    Author     : APRENDIZ
--%>

<%@page import="model.Aprendiz"%>
<%@page import="modeldao.AprendizDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actualizacion del aprendiz</h1>
    
       <div class="container">    
            <div class col-lg-6">
                <%
                    AprendizDao ape = new AprendizDao();
                    int id = Integer.parseInt((String)request.getAttribute("id"));
                    Aprendiz ap= new Aprendiz();
                    ap = ape.list(id);
                %>
                <form action="ControladorAprendiz">
                    
                 <label for="id">id</label>
                
                 
                    <br>
                    
                <label for="NumDoc">Digite su numero de documento</label>
                <input type="text" id="Docu" name="txtdoc" value="<%=ap.getDocu()%>"> 
                
                <br>
                
                 <label for="nombres">Digite sus Nombres</label>
                <input type="text" id="Nombrea" name="txtnom" value="<%=ap.getNombrea()%>">
                
                 <br>
                 
                 <label for="Apellido">Digite sus Apellidos</label>
                <input type="text" id="Apellidoa" name="txtape" value="<%=ap.getApellidoa()%>">
                
                 <br>
                 
                <label for="correo">Digite su correo electronico</label>
                <input type="text" id="correoa" name="txtcorreo" value="<%=ap.getCorreoa()%>"> 
                <br>
                
                <label for="telefono">Digite su numero de telefono</label>
                <input type="number" id="Numcontacto" name="txtcon" value="<%=ap.getNumcontacto()%>"> 
                
                 <input type="number" id="id" name="txtid" value="<%=ap.getId()%>"> 
                
                <input class="btn-btn-primary" type="submit" name="accion" value="EditarA">

                

               </form>
            </div>
       </div>
      </body>
</html>
