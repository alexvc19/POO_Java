
import com.sun.jdi.connect.spi.Connection;

import java.sql.*;
/**
 *
 * @author alejandrovelasco
 */
public class Conexion {
    
    private static java.sql.Connection conectar = null;
    
    public java.sql.Connection conectar(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:escuelaClinica.db");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
        
    }
    
}