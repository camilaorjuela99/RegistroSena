/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import java.util.List;
import model.Programa;

public interface MePrograma {
    public Programa list(int id); 
    public List listadopro(); 
    public boolean registrarpro(Programa pro); 
    public boolean actualizarpro(Programa pro); 
    public boolean eliminarpro(int id);
}
