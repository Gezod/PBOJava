
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class P_Type {

    private int id;
    private String name;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer ID)
    {
        this.id= ID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String NAME) {
        this.name = NAME;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String DESCRIPTION) {
        this.description = DESCRIPTION;
    }

    // Create the class Constructors
    public P_Type() {
    }

    public P_Type(Integer ID, String NAME, String DESCRIPTION) {
        this.id = ID;
        this.name = NAME;
        this.description = DESCRIPTION;

    }

    // create a function to insert - edit - remove type
    public boolean execTypeQuery(String queryType, P_Type type) {
        PreparedStatement ps;

        if (queryType.equals("add")) {
            try {
                ps = koneksi.OpenCon().prepareStatement("INSERT INTO `property_type`(`name`, `description`) VALUES (?,?)");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());

                if (ps.executeUpdate() > 0) {
                    return true;
                }
            } catch (java.sql.SQLException ex) {
                Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } else if (queryType.equals("edit")) {
            try {
                ps = koneksi.OpenCon().prepareStatement("UPDATE `property_type` SET `name`=?,`description`=? WHERE `id`= ?");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                ps.setInt(3, type.getId());

                if (ps.executeUpdate() > 0) {
                    return true;
                }
            } catch (java.sql.SQLException ex) {
                Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } else if (queryType.equals("remove")) {
            try {
                ps = koneksi.OpenCon().prepareStatement("DELETE FROM `property_type` WHERE `id`= ?");
                ps.setInt(1, type.getId());

                if (ps.executeUpdate() > 0) {
                    return true;
                }
            } catch (java.sql.SQLException ex) {
                Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Enter The Correct Query(add,edit,remove)", "Invalid Operation", 2);
            return false;
        }
        return true;
    }

    public HashMap<String, Integer> getTypesMap() {
        HashMap<String, Integer> map = new HashMap<>();

        Statement st;
        ResultSet rs;

        try {
            st = koneksi.OpenCon().createStatement();

            rs = st.executeQuery("SELECT * FROM `property_type`");

            P_Type type;

            while (rs.next()) {
                type = new P_Type(rs.getInt(1), rs.getString(2), rs.getString(3));

                map.put(type.getName(), type.getId());
            }
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
        }

        return map;
    }

    // create a function to get a type data by id
    // we can use  getTypesMap() functionto get the id and name
    //
    public P_Type getTypeById(Integer id) {
        PreparedStatement ps;
        ResultSet rs;

        P_Type type = new P_Type();

        try {
            ps = koneksi.OpenCon().prepareStatement("SELECT * FROM `property_type` WHERE `id`=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                type.setId(id);
                type.setName(rs.getString(2));
                type.setDescription(rs.getString(3));

            }
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(P_Type.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return type;
    }
}
