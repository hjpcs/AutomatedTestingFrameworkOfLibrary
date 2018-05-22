package TestCase.InfoTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Notice extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void noticeTest() throws Exception{
        actionBot.textAssert(homePage.getNoticeTitleText(),"图书馆关于清明节假期开馆安排的通知",
                "元素文本与预期不符合");
        homePage.clickViewMoreNotice();
        infoPage.clickNoticeTitle();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/Index/newsDetail/id/158","网页url与预期不符合");
    }

}
