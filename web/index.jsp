<%-- 
    Document   : index
    Created on : 26/04/2023, 6:41:48 p. m.
    Author     : APRENDIZ
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>aprendiz</title>
    </head>
    <body>
        <h1>Ingrese aprendiz</h1>
    
       <div class="container">    
            <div class col-lg-6">
                <form action="ControladorAprendiz">
                 <label for="id">id</label>
                 <input type="number" id="id" name="txtid"> 
                    <br>
                <label for="NumDoc">Digite su numero de documento</label>
                <input type="text" id="Docu" name="txtdoc">

                <br>
                 <label for="nombres">Digite sus Nombres</label>
                <input type="text" id="Nombrea" name="txtnom">
                
                

                 <br>

                 
                 <label for="Apellido">Digite sus Apellidos</label>
                <input type="text" id="Apellidoa" name="txtape">

                

                 <br>

                <label for="correo">Digite su correo electronico</label>
                <input type="text" id="correoa" name="txtcorreo">

                 <br>

                <label for="telefono">Digite su numero de telefono</label>
                <input type="number" id="Numcontacto" name="txtcon">
                
                <input class="btn-btn-primary" type="submit" name="accion" value="AgregarP">

                

               </form>
            </div>
       </div>
      </body> 
</html>
