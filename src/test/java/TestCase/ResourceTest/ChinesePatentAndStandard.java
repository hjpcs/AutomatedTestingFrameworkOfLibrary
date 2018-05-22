package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChinesePatentAndStandard extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void chinesePatentAndStandardTest() throws Exception{
        homePage.goResource();
        resourcePage.goChinesePatentAndStandard();
        actionBot.changeWindow();
        actionBot.titleAssert("万方数据知识服务平台","网页标题与预期不符合");
    }

}
