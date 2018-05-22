package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChineseIndexOrLiterature extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void chineseIndexOrLiteratureTest() throws Exception{
        homePage.goResource();
        resourcePage.goChineseIndexOrLiterature();
        actionBot.changeWindow();
        actionBot.titleAssert("欢迎来到中科院JCR期刊分区数据在线平台","网页标题与预期不符合");
    }

}
