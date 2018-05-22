package TestCase.InfoTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ResourceDynamics extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void resourceDynamicsTest() throws Exception{
        homePage.clickResourceDynamics();
        actionBot.sleep(5000);
        actionBot.textAssert(homePage.getResourceDynamicsTitleText(),"欢迎使用嘉兴学院图书馆SCD科学引文数据库",
                "元素文本与预期不符合");
        homePage.clickViewMoreNotice();
        infoPage.clickResourceDynamicsTitle();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/Index/newsDetail/id/75","网页url与预期不符合");
    }

}
