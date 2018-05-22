package TestCase.ActivityTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void activityTest() throws Exception{
        homePage.goActivity();
        actionBot.sleep(2000);
        activityPage.clickActivity();
        activityPage.clickActivityTitle();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/Index/activityDetail/id/249","网页url与预期不符合");
    }

}
