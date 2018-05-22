package TestCase.ServiceTest;

import Base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReservationService extends BaseTest {

    @BeforeClass
    public void beforeClass(){
        init();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        actionBot.exit();
    }

    @Test
    public void reservationServiceTest() throws Exception{
        homePage.goService();

        servicePage.goBookReservation();
        actionBot.titleAssert("图书预约","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goWorkspaceOrder();
        actionBot.titleAssert("研讨间预约","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goReadingRoomReservation();
        actionBot.titleAssert("阅览室预约","网页标题与预期不符合");
        actionBot.browserBack();

        servicePage.goActivityReservation();
        actionBot.titleAssert("活动预约","网页标题与预期不符合");
        actionBot.browserBack();
    }

}
