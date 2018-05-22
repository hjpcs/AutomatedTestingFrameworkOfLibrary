package TestCase.ServiceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SubjectService extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void subjectServiceTest() throws Exception{
        homePage.goService();
        servicePage.goSubjectService();

        jointReferencePage.clickChemicalBiology();
        actionBot.titleAssert("学科服务 化学生物学","网页标题与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickLaw();;
        actionBot.titleAssert("学科服务 法律","网页标题与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickMedicineAndPharmacy();
        actionBot.titleAssert("学科服务 医药学","网页标题与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickMechanicalEngineering();
        actionBot.titleAssert("学科服务 机械工程","网页标题与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickMaterialScience();
        actionBot.titleAssert("学科服务 材料科学","网页标题与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickComputerScience();
        actionBot.titleAssert("学科服务 计算机科学","网页标题与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickEconomics();
        actionBot.titleAssert("学科服务 经济学","网页标题与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickIntroductionOfSubjectService();
        actionBot.titleAssert("学科服务 学科服务介绍","网页标题与预期不符合");
        actionBot.browserBack();

        jointReferencePage.clickSchoolDynamics();
        actionBot.titleAssert("学科服务 本校SCI及EI动态","网页标题与预期不符合");
        actionBot.browserBack();
    }

}
