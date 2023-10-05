
package restaurante.BaseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante.Entidades.Mesa;


public class MesaData {
    
    private Connection con = null;
    
    public MesaData (){
        con = Conexion.getConexion();
    }
    
    List<Mesa> mesa=new ArrayList<>();
    Mesa mesas = new Mesa();
    //public class Mesa {
//    private int idMesa;
//    private Reserva reserva;
//    private Pedido pedido;
//    private int capacidad;
//    private boolean estado;

    
    public void guardarMesa(Mesa mesaP){
        String sql=" INSER INTO mesa(numero ,capacidad ,estado)VALUES (?,?,?)";
        
        try {
            PreparedStatement ps =con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1,mesaP.getNumero());
            ps.setInt(2, mesaP.getCapacidad());
            ps.setBoolean(3, mesaP.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                mesaP.setIdMesa(rs.getInt(1));
                JOptionPane.showMessageDialog(null, " Producto Guardado ");
                
            }
            
       
            ps.close();
            
            
            
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al Actualizar Tabla de Mesas "+ex.getMessage());

        }
       
        
        
    }

    
    

    

    
    
    
    
}
