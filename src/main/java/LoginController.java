import com.opensymphony.xwork2.ActionSupport;

public class LoginController extends ActionSupport{  
    private String username;
    private String userpass;  
    
    public String getUsername() {  
        return this.username;  
    }  
    
    public void setUsername(String username) {  
        this.username = username;  
    }  
    
    public String getUserpass() {  
        return this.userpass;  
    }  
    
    public void setUserpass(String userpass) {  
        this.userpass = userpass;  
    }  
    
    public String execute(){  
        LoginDaoInterface logInDaoInterface = new LoginDao(username, userpass);
        if(logInDaoInterface.validate()){  
            return "success";  
        }  
        else{  
            return "error";  
        }  
    }     
}  