package PageObject;

public class LearningCenterPage extends BasePage{

    String learningCenterOL = "进入独立网站";

    String qiDian = "起点自主考试学习系统";
    String eddieCorsonMedia = "爱迪科森就业培训多媒体库";
    String eddieCorsonReportingHall = "爱迪科森网上报告厅";
    String multimediaAccountingVideo = "正保多媒体会计视频";

    String viewMoreMOOC = "/html/body/div[3]/div[3]/div[1]/div/a/span";
    String viewMoreCredit = "/html/body/div[3]/div[3]/div[2]/div/a/span";
    String viewMorePublicAwareness = "/html/body/div[3]/div[4]/div/div/a/span";

    public void goLearningCenterOL(){
        actionBot.clickByLinkText(learningCenterOL);
    }

    public void goQiDian(){
        actionBot.clickByLinkText(qiDian);
    }

    public void goEddieCorsonMedia(){
        actionBot.clickByLinkText(eddieCorsonMedia);
    }

    public void goEddieCorsonReportingHall(){
        actionBot.clickByLinkText(eddieCorsonReportingHall);
    }

    public void goMultimediaAccountingVideo(){
        actionBot.clickByLinkText(multimediaAccountingVideo);
    }

    public void goViewMoreMOOC(){
        actionBot.clickByXpath(viewMoreMOOC);
    }

    public void goViewMoreCredit(){
        actionBot.clickByXpath(viewMoreCredit);
    }

    public void goViewMorePublicAwareness(){
        actionBot.clickByXpath(viewMorePublicAwareness);
    }

}
