
package restaurante.BaseDatos;

import restaurante.Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProductoData {
   
    private Connection con = null;
      
    public ProductoData(){
        
        con = Conexion.getConexion();
        
    }
     
    public void guardarProducto( Producto pro){
        
        String sql="INSERT INTO producto(nombre, precio, estado) VALUES (?,?,?)"; 
      
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, pro.getNombre());
            ps.setDouble(2, pro.getPrecio());
            ps.setBoolean(3, pro.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
           
            if (rs.next()) {

               pro.setIdProducto(rs.getInt(1));
                
               JOptionPane.showMessageDialog(null, "Producto Guardado ");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto " + ex.getMessage());
            
        }
    }
    
    public void eliminarProducto(int id) {

        String sql = "DELETE FROM producto WHERE idProducto = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            
            if(exito >= 1){
                
            JOptionPane.showMessageDialog(null, "Producto Eliminado");
            
            }else{
                
                JOptionPane.showMessageDialog(null, "No se encontro el producto");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, " Error al Eliminar la tabla" + ex.getMessage());

        }
    }
    
    public void ModificarProducto(int id){
    
        String sql = "UPDATE producto WHERE idProducto = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int exito = ps.executeUpdate();
            
            if(exito >=1){
                
               JOptionPane.showMessageDialog(null, "Producto modificado con exito"); 
               
            }else{
                
                JOptionPane.showMessageDialog(null, "No existe ese producto");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, " Error al Eliminar la tabla" + ex.getMessage());

        }
    }
    
    public List<Producto> listarAlumnos(String buscar) {

        List<Producto> productos = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM Producto WHERE idProducto "
                    + "LIKE '%\"+buscar+\"%' OR nombre LIKE '%\"+buscar+\"%' ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombre"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setEstado(rs.getBoolean("estado"));
                productos.add(prod);
            
            }
            
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());

        }

        return productos;

    }
}
