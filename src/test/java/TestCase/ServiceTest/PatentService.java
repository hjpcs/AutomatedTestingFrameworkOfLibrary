package TestCase.ServiceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PatentService extends BaseTest {

    @BeforeClass
    public void beforeClass() throws Exception{
        initLogin();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void patentServicekTest() throws Exception{
        homePage.goService();
        servicePage.goPatentService();
        jointReferencePage.clickApplyOL();
        actionBot.changeWindow();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/JointReferenceConsult/jointReferencePage?title=patentService",
                "网页url与预期不符合");
    }

}
