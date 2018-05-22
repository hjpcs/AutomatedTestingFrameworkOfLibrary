package TestCase.LearningCenterTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mooc extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void moocTest() throws Exception{
        homePage.goLearningCenter();
        learningCenterPage.goViewMoreMOOC();
        actionBot.changeWindow();
        actionBot.urlAssert("http://zjxu.gj.chaoxing.com/portal/schoolCourseInfo/columnCourse?columnId=6959",
                "网页url与预期不符合");
    }

}
