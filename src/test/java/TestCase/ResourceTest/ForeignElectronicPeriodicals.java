package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForeignElectronicPeriodicals extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void foreignElectronicPeriodicalsTest() throws Exception{
        homePage.goResource();
        resourcePage.goForeignElectronicPeriodicals();
        actionBot.changeWindow();
        actionBot.titleAssert("Web of Science [v.5.29] - 所有数据库基本检索","网页标题与预期不符合");
    }

}
