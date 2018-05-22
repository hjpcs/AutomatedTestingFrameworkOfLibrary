package PageObject;

public class InfoPage extends BasePage{

    String notice = "公告通知";
    String realTimeInfo = "实时资讯";
    String resourceDynamics = "资源动态";

    String noticeTitle = "/html/body/div[4]/div/div/a[1]/div/div[1]";
    String realTimeInfoTitle = "/html/body/div[4]/div/div/a[1]/div/div[1]";
    String resourceDynamicsTitle = "/html/body/div[4]/div/div/a[1]/div/div[1]";

    public void clickNotice(){
        actionBot.clickByLinkText(notice);
    }

    public void clickRealTimeInfo(){
        actionBot.clickByLinkText(realTimeInfo);
    }

    public void clickResourceDynamics(){
        actionBot.clickByLinkText(resourceDynamics);
    }

    public void clickNoticeTitle(){
        actionBot.clickByXpath(noticeTitle);
    }

    public void clickRealTimeInfoTitle(){
        actionBot.clickByXpath(realTimeInfoTitle);
    }

    public void clickResourceDynamicsTitle(){
        actionBot.clickByXpath(resourceDynamicsTitle);
    }

}
