package clases;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author Misael Villar Julian
 */
public class Conexion {
    //Conexion Local
    public static Connection conectar() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_yumbrel","root", "");
            return cn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en conexion local:\nAsegurase de tener iniciado el servidor: " + e);
        }
        return (null);
 
    }
}
