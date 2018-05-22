package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChineseYearbook extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void chineseYearbookTest() throws Exception{
        homePage.goResource();
        resourcePage.goChineseYearbook();
        actionBot.changeWindow();
        actionBot.titleAssert("中国年鉴网络出版总库","网页标题与预期不符合");
    }

}
