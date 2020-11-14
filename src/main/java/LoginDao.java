import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
public class LoginDao implements LoginDaoInterface{  
    private Login login;

    public LoginDao(String username, String userpass){
        this.login = new Login(username, userpass);
    }

    //Implementation of abstract method validate() in LoginDaoInterface
    public boolean validate(){  
        String username = this.login.getUsername();
        String userpass = this.login.getUserpass();
        boolean status=false;  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/account_credentials?user=admin&password=admin&serverTimezone=UTC"
            );
            System.out.println("Database connected!");
            PreparedStatement ps=con.prepareStatement(  
                "select * from account_info where username=? and password=?");  
            ps.setString(1, username);  
            ps.setString(2, userpass);  
            ResultSet rs=ps.executeQuery();  
            status=rs.next();  
        }
        catch(Exception e){
            e.printStackTrace();
        }  
        return status;  
    }  
}  