package TestCase.LearningCenterTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Credit extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void creditTest() throws Exception{
        homePage.goLearningCenter();
        learningCenterPage.goViewMoreCredit();
        actionBot.changeWindow();
        actionBot.urlAssert("http://zjxu.gj.chaoxing.com/portal/schoolCourseInfo/columnCourse?columnId=8967",
                "网页url与预期不符合");
    }

}
