/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitelur;

import listener.BaseActivity;
import sqlitelur.connection.MainConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ZuhdanNur
 */
public class Sqlitelur implements BaseActivity {
    MainPresenter presenter;
    MainConnection connection;
    public static void main(String[] args) {
        Sqlitelur myApp  = new Sqlitelur();
        myApp.start();
    }

    @Override
    public void base() {
        String sql = "SELECT ID FROM t_test";
         try {
             Connection connect = connection.getConnection();
             Statement stmt =  connect.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
             
             while (rs.next()) {
                 System.out.println(rs.getInt("ID"));
            }
             
         } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void start() {
        connection = new MainConnection();
        presenter = new MainPresenter(this);
        
        
        connection.init();
        presenter.start();
    }
    
}
