// JDBC_GUI_Insert.java

package jdbc_gui_insert;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class connect
{
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "nisarg";
    
    public int insert(String id,String name) throws Exception
    {
        try
        {
            int t = Integer.parseInt(id);
            Connection conn = DriverManager.getConnection(url,user,password);
            String insert_query = "insert into public.person values(?,?)";
            PreparedStatement st = conn.prepareStatement(insert_query);
            st.setInt(1, t);
            st.setString(2, name);
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
public class JDBC_GUI_Insert extends Frame implements ActionListener
{
    Button b = new Button("Insert");
    TextField tf1 = new TextField();
    TextField tf2 = new TextField();
    TextArea ta = new TextArea();
    
    JDBC_GUI_Insert()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        tf1.setBounds(50,50,100,20);
        tf2.setBounds(50,100,100,20);
        b.setBounds(50,150,100,20);
        ta.setBounds(50,200,400,100);
        this.add(tf1);
        this.add(tf2);
        this.add(b);
        this.add(ta);
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
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            connect c = new connect();
            int row = c.insert(s1, s2);
            display(row);
        }
        catch(Exception ex)
        {
            ta.setText(ex.toString());
        }
       
    }
    public static void main(String[] args) {
        new JDBC_GUI_Insert();
    }
    
}
