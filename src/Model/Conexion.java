package Model;


import com.sun.jdi.connect.spi.Connection;

import java.sql.*;
/**
 *
 * @author alejandrovelasco
 */
public class Conexion {
    
    private static java.sql.Connection conectar = null;
    
    public java.sql.Connection conectar() throws Exception{
        
        try{
            if(conectar==null){
                Class.forName("org.sqlite.JDBC");
                conectar = DriverManager.getConnection("jdbc:sqlite:escuelaClinica.db");
            }else{
                conectar.close();
                conectar= DriverManager.getConnection("jdbc:sqlite:escuelaClinica.db");
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
        
    }
    
}