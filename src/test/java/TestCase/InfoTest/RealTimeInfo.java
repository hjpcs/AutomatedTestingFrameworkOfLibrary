package TestCase.InfoTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RealTimeInfo extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void realTimeInfoTest() throws Exception{
        homePage.clickRealTimeInfo();
        actionBot.sleep(5000);
        actionBot.textAssert(homePage.getRealTimeInfoTitleText(),"复旦大学博士生导师骆玉明教授应邀来我校讲学",
                "元素文本与预期不符合");
        homePage.clickViewMoreNotice();
        infoPage.clickRealTimeInfoTitle();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/Index/newsDetail/id/161","网页url与预期不符合");
    }

}
