package TestCase.ServiceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckAndCheck extends BaseTest {

    @BeforeClass
    public void beforeClass() throws Exception{
        initLogin();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void checkAndCheckTest() throws Exception{
        homePage.goService();
        servicePage.goCheckAndCheck();
        jointReferencePage.clickApplyOL();
        actionBot.changeWindow();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/JointReferenceConsult/jointReferencePage?title=dataRetrieve",
                "网页url与预期不符合");
    }

}
