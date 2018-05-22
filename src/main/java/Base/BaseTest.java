package Base;

import PageObject.*;
import Utils.ActionBot;

public class BaseTest {

    public ActionBot actionBot = new ActionBot();

    public HomePage homePage = new HomePage();

    public ResourcePage resourcePage = new ResourcePage();

    public ServicePage servicePage = new ServicePage();

    public LearningCenterPage learningCenterPage = new LearningCenterPage();

    public SurveyPage surveyPage = new SurveyPage();

    public LoginPage loginPage = new LoginPage();

    public ActivityPage activityPage = new ActivityPage();

    public OffcampusAccessPage offcampusAccessPage = new OffcampusAccessPage();

    public InfoPage infoPage = new InfoPage();

    public RecommendationPage recommendationPage = new RecommendationPage();

    public JointReferencePage jointReferencePage = new JointReferencePage();

    public MyLibraryPage myLibraryPage = new MyLibraryPage();

    public void init(){
        homePage.openHomePage();
        actionBot.pageLoadWait(20);
        actionBot.elementWait(10);
        actionBot.browserMaxsize();
        homePage.closePrompt();
    }

    public void initLogin() throws Exception{
        init();
        actionBot.sleep(2000);
        homePage.goLogin();
        loginPage.apiLogin();
        actionBot.sleep(5000);
    }
}
