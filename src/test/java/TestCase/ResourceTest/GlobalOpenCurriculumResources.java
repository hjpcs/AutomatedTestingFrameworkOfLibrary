package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GlobalOpenCurriculumResources extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void globalOpenCurriculumResourcesTest() throws Exception{
        homePage.goResource();
        resourcePage.goGlobalOpenCurriculumResources();
        actionBot.changeWindow();
        actionBot.titleAssert("京都大学OCWへ ようこそ — 京都大学OCW","网页标题与预期不符合");
    }

}
