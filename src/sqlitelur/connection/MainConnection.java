/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitelur.connection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import listener.BaseApplication;

/**
 *
 * @author ZuhdanNur
 */
public class MainConnection implements BaseApplication {
    Connection conn;
     public void init() {
        InitialConnection("base.db");
     }
     
     private static String getBaseURL() {
        File currDir = new File("db");
        String path = currDir.getAbsolutePath();
        System.out.println(path);
        return path;
     }

    @Override
    public void InitialConnection(String dbName) {
         try {         
            String url = "jdbc:sqlite:src/database/"+dbName;
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
         }catch(SQLException e){
              System.out.println(e.getMessage());
         } finally {
           
         }
    }

    @Override
    public Connection getConnection() {
        return conn;
    }

    
}
