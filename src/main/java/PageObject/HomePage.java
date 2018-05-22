package PageObject;

public class HomePage extends BasePage{

    String resource = "资源";
    String service = "服务";
    String learningCenter = "学习中心";
    String survey = "概况";
    String siteSearch = "站内搜索";
    String oldVersionEntrance = "旧版入口";
    String loginButton = "//div[@class='login-btn cp fr']";

    String topSearchButton = "/html/body/div[2]/div/div[3]/a[2]/img";
    String searchButton = "/html/body/div[5]/div[1]/div/form/div/input[4]";
    String searchText = "/html/body/div[5]/div[1]/div/form/div/input[3]";
    String viewMoreActivity = "/html/body/div[5]/div[2]/div/div/div[2]/a/div";

    String userImg = "/html/body/div[2]/div/div[3]/div/div[1]/img";
    String myBorrow = "//div[@class='info-box'][2]/a[1]";
    String myOrder = "我的预约";
    String myLent = "我的转借";
    String myExperience = "我的阅历";
    String entrustmentRecord = "委托记录";
    String accountAndInfo = "账号与资料";
    String exit = "退出";

    String qq = "QQ";
    String phone = "电话";
    String email = "邮箱";
    String mobilePhone = "移动";
    String consultation = "咨询";

    String wantConsult = "我要咨询";
    String wantDonate = "我要捐赠";
    String latestActivity = "最新活动";
    String workspaceOrder = "研讨间预约";
    String openTime = "开馆时间";
    String offcampusAccess = "校外访问";

    String notice = "公告通知";
    String realTimeInfo = "/html/body/div[5]/div[4]/div[1]/span[2]/span[3]";
    String resourceDynamics = "/html/body/div[5]/div[4]/div[1]/span[2]/span[5]";
    String viewMoreNotice = "/html/body/div[5]/div[4]/div[1]/a/span";
    String noticeTitle = "/html/body/div[5]/div[4]/div[2]/div[3]/a/div[1]";
    String realTimeInfoTitle = "/html/body/div[5]/div[4]/div[2]/div[3]/a/div[1]";
    String resourceDynamicsTitle = "/html/body/div[5]/div[4]/div[2]/div[3]/a/div[1]";

    String newArrivals = "新书推荐";
    String themeRecommendation = "/html/body/div[5]/div[5]/div[1]/span[2]/span[3]";
    String viewMoreBooks = "/html/body/div[5]/div[5]/div[1]/a/span";
    String newArrivalsTitle = "/html/body/div[5]/div[5]/div[2]/a/div/div/div[1]/div[1]";
    String themeRecommendationTitle = "/html/body/div[5]/div[5]/div[2]/a/div/div/div[2]/div[1]";

    String prompt = "/html/body/div[1]/div/div[2]/img[1]";

    public void goResource(){
        actionBot.clickByLinkText(resource);
    }

    public void goService(){
        actionBot.clickByLinkText(service);
    }

    public void goLearningCenter(){
        actionBot.clickByLinkText(learningCenter);
    }

    public void goSurvey(){
        actionBot.clickByLinkText(survey);
    }

    public void goSiteSearch(){
        actionBot.clickByLinkText(siteSearch);
    }

    public void goOldVersionEntrance(){
        actionBot.clickByLinkText(oldVersionEntrance);
    }

    public void goLogin(){
        actionBot.clickByXpath(loginButton);
    }

    public void clickTopSearchButton(){
        actionBot.clickByXpath(topSearchButton);
    }

    public void clickSearchButton(){
        actionBot.clickByXpath(searchButton);
    }

    public void inputKeyWord(String value){
        actionBot.sendkeysByXpath(searchText,value);
    }

    public void goActivity(){
        actionBot.clickByXpath(viewMoreActivity);
    }

    public void moveToUserImg(){
        actionBot.moveToElementByXpath(userImg);
    }

    public void goMyBorrow(){
        actionBot.clickByXpath(myBorrow);
    }

    public void goMyOrder(){
        actionBot.clickByLinkText(myOrder);
    }

    public void goMyLent(){
        actionBot.clickByLinkText(myLent);
    }

    public void goMyExperience(){
        actionBot.clickByLinkText(myExperience);
    }

    public void goEntrustmentRecord(){
        actionBot.clickByLinkText(entrustmentRecord);
    }

    public void goAccountAndInfo(){
        actionBot.clickByLinkText(accountAndInfo);
    }

    public void exit(){
        actionBot.clickByLinkText(exit);
    }

    public void moveToQQ(){
        actionBot.moveToElementByXpath(qq);
    }

    public void moveToPhone(){
        actionBot.moveToElementByXpath(phone);
    }

    public void moveToEmail(){
        actionBot.moveToElementByXpath(email);
    }

    public void moveToMobilePhone(){
        actionBot.moveToElementByXpath(mobilePhone);
    }

    public void goConsultation(){
        actionBot.clickByLinkText(consultation);
    }

    public void goWantConsult(){
        actionBot.clickByLinkText(wantConsult);
    }

    public void goWantDonate(){
        actionBot.clickByLinkText(wantDonate);
    }

    public void goLatestActivity(){
        actionBot.clickByLinkText(latestActivity);
    }

    public void goWorkspaceOrder(){
        actionBot.clickByLinkText(workspaceOrder);
    }

    public void goOpenTime(){
        actionBot.clickByLinkText(openTime);
    }

    public void goOffcampusAccess(){
        actionBot.clickByLinkText(offcampusAccess);
    }

    public void clickNotice(){
        actionBot.clickByLinkText(notice);
    }

    public void clickRealTimeInfo(){
        actionBot.clickByXpath(realTimeInfo);
    }

    public void clickResourceDynamics(){
        actionBot.clickByXpath(resourceDynamics);
    }

    public void clickViewMoreNotice(){
        actionBot.clickByXpath(viewMoreNotice);
    }

    public void clickNewArrivals(){
        actionBot.clickByLinkText(newArrivals);
    }

    public void clickThemeRecommendation(){
        actionBot.clickByXpath(themeRecommendation);
    }

    public void clickViewMoreBooks(){
        actionBot.clickByXpath(viewMoreBooks);
    }

    public void closePrompt(){
        actionBot.clickByXpath(prompt);
    }

    public void openHomePage(){
        actionBot.Open(indexUrl);
    }

    public String getNoticeTitleText(){
        return actionBot.getTextByXpath(noticeTitle);
    }

    public String getRealTimeInfoTitleText(){
        return actionBot.getTextByXpath(realTimeInfoTitle);
    }

    public String getResourceDynamicsTitleText(){
        return actionBot.getTextByXpath(resourceDynamicsTitle);
    }

    public String getNewArrivalsTitleText(){
        return actionBot.getTextByXpath(newArrivalsTitle);
    }

    public String getThemeRecommendationTitleText(){
        return actionBot.getTextByXpath(themeRecommendationTitle);
    }

}
