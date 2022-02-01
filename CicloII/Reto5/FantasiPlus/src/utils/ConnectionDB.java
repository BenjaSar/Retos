
package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @authors: FS -- Nelson Salamanca
 * This script is based on the work of Prof. Carlos Sierra -- MinTic --UNAL
 */
public class ConnectionDB {
    
    public static Connection getConnection() {
        JSONParser parser = new JSONParser();
        java.sql.Connection conn = null;
        // conectar
        try {
            String credentials_path = System.getProperty("user.dir") + "/src/utils/db_credentials.json";
            JSONObject jsonObject = (JSONObject)parser.parse(new FileReader(credentials_path));
            
            String host     = (String)jsonObject.get("db_ip");
            String port     = (String)jsonObject.get("dp_port");
            String username = (String)jsonObject.get("db_user");
            String password = (String)jsonObject.get("db_pssword");
            String schema_name = "FantasiPlus";
            String dbURL = "jdbc:mysql://"+host+":"+port+"/" + schema_name ;
            
            conn = DriverManager.getConnection(dbURL, username, password);
            if( conn != null ) 
             System.out.println ( "Conectado" );
        } 
        catch( SQLException | FileNotFoundException ex ) {
            ex.printStackTrace();
        } 
        catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
        
        return conn;
    }
    
    public static void main(String[] args){
        getConnection();
    }
}
