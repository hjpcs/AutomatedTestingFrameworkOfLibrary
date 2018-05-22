package TestCase.LearningCenterTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LearningCenterOL extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void learningCenterOLTest() throws Exception{
        homePage.goLearningCenter();
        learningCenterPage.goLearningCenterOL();
        actionBot.changeWindow();
        actionBot.urlAssert("http://zjxu.gj.chaoxing.com/portal","网页url与预期不符合");
    }

}
