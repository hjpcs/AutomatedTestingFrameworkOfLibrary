package TestCase.ServiceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TeachingAndTraining extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void teachingAndTrainingTest() throws Exception{
        homePage.goService();
        servicePage.goTeachingAndTraining();
        actionBot.titleAssert("联合参考咨询 教学与培训", "网页标题与预期不符合");
    }

}
