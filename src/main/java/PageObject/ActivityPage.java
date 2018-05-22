package PageObject;

public class ActivityPage extends BasePage{

    String allActivity = "全部";
    String lecture = "/html/body/div[3]/div/div[1]/a[2]/div/div[1]";
    String salon = "/html/body/div[3]/div/div[1]/a[3]/div/div[1]";
    String read = "/html/body/div[3]/div/div[1]/a[4]/div/div[1]";
    String activity = "/html/body/div[3]/div/div[1]/a[5]/div/div[1]";
    String appreciate = "/html/body/div[3]/div/div[1]/a[6]/div/div[1]";
    String other = "/html/body/div[3]/div/div[1]/a[7]/div/div[1]";

    String firstActivityTitle = "/html/body/div[4]/div/div/a[1]/div/div[2]/div[2]";

    public void clickLecture(){
        actionBot.clickByXpath(lecture);
    }

    public void clickSalon(){
        actionBot.clickByXpath(salon);
    }

    public void clickRead(){
        actionBot.clickByXpath(read);
    }

    public void clickActivity(){
        actionBot.clickByXpath(activity);
    }

    public void clickAppreciate(){
        actionBot.clickByXpath(appreciate);
    }

    public void clickOther(){
        actionBot.clickByXpath(other);
    }

    public void clickActivityTitle(){
        actionBot.clickByXpath(firstActivityTitle);
    }

}


