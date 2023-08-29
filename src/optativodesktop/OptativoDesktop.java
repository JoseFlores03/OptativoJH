/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package optativodesktop;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lab217-10
 */
public class OptativoDesktop {
    private static String userDB = "postgres";
    private static String passDB = "Alumno2023";
    private static String portDB = "5432";
    private static String dataBase = "clase200823";
    private static String url = "jdbc:postgresql://localhost:5432/"+dataBase;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Connection conn = DriverManager.getConnection(url, userDB, passDB);
        } catch (SQLException ex) {
            Logger.getLogger(OptativoDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
