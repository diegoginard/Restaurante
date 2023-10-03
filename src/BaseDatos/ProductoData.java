/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProductoData {
    
    private Connection con = null;
    
    public ProductoData(){
      con = Conexion.getConexion();  
    }
     
    public void guardarProducto( Producto pro){
        String sql="INSERT INTO producto (nombre,precio,estado) VALUES(?,?,?)"; 
      
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(0, pro.getNombre());
            ps.setDouble(1, pro.getPrecio());
            ps.setBoolean(2, pro.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
           
            if (rs.next()) {

               pro.setIdProducto(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Producto Guardado ");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error  al acceder a la tabla producto " + ex.getMessage());
        }
    }
}
