package TestCase.LearningCenterTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PublicAwareness extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void publicAwarenessTest() throws Exception{
        homePage.goLearningCenter();
        learningCenterPage.goViewMorePublicAwareness();
        actionBot.changeWindow();
        actionBot.urlAssert("http://video.fy.chaoxing.com/?webType=1&prefix=zjxu","网页url与预期不符合");
    }

}
