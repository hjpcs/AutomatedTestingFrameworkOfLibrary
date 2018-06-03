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
        actionBot.urlAssert("http://cnki.heinfo.gov.cn/Kns55/logindigital.aspx","网页url与预期不符合");
    }

}
