package TestCase.RecommendationTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ThemeRecommendation extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void  themeRecommendationTest() throws Exception{
        homePage.clickThemeRecommendation();
        actionBot.sleep(5000);
        actionBot.textAssert(homePage.getThemeRecommendationTitleText(),"会有天使替我爱你",
                "元素文本与预期不符合");
        homePage.clickViewMoreBooks();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/index/bookListList?type=theme",
                "网页url与预期不符合");
        recommendationPage.clickNextPage();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/index/bookListList?type=theme&page_number=2",
                "网页url与预期不符合");
    }

}
