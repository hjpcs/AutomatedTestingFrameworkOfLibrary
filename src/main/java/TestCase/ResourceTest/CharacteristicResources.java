package TestCase.ResourceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CharacteristicResources extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void characteristicResourcesTest() throws Exception{
        homePage.goResource();
        resourcePage.goCharacteristicResources();
        actionBot.changeWindow();
        actionBot.titleAssert("嘉兴名人研究全文数据库","网页标题与预期不符合");
    }

}
