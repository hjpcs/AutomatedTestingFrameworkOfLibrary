package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DissertationsAndTheses extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void dissertationsAndThesesTest() throws Exception{
        homePage.goResource();
        resourcePage.goDissertationsAndTheses();
        actionBot.changeWindow();
        actionBot.titleAssert("中国优秀硕士学位论文全文数据库","网页标题与预期不符合");
    }

}
