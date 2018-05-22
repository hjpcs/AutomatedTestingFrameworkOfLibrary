package TestCase.ActivityTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Read extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void readTest() throws Exception{
        homePage.goActivity();
        actionBot.sleep(2000);
        activityPage.clickRead();
        activityPage.clickActivityTitle();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/Index/activityDetail/id/227","网页url与预期不符合");
    }

}
