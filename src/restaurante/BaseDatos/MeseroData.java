
package restaurante.BaseDatos;

import java.sql.*;
import javax.swing.*;
import restaurante.Entidades.Mesero;

public class MeseroData {
    
    private Connection con = null;

     public MeseroData(){
        
        con = Conexion.getConexion();
        
    }
    
    public void AltaMesero(Mesero me){
    
        String sql="INSERT INTO meseros(nombre, apellido, estado) VALUES (?,?,?)"; 
      
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, me.getNombre());
            ps.setString(2, me.getApellido());
            ps.setBoolean(3, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
           
            if (rs.next()) {

               me.setIdMesero(rs.getInt(1));
                
               JOptionPane.showMessageDialog(null, "Mesero dado de alta ");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Meseros " + ex.getMessage());
            
        }
    
    }
     
}
