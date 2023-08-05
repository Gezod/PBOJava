import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {

    public static Connection OpenCon() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/realestate1";
            String user = "root";
            String pass = "";
            Connection cn = DriverManager.getConnection(url, user, pass);
            return cn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
