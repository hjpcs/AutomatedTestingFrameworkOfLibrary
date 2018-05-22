package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ElectronicBooks extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void electronicBooksTest() throws Exception{
        homePage.goResource();
        resourcePage.goElectronicBooks();
        actionBot.changeWindow();
        actionBot.titleAssert("汇雅书世界-嘉兴学院","网页标题与预期不符合");
    }

}
