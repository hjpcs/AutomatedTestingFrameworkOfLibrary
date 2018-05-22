package PageObject;

public class SurveyPage extends BasePage{

    String libraryName = "嘉兴学院图书馆";
    String lnstitutionSetting = "机构设置";

    public String getLibraryNameText(){
        return actionBot.getTextByLinkText(libraryName);
    }

    public String getLnstitutionSettingText(){
        return actionBot.getTextByLinkText(lnstitutionSetting);
    }

}
