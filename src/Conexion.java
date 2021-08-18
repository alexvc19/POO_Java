
import com.sun.jdi.connect.spi.Connection;

import java.sql.*;
/**
 *
 * @author alejandrovelasco
 */
public class Conexion {
    
    Connection conectar = null;
    
    public Connection conectar(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            conectar = (Connection) DriverManager.getConnection("jdbc:sqlite:escuelaClinica.db");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
        
    }
    
}