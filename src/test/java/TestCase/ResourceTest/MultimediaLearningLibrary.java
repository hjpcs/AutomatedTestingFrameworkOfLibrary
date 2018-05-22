package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultimediaLearningLibrary extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void multimediaLearningLibraryTest() throws Exception{
        homePage.goResource();
        resourcePage.goMultimediaLearningLibrary();
        actionBot.changeWindow();
        actionBot.titleAssert("FIF外语学习资源库","网页标题与预期不符合");
    }

}
