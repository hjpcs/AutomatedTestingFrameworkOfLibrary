package TestCase.ServiceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReaderService extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void readerServiceTest() throws Exception{
        homePage.goService();

        servicePage.goCollectionDistribution();
        actionBot.titleAssert("馆藏分布","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goNewBooksBulletins();
        actionBot.titleAssert("新书通报","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goReaderRecommendation();
        actionBot.titleAssert("读者荐购","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goBookDonation();
        actionBot.titleAssert("图书捐赠","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goStudentGuide();
        actionBot.titleAssert("新生指南","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goRulesAndRegulations();
        actionBot.titleAssert("规章制度","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goContactUs();
        actionBot.titleAssert("联系我们","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goLiteratureJk();
        actionBot.titleAssert("嘉科文献","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goOpenTime();
        actionBot.titleAssert("嘉兴学院图书馆","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goBeautifulReading();
        actionBot.titleAssert("嘉兴学院图书馆 美丽阅读","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goLiteratureTeaching();
        actionBot.titleAssert("嘉兴学院图书馆 文献教学","网页标题与预期不符合");
        actionBot.browserBack();
    }

}
