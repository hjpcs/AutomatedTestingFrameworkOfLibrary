package PageObject;

public class LoginPage extends BasePage{

    String username = "login_name";
    String password = "password";
    String loginButton = "login_btn";

    public void setUsername(String value){
        actionBot.sendkeysByName(username,value);
    }

    public void setPassword(String value){
        actionBot.sendkeysByName(password,value);
    }

    public void signIn(){
        actionBot.clickById(loginButton);
    }


    public void apiLogin(){
        setUsername("00108288");
        setPassword("251210");
        signIn();
    }

}
