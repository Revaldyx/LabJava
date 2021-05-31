/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginproject;

import com.mysql.jdbc.Driver;
import java.sql.*;
 
public class Koneksi {
 
    private static Connection koneksi;
 
    public static Connection getConnection() throws SQLException {
        if (koneksi == null) {
            // panggil Driver MySQL
            new Driver();
            // buat koneksi
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/pendaftaran_siswa", "root", "");
        }
        return koneksi;
    }
}
