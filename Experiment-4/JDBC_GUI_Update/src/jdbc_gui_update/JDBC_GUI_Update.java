//JDBC Update Query...

package JDBC_GUI_Update;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

class Connect
{
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "nisarg";
    
    public int fetch(String ID, String change) throws Exception
    {
        try
        {
            int id1 = Integer.parseInt(ID);
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement("Update public.family set name=? where id=?");
            stmt.setString(1,change);
            stmt.setInt(2, id1);
            int rows = stmt.executeUpdate();
            stmt.close();
            return rows;
        }
        catch(Exception e)
        {
            throw e;
        }
        
    }
    
}

public class JDBC_GUI_Update extends Frame implements ActionListener
{
    TextField tf1, tf2;
    Button b;
    TextArea tx;
    
    JDBC_GUI_Update()
    {
        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        b = new Button("Update");
        tf1 = new TextField();
        tf2 = new TextField();
        tx = new TextArea();
        tf1.setBounds(50, 50, 100, 20);
        tf2.setBounds(50,100,100,20);
        b.setBounds(50, 150, 100, 20);
        tx.setBounds(50,200,400,200);
        
        this.add(tf1);
        this.add(tf2);
        this.add(b);
        this.add(tx);
        b.addActionListener(this);
    }
    
    public void print(int rows)
    {
        tx.setText(rows + " rows affected.");
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            Connect c = new Connect();
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            int rows = c.fetch(s1,s2);
            print(rows);
        }
        catch(Exception ex)
        {
            tx.setText(ex.toString());
        }
        
    }

    public static void main(String[] args) 
    {
        // TODO code application logic here
        new JDBC_GUI_Update();
    }
    
}