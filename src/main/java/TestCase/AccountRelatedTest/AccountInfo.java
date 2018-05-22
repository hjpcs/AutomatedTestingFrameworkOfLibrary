package TestCase.AccountRelatedTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountInfo extends BaseTest {

    @BeforeClass
    public void beforeClass() throws Exception{
        initLogin();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void accountInfoTest() throws Exception{
        homePage.moveToUserImg();
        homePage.goMyBorrow();
        actionBot.sleep(2000);
        myLibraryPage.clickMyOrder();
        actionBot.sleep(3000);
        myLibraryPage.clickMyLent();
        actionBot.sleep(3000);
        myLibraryPage.clickMyExperience();
        actionBot.sleep(3000);
        myLibraryPage.clickEntrustmentRecord();
        actionBot.sleep(3000);
        myLibraryPage.moveToUserImg();
        myLibraryPage.clickAccountAndInfo();
        actionBot.urlAssert("http://lib.zjxu.edu.cn/PCWeb/User/baseInfo","网页url与预期不符合");
        actionBot.sleep(2000);
        actionBot.browserBack();
        myLibraryPage.moveToUserImg();
        myLibraryPage.clickExit();
        actionBot.sleep(2000);
    }

}
