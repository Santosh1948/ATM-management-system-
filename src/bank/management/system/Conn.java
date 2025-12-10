package bank.management.system;
import java.sql.*;

public class Conn {
    Connection con;
    Statement s;

    public Conn() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","Santosh@2005");

                s = con.createStatement();
            }catch (Exception e){
                System.out.println(e);
            }
        }
}
