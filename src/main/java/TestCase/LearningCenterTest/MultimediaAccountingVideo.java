package TestCase.LearningCenterTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultimediaAccountingVideo extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void multimediaAccountingVideoTest() throws Exception{
        homePage.goLearningCenter();
        learningCenterPage.goMultimediaAccountingVideo();
        actionBot.changeWindow();
        actionBot.urlAssert("http://library.chnedu.com/CM/per/view.do?op=getPayCatIDByDB",
                "网页url与预期不符合");
    }

}
