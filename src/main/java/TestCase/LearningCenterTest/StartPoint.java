package TestCase.LearningCenterTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StartPoint extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void startPointTest() throws Exception{
        homePage.goLearningCenter();
        learningCenterPage.goQiDian();
        actionBot.changeWindow();
        actionBot.urlAssert("http://www.qdexam.com/main","网页url与预期不符合");
    }

}
