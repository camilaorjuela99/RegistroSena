/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import java.util.List;
import model.Aprendiz;

/**
 *
 * @author APRENDIZ
 */
public interface MeAprendiz {
    public Aprendiz list(int id); 
    public List listadoA(); 
    public boolean resgistrar(Aprendiz ap);
    public boolean actualizar(Aprendiz ap);
    public boolean eliminar(int id);

    
}
