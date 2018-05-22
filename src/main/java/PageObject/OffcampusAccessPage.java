package PageObject;

public class OffcampusAccessPage extends BasePage{

    String username = "user";
    String password = "pass";
    String loginButton = "//*[@id=\"loginForm\"]/div[3]/input";

    public void setUsername(String value){
        actionBot.sendkeysByName(username,value);
    }

    public void setPassword(String value){
        actionBot.sendkeysByName(password,value);
    }

    public void signIn(){
        actionBot.clickByXpath(loginButton);
    }

}
