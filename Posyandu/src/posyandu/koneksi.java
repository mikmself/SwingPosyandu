/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posyandu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Asus
 */
public class koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/posyandu";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    public static void main(String args[]){
        getKoneksi();
    }
    Connection con;
    Statement st;

    public void crud() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
