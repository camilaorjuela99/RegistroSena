/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import Interfaz.MePrograma;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Programa;

/**
 *
 * @author APRENDIZ
 */
public class ProgramaDao  implements  MePrograma{  
    
        Conexion cn = new Conexion();
        Programa po = new Programa();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;

    @Override
    public Programa list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listadopro() {
         ArrayList<Programa> lista = new ArrayList<Programa>();
        String sql ="select * from programa ";  
          try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);  
            rs=ps.executeQuery();
            while(rs.next())
            {
            Programa usu =new Programa();
            usu.setCodprograma(rs.getInt("codpro"));
            usu.setNomprograma(rs.getString("nompro"));
           
            lista.add(usu);
           
            }
               
               
        }catch(Exception e)
        {
        }
        return lista;

    }

    @Override
    public boolean registrarpro(Programa pro) {
        String sql= "insert into programa(codpro,nompro)values('"+pro.getCodprograma()+"','"+pro.getNomprograma()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Programa Registrado");
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null, "Programa no Registrado");
            
        }
            return false;
    }

    @Override
    public boolean actualizarpro(Programa pro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public boolean eliminarpro(int id) {
        String sql="delete from programa where codpro="+id;
        try{
            con=cn.getConnection(); 
            ps=con.prepareStatement(sql); 
            ps.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "programa Eliminado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "programa no Eliminado");
        }
        return false;
    }
    
    
   
}
