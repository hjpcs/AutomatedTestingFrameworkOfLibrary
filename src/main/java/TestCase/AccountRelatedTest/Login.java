package TestCase.AccountRelatedTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends BaseTest {

    String username = "00108288";
    String password = "251210";

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void loginTest() throws Exception{
        actionBot.sleep(2000);
        homePage.goLogin();
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.signIn();
        actionBot.sleep(5000);
        actionBot.urlAssert("http://lib.zjxu.edu.cn/","网页url与预期不符合");
    }

}
