package TestCase.ServiceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QuestionAnswer extends BaseTest {

    String keyword = "预约";

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void questionAnswerTest() throws Exception{
        homePage.goService();
        servicePage.goQuestionAnswer();
        jointReferencePage.setKeyword(keyword);
        jointReferencePage.clickSearchButton();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/JointReferenceConsult/consultList?keyword=%E9%A2%84%E7%BA%A6",
                "网页url与预期不符合");
    }

}
