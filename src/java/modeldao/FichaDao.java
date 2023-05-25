/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import Interfaz.MeFicha;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import model.Ficha;

/**
 *
 * @author APRENDIZ
 */
public class FichaDao implements MeFicha
{
    Ficha fi = new Ficha();
    Conexion cn= new Conexion(); 
    Connection con;
    PreparedStatement ps; 
    ResultSet rs; 
    
    
    @Override
    public Ficha list(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listaFichas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean registroficha(Ficha fi) {
        String sql= "insert into ficha(codficha,cantiaprendices,codprograma,doapre)values('"+fi.getCodFicha()+"','"+fi.getCantiaprendices()+"','"+fi.getCodprograma()+"','"+fi.getCodaprendiz()+"')";
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Ficha registrada");
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ficha no Registrado");
        }
        return false;
       
        
    }

    @Override
    public boolean actualizarficha(Ficha fi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarficha(int cod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
