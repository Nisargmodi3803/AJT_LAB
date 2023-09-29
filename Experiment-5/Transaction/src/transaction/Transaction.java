package transaction;
import java.sql.*;

public class Transaction {
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "nisarg";
    
    public void Tran()
    {
        try
        {
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement s = conn.createStatement();
            try
            {
                conn.setAutoCommit(false);
                String query = "Update public.product set product_price=4500 where product_id=2";
                s.executeUpdate(query);
                conn.commit();
                conn.setAutoCommit(true);
                System.out.println("Commit successfully");
            }
            catch(Exception e)
            {
                conn.rollback();
                System.out.println("Rollback");
            }
        }
        catch(Exception e)
        {
            e.setStackTrace(stackTrace);
        }
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Transaction t = new Transaction();
        t.Tran();
    }
    
}
