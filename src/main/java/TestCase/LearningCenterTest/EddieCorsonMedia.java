package TestCase.LearningCenterTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EddieCorsonMedia extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void eddieCorsonMediaTest() throws Exception{
        homePage.goLearningCenter();
        learningCenterPage.goEddieCorsonMedia();
        actionBot.changeWindow();
        actionBot.urlAssert("http://www.bjadks.cn/","网页url与预期不符合");
    }

}
