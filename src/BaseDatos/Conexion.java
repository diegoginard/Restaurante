
package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="restobar";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
    private static  Connection connection;
    
    private Conexion(){
    
    }
    
    public static Connection getConexion(){
        
        if(connection == null){
            
            try {
                
                Class.forName("org:mariadb.jdbc.Driver");
                
                connection = DriverManager.getConnection(URL + DB , USUARIO , PASSWORD);
                
                JOptionPane.showMessageDialog(null, "Conectado");
                
                
                
            }catch(ClassNotFoundException e){
                
                JOptionPane.showMessageDialog(null, "Error al Cargar Driver de Conexion "+e.getMessage());
            
            }catch(SQLException ex){
                
                JOptionPane.showMessageDialog(null, "Error A Acceder  a la Base de Datos"+ex.getMessage());
                 
            }  
        }
        
        return connection;
        
    }
    
}
