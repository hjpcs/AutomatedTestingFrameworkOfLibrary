package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChinesePeriodicalNewspaper extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void chinesePeriodicalNewspaperTest() throws Exception{
        homePage.goResource();
        resourcePage.goChinesePeriodicalNewspaper();
        actionBot.changeWindow();
        actionBot.titleAssert("中国知网","网页标题与预期不符合");
    }

}
