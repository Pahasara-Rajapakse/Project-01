/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pasin
 */
public class DatabaseConnection {
    

    private Connection conn;

    public DatabaseConnection() {
        connect();
    }

    public final void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/eco_me", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Datanase is not connected");
        }
    }

    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
            }
        }
    }

    
public PreparedStatement prepareStatement(String query) {
    try {
        return conn.prepareStatement(query);
    } catch (SQLException ex) {
        ex.printStackTrace(); 
        return null;
    }
}

public ResultSet executeQuery(PreparedStatement pst) {
    try {
        return pst.executeQuery();
    } catch (SQLException ex) {
        ex.printStackTrace(); 
        return null;
    }
}

}
