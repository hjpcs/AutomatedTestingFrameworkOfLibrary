package PageObject;

public class ResourcePage extends BasePage{

    String chinesePeriodicalNewspaper = "中国知网全文数据库";
    String foreignElectronicPeriodicals = "Web of Science(SCI and SSCI)";
    String chineseNumericValueOrFact = "国泰安CSMAR系列研究数据库系统";
    String dissertationsAndTheses = "中国知网硕士学位论文数据库（2000年－2006年）";
    String chinesePatentAndStandard = "中国专利数据库（万方）";
    String chineseYearbook = "中国知网年鉴数据库（2013年－2016年）";
    String chineseIndexOrLiterature = "JCR期刊分区数据";
    String multimediaLearningLibrary = "FiF外语学习资源库";
    String electronicBooks = "超星电子图书";
    String characteristicResources = "嘉兴名人特色数据库";
    String freeResources = "/html/body/div[3]/div/div[4]/div[12]/div[2]/div/div[14]/a/div[1]";
    String globalOpenCurriculumResources = "京都大学开放课程";

    public void goChinesePeriodicalNewspaper(){
        actionBot.clickByLinkText(chinesePeriodicalNewspaper);
    }

    public void goForeignElectronicPeriodicals(){
        actionBot.clickByLinkText(foreignElectronicPeriodicals);
    }

    public void goChineseNumericValueOrFact(){
        actionBot.clickByLinkText(chineseNumericValueOrFact);
    }

    public void goDissertationsAndTheses(){
        actionBot.clickByLinkText(dissertationsAndTheses);
    }

    public void goChinesePatentAndStandard(){
        actionBot.clickByLinkText(chinesePatentAndStandard);
    }

    public void goChineseYearbook(){
        actionBot.clickByLinkText(chineseYearbook);
    }

    public void goChineseIndexOrLiterature(){
        actionBot.clickByLinkText(chineseIndexOrLiterature);
    }

    public void goMultimediaLearningLibrary(){
        actionBot.clickByLinkText(multimediaLearningLibrary);
    }

    public void goElectronicBooks(){
        actionBot.clickByLinkText(electronicBooks);
    }

    public void goCharacteristicResources(){
        actionBot.clickByLinkText(characteristicResources);
    }

    public void goFreeResources(){
        actionBot.clickByXpath(freeResources);
    }

    public void goGlobalOpenCurriculumResources(){
        actionBot.clickByLinkText(globalOpenCurriculumResources);
    }

}
