package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FreeResources extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void freeResourcesTest() throws Exception{
        homePage.goResource();
        resourcePage.goFreeResources();
        actionBot.changeWindow();
        actionBot.titleAssert("百度文库——让每个人平等地提升自我","网页标题与预期不符合");
    }

}
