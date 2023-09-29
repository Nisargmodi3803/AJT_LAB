//JDBC_GUI_Search.java

package JDBC_GUI_Search;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class connect 
{
    private String url = "jdbc:postgresql://localhost:5432/postgres";
    private String username = "postgres";
    private String password = "nisarg";
    
    public ResultSet fetch(String s) throws Exception
    {
        try
        {
            int x = Integer.parseInt(s);
            Connection conn = null;
            conn = DriverManager.getConnection(url,username,password);
//            Statement st = conn.createStatement();
            String query = "select * from public.family where id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, x);
            ResultSet rs = ps.executeQuery();
            return rs;
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }
}
public class JDBC_GUI_Search extends Frame implements ActionListener{
    Button b;
    TextField tf;
    TextArea ta;
    Label l;
    
    JDBC_GUI_Search()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        l = new Label("Enter ID");
        b = new Button("Execute Search");
        tf = new TextField();
        ta = new TextArea();
        l.setBounds(10,35,50,50);
        tf.setBounds(100,50,100,20);
        b.setBounds(100, 100, 100, 20);
        ta.setBounds(100,160,400,100);
        this.add(l);
        this.add(tf);
        this.add(b);
        this.add(ta);
        b.addActionListener(this);
    }
    
    public void PrintResult(ResultSet rs)
    {
        try
        {
            ta.setText("");
            while(rs.next())
            {
                ta.append(rs.getString(1)+"---->"+rs.getString(2)+"\n");
            }
        }
        catch(Exception ex)
        {
            ta.setText(ex.toString());
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            connect c = new connect();
            String s = tf.getText();
            ResultSet rs = c.fetch(s);
            PrintResult(rs);
        }
        catch(Exception ex)
        {
            ta.setText(ex.toString());
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new JDBC_GUI_Search();
    }
}
