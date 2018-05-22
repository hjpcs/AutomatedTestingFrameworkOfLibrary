package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OffcampusAccess extends BaseTest {

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
    public void offcampusAccessTest() throws Exception{
        homePage.goOffcampusAccess();
        offcampusAccessPage.setUsername(username);
        offcampusAccessPage.setPassword(password);
        offcampusAccessPage.signIn();
        actionBot.titleAssert("电子资源校外访问","网页标题与预期不符合");
        actionBot.urlAssert("http://210.33.28.62:8080/menu","网页url与预期不符合");
    }

}
