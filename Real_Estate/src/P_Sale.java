import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class P_Sale {
    private int id;
    private int propertyId;
    private int clientId;
    private String finalPrice;
    private String sellingDate;
    
    public P_Sale(){}
    
    public P_Sale(int ID, int PROPERTY_ID, int CLIENTS_ID,String FINAL_PRICE, String SELLING_DATE)
    {
        this.id = ID;
        this.propertyId = PROPERTY_ID;
        this.clientId = CLIENTS_ID;
        this.finalPrice = FINAL_PRICE;
        this.sellingDate = SELLING_DATE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }
    
    public boolean addNewSale(P_Sale sale) {
        PreparedStatement ps;

        String addQuery = "INSERT INTO `sale`(`property_id`, `client_id`, `final_price`, `sale_date`) VALUES (?,?,?,?)";
        try {
            ps = koneksi.OpenCon().prepareStatement(addQuery);
            ps.setInt(1, sale.getPropertyId());
            ps.setInt(2,sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
           
            return (ps.executeUpdate() > 0);

        } catch (java.sql.SQLException ex) {
            Logger.getLogger(P_Sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean editSaleData(P_Sale sale) {
        PreparedStatement ps;

        String editQuery = "UPDATE `sale` SET `property_id`=?,`client_id`=?,`final_price`=?,`sale_date`=? WHERE `id`=?";
        try {
            ps = koneksi.OpenCon().prepareStatement(editQuery);
            ps.setInt(1,sale.getPropertyId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3,sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
            ps.setInt(5,sale.getId());

            return (ps.executeUpdate() > 0);

        } catch (java.sql.SQLException ex) {
            Logger.getLogger(P_Sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean deleteSale(int saleId)
    {
        PreparedStatement ps;

        String editQuery = "DELETE FROM `sale` WHERE `id`=?";
        try {
            ps = koneksi.OpenCon().prepareStatement(editQuery);
            ps.setInt(1,saleId);

            return (ps.executeUpdate() > 0);

        } catch (java.sql.SQLException ex) {
            Logger.getLogger(P_Sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     public ArrayList<P_Sale> salesList()
    {
        ArrayList<P_Sale> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        
        String selectQuery = "SELECT * FROM `sale`";
        try {
           st = koneksi.OpenCon().prepareStatement(selectQuery);
           rs= st.executeQuery(selectQuery);
           
           P_Sale sale;
           
           while(rs.next()){
               sale = new P_Sale(rs.getInt(1),
                           rs.getInt(2),
                            rs.getInt(3),
                           rs.getString(4),
                          rs.getString(5));
               list.add(sale);
           }
           
           
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(P_Sale.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list; 
    }
}
