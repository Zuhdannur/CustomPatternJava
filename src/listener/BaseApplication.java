/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ZuhdanNur
 */
public interface BaseApplication {
    void InitialConnection(String dbName);
    Connection getConnection();
}
