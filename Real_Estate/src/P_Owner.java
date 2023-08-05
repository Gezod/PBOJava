
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class P_Owner {

    private int id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String address;

    public int getId() {
        return this.id;
    }

    public void setId(int ID) {
        this.id = ID;
    }

    public String getFName() {
        return this.firstname;
    }

    public void setFName(String FNAME) {
        this.firstname = FNAME;
    }

    public String getLName() {
        return this.lastname;
    }

    public void setLName(String LNAME) {
        this.lastname = LNAME;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String PHONE) {
        this.phone = PHONE;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String EMAIL) {
        this.email = EMAIL;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String ADDRESS) {
        this.address = ADDRESS;
    }

    public P_Owner() {
    }

    public P_Owner(int ID, String FNAME, String LNAME, String PHONE, String EMAIL, String ADDRESS) {
        this.id = ID;
        this.firstname = FNAME;
        this.lastname = LNAME;
        this.phone = PHONE;
        this.email = EMAIL;
        this.address = ADDRESS;
    }

    public boolean addNewOwner(P_Owner owner) {
        PreparedStatement ps;

        String addQuery = "INSERT INTO `property_owner`(`fname`, `lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
        try {
            ps = koneksi.OpenCon().prepareStatement(addQuery);
            ps.setString(1, owner.getFName());
            ps.setString(2, owner.getLName());
            ps.setString(3, owner.getPhone());
            ps.setString(4, owner.getEmail());
            ps.setString(5, owner.getAddress());

            return (ps.executeUpdate() > 0);

        } catch (java.sql.SQLException ex) {
            Logger.getLogger(P_Owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean editOwnerData(P_Owner owner) {
        PreparedStatement ps;

        String editQuery = "UPDATE `property_owner` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?";
        try {
            ps = koneksi.OpenCon().prepareStatement(editQuery);
            ps.setString(1, owner.getFName());
            ps.setString(2, owner.getLName());
            ps.setString(3, owner.getPhone());
            ps.setString(4, owner.getEmail());
            ps.setString(5, owner.getAddress());
            ps.setInt(6, owner.getId());

            return (ps.executeUpdate() > 0);

        } catch (java.sql.SQLException ex) {
            Logger.getLogger(P_Owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean deleteOwner(int ownerId)
    {
        PreparedStatement ps;

        String editQuery = "DELETE FROM `property_owner` WHERE `id`=?";
        try {
            ps = koneksi.OpenCon().prepareStatement(editQuery);
            ps.setInt(1,ownerId);

            return (ps.executeUpdate() > 0);

        } catch (java.sql.SQLException ex) {
            Logger.getLogger(P_Owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ArrayList<P_Owner> ownerList()
    {
        ArrayList<P_Owner> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `property_owner`";
        try {
           st = koneksi.OpenCon().prepareStatement(selectQuery);
           rs= st.executeQuery(selectQuery);
           
           P_Owner owner;
           
           while(rs.next()){
               owner = new P_Owner(rs.getInt(1),
                              rs.getString(2), 
                              rs.getString(3),
                              rs.getString(4),
                              rs.getString(5),
                             rs.getString(6));
               list.add(owner);
           }
           
           
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(P_Owner.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list; 
    }
}
