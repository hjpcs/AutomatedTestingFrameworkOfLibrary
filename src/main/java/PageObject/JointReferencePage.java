package PageObject;

public class JointReferencePage extends BasePage{

    String chemicalBiology = "化学生物学";
    String law = "法律";
    String medicineAndPharmacy = "医药学";
    String mechanicalEngineering = "机械工程";
    String materialScience = "材料科学";
    String computerScience = "计算机科学";
    String economics = "经济学";
    String introductionOfSubjectService = "学科服务介绍";
    String schoolDynamics = "本校SCI及EI动态";

    String applyOL = "//*[@id=\"btn_apply\"]/div";


    String scientificResearchSupportService = "/html/body/div[3]/div/a[1]/div[1]";
    String subjectRetrievalAndProblemService = "/html/body/div[3]/div/a[2]/div[1]";
    String teachingSupportService = "/html/body/div[3]/div/a[3]/div[1]";
    String freeResourceRecommendation = "/html/body/div[3]/div/a[4]/div[1]";
    String elsevier = "/html/body/div[3]/div/a[5]/div[1]";
    String similarityDetectionInPaper = "/html/body/div[3]/div/a[6]/div[1]";

    String patentServiceApply = "在线申请";

    String searchText = "keyword";
    String searchButton = "//*[@id=\"keyword_form\"]/div/img";

    public void clickChemicalBiology(){
        actionBot.clickByLinkText(chemicalBiology);
    }

    public void clickLaw(){
        actionBot.clickByLinkText(law);
    }

    public void clickMedicineAndPharmacy(){
        actionBot.clickByLinkText(medicineAndPharmacy);
    }

    public void clickMechanicalEngineering(){
        actionBot.clickByLinkText(mechanicalEngineering);
    }

    public void clickMaterialScience(){
        actionBot.clickByLinkText(materialScience);
    }

    public void clickComputerScience(){
        actionBot.clickByLinkText(computerScience);
    }

    public void clickEconomics(){
        actionBot.clickByLinkText(economics);
    }

    public void clickIntroductionOfSubjectService(){
        actionBot.clickByLinkText(introductionOfSubjectService);
    }

    public void clickSchoolDynamics(){
        actionBot.clickByLinkText(schoolDynamics);
    }

    public void clickApplyOL(){
        actionBot.clickByXpath(applyOL);
    }

    public void clickScientificResearchSupportService(){
        actionBot.clickByXpath(scientificResearchSupportService);
    }

    public void clickSubjectRetrievalAndProblemService(){
        actionBot.clickByXpath(subjectRetrievalAndProblemService);
    }

    public void clickTeachingSupportService(){
        actionBot.clickByXpath(teachingSupportService);
    }

    public void clickFreeResourceRecommendation(){
        actionBot.clickByXpath(freeResourceRecommendation);
    }

    public void clickElsevier(){
        actionBot.clickByXpath(elsevier);
    }

    public void clickSimilarityDetectionInPaper(){
        actionBot.clickByXpath(similarityDetectionInPaper);
    }

    public void clickPatentServiceApply(){
        actionBot.clickByLinkText(patentServiceApply);
    }

    public void setKeyword(String value){
        actionBot.sendkeysByName(searchText,value);
    }

    public void clickSearchButton(){
        actionBot.clickByXpath(searchButton);
    }
}
