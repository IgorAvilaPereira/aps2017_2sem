/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iapereira
 */
public class ConexaoPostgreSQL {
    private String host;
    private String user;
    private String password;
    private String database;
    private String port;
    
    public ConexaoPostgreSQL(){
        this.database = "apsoi";
        this.host = "localhost";
        this.password = "postgres";
        this.port = "5432";
        this.user = "postgres";
    }
    
    public Connection getConnection(){
        String url = "jdbc:postgresql://"+this.host+":"+this.port+"/"+this.database;
        try {
            return DriverManager.getConnection(url, this.user, this.password);
        } catch (SQLException ex) {
            System.out.println("Deu xabum....!!");
            Logger.getLogger(ConexaoPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
        return null;
        
    }
    
}
