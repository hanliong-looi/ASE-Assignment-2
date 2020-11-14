public class Login{
    private String username;
    private String userpass;

    public Login(String username, String userpass){
        this.username = username;
        this.userpass = userpass;
    }

    public String getUsername(){
        return this.username;
    }
    
    public String getUserpass(){
        return this.userpass;
    }
}