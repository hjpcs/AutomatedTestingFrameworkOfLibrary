package PageObject;

public class RecommendationPage extends BasePage{

    String newArrivalsTitle = "/html/body/div[4]/div/div/a/div/div[2]/div[2]/div[1]";
    String themeRecommendationTitle = "倾城之恋";
    String nextPageThemeRecommendationTitle = "经济通史";

    String themeRecommendation = "/html/body/div[3]/div/a[2]/div/div[1]";
    String nextPage = "2";

    public String getNewArrivalsTitleText(){
        return actionBot.getTextByXpath(newArrivalsTitle);
    }

    public void clickNewArrivalsTitle(){
        actionBot.clickByXpath(newArrivalsTitle);
    }

    public String getThemeRecommendationTitleText(){
        return actionBot.getTextByLinkText(themeRecommendationTitle);
    }

    public String getNextPageThemeRecommendationTitle(){
        return actionBot.getTextByLinkText(nextPageThemeRecommendationTitle);
    }

    public void clickThemeRecommendation(){
        actionBot.clickByXpath(themeRecommendation);
    }

    public void clickNextPage(){
        actionBot.clickByLinkText(nextPage);
    }
}
