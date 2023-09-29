package JDBC_GUI_Delete;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class connect
{
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "nisarg";
    
    public int delete(String id) throws Exception
    {
        try
        {
            int t = Integer.parseInt(id);
            Connection conn = DriverManager.getConnection(url,user,password);
            String delete_query = "delete from public.family where id=?)";
            PreparedStatement st = conn.prepareStatement(delete_query);
            st.setInt(1, t);
            int row = st.executeUpdate();
            st.close();
            return row;
        }
        catch(Exception e)
        {
            throw e;
        }       
        
    }
}
public class JDBC_GUI_Delete extends Frame implements ActionListener
{
    Button b = new Button("Delete");
    TextField tf = new TextField();
    
    JDBC_GUI_Delete()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        tf.setBounds(50,50,100,20);
        b.setBounds(50,100,100,20);
        this.add(tf);
        this.add(b);
        b.addActionListener(this); 
    }
    
    public void display(int row)
    {
        ta.setText(row+" is affected");
    }
    
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            String s1 = tf.getText();
            connect c = new connect();
            int row = c.delete(s1);
            display(row);
        }
        catch(Exception ex)
        {
            ta.setText(ex.toString());
        }
       
    }
    public static void main(String[] args) {
        new JDBC_GUI_Delete();
    }
    
}
