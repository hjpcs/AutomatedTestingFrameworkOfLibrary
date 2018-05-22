package TestCase.LearningCenterTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EddieCorsonReportingHall extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void eddieCorsonReportingHallTest() throws Exception{
        homePage.goLearningCenter();
        learningCenterPage.goEddieCorsonReportingHall();
        actionBot.changeWindow();
        actionBot.titleAssert("爱迪科森网上报告厅","网页标题与预期不符合");
    }

}
