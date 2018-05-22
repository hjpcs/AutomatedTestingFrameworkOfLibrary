package TestCase.ServiceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DocumentDelivery extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void documentDeliveryTest() throws Exception{
        homePage.goService();
        servicePage.goDocumentDelivery();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/JointReferenceConsult/detail?category_id=1009&id=67",
                "网页url与预期不符合");
    }

}
