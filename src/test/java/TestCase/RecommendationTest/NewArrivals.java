package TestCase.RecommendationTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewArrivals extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void newArrivalsTest() throws Exception{
        actionBot.textAssert(homePage.getNewArrivalsTitleText(),"摆渡人","元素文本与预期不符合");
        homePage.clickViewMoreBooks();
        actionBot.textAssert(recommendationPage.getNewArrivalsTitleText(),"喜欢我也没关系",
                "元素文本与预期不符合");
        recommendationPage.clickNewArrivalsTitle();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/index/bookListDetail/id/141","网页url与预期不符合");
    }

}
