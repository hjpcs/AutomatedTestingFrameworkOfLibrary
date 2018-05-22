package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChineseNumericValueOrFact extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void chineseNumericValueOrFactTest() throws Exception{
        homePage.goResource();
        resourcePage.goChineseNumericValueOrFact();
        actionBot.changeWindow();
        actionBot.titleAssert("国泰安数据服务中心","网页标题与预期不符合");
    }

}
