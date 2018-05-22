package TestCase.ServiceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InformationService extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void informationServiceTest() throws Exception{
        homePage.goService();
        servicePage.goInformationService();

        jointReferencePage.clickScientificResearchSupportService();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/JointReferenceConsult/intelligenceServiceDetailTab/id/16",
                "网页url与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickSubjectRetrievalAndProblemService();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/JointReferenceConsult/intelligenceServiceDetailTab/id/18",
                "网页url与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickTeachingSupportService();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/JointReferenceConsult/intelligenceServiceDetailTab/id/19",
                "网页url与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickFreeResourceRecommendation();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/JointReferenceConsult/intelligenceServiceDetailTab/id/331",
                "网页url与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickElsevier();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/JointReferenceConsult/intelligenceServiceDetailTab/id/321",
                "网页url与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickSimilarityDetectionInPaper();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/JointReferenceConsult/intelligenceServiceDetailTab/id/20",
                "网页url与预期不符合");
        actionBot.browserBack();
    }

}
