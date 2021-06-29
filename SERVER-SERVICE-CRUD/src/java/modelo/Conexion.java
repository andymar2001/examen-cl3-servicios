package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Andy
 */
public class Conexion {

    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/crudservice?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";
            String usr = "root";
            String psw = "mysql";
            con = DriverManager.getConnection(url, usr, psw);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
