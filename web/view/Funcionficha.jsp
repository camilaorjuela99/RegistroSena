<%-- 
    Document   : FLibros
    Created on : 15/05/2023, 6:34:06 p. m.
    Author     : APRENDIZ
--%>



<%@page import="model.Aprendiz"%>
<%@page import="modeldao.AprendizDao"%>
<%@page import="java.util.List"%>
<%@page import="model.Programa"%>
<%@page import="modeldao.ProgramaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link href="../css/estilopag.css" rel="stylesheet" type="text/css"/>
        <title>Registro Ficha</title>
    </head>
    <body>
     
        <h1 align="center">Ingrese Ficha</h1>
        <div class="container">    
            <div class col-lg-6">
                <form action="ControladorFicha">
                    
                 <label for="coficha">codigo ficha</label>
                 <input type="number" id="coficha" name="txtcoficha"> 
                 
                  <br>
                  
                <label for="cantidadaprendices">cantidad de los aprendices</label>
                <input type="text" id="cantidadaprendices" name="txtnumaprendiz">

                
                <div class="form-group">
                    <label>Nombre Programa:</label>
                    <select name="listaPrograma" class="custom-select">
                        <option value="0"></option>
                        <%ProgramaDao pro= new ProgramaDao();
                          List<Programa> lista = pro.listadopro(); 
                          
                        %>
                        <%for(Programa li:lista){%>
                        <option value="<%=li.getCodprograma()%>"><%=li.getNomprograma()%></option>
                        <%}%>                        
                        
                    </select>
                </div>

                <div class="form-group">
                    <label >Lista Aprendices</label>
                    <select name="listAprendiz" class="custom-select">
                        <option value="0"></option>
                        <%AprendizDao adao= new AprendizDao();
                          List<Aprendiz> list = adao.listadoA(); 
                          
                        %>
                        <%for(Aprendiz li:list){%>
                        <option value="<%=li.getNombrea()%>"><%=li.getDocu()%></option>
                        <%}%>                        
                        
                        
                    </select>
                </div>


                
                <input class="btn-btn-primary" type="submit" name="accion" value="AgregarFicha">

                

               </form>
            </div>
       </div>
    </body>
</html>
