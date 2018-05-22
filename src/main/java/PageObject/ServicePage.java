package PageObject;

public class ServicePage extends BasePage{

    String subjectService = "/html/body/div[3]/div[3]/div[2]/a[1]/img";
    String noveltySearch = "/html/body/div[3]/div[3]/div[2]/a[2]/img";
    String checkAndCheck = "/html/body/div[3]/div[3]/div[2]/a[3]/img";
    String documentDelivery = "/html/body/div[3]/div[3]/div[2]/a[4]/img";
    String informationService = "/html/body/div[3]/div[3]/div[2]/a[5]/img";
    String patentService = "/html/body/div[3]/div[3]/div[2]/a[6]/img";
    String questionAnswer = "/html/body/div[3]/div[3]/div[2]/a[7]/img";
    String teachingAndTraining = "/html/body/div[3]/div[3]/div[2]/a[8]/img";

    String bookReservation = "/html/body/div[3]/div[4]/div/div/div/div/a[1]/img";
    String workspaceOrder = "/html/body/div[3]/div[4]/div/div/div/div/a[2]/img";
    String readingRoomReservation = "/html/body/div[3]/div[4]/div/div/div/div/a[3]/img";
    String activityReservation = "/html/body/div[3]/div[4]/div/div/div/div/a[4]/img";

    String collectionDistribution = "/html/body/div[3]/div[5]/div[2]/a[1]/img";
    String newBooksBulletins = "/html/body/div[3]/div[5]/div[2]/a[2]/img";
    String readerRecommendation = "/html/body/div[3]/div[5]/div[2]/a[3]/img";
    String bookDonation = "/html/body/div[3]/div[5]/div[2]/a[4]/img";
    String studentGuide = "/html/body/div[3]/div[5]/div[2]/a[5]/img";
    String rulesAndRegulations = "/html/body/div[3]/div[5]/div[2]/a[6]/img";
    String contactUs = "/html/body/div[3]/div[5]/div[2]/a[7]/img";
    String literatureJk = "/html/body/div[3]/div[5]/div[2]/a[8]/img";
    String openTime = "/html/body/div[3]/div[5]/div[2]/a[9]/img";
    String beautifulReading = "/html/body/div[3]/div[5]/div[2]/a[10]/img";
    String literatureTeaching = "/html/body/div[3]/div[5]/div[2]/a[11]/img";

    public void goSubjectService(){
        actionBot.clickByXpath(subjectService);
    }

    public void goNoveltySearch(){
        actionBot.clickByXpath(noveltySearch);
    }

    public void goCheckAndCheck(){
        actionBot.clickByXpath(checkAndCheck);
    }

    public void goDocumentDelivery(){
        actionBot.clickByXpath(documentDelivery);
    }

    public void goInformationService(){
        actionBot.clickByXpath(informationService);
    }

    public void goPatentService(){
        actionBot.clickByXpath(patentService);
    }

    public void goQuestionAnswer(){
        actionBot.clickByXpath(questionAnswer);
    }

    public void goTeachingAndTraining(){
        actionBot.clickByXpath(teachingAndTraining);
    }

    public void goBookReservation(){
        actionBot.clickByXpath(bookReservation);
    }

    public void goWorkspaceOrder(){
        actionBot.clickByXpath(workspaceOrder);
    }

    public void goReadingRoomReservation(){
        actionBot.clickByXpath(readingRoomReservation);
    }

    public void goActivityReservation(){
        actionBot.clickByXpath(activityReservation);
    }

    public void goCollectionDistribution(){
        actionBot.clickByXpath(collectionDistribution);
    }

    public void goNewBooksBulletins(){
        actionBot.clickByXpath(newBooksBulletins);
    }

    public void goReaderRecommendation(){
        actionBot.clickByXpath(readerRecommendation);
    }

    public void goBookDonation(){
        actionBot.clickByXpath(bookDonation);
    }

    public void goStudentGuide(){
        actionBot.clickByXpath(studentGuide);
    }

    public void goRulesAndRegulations(){
        actionBot.clickByXpath(rulesAndRegulations);
    }

    public void goContactUs(){
        actionBot.clickByXpath(contactUs);
    }

    public void goLiteratureJk(){
        actionBot.clickByXpath(literatureJk);
    }

    public void goOpenTime(){
        actionBot.clickByXpath(openTime);
    }

    public void goBeautifulReading(){
        actionBot.clickByXpath(beautifulReading);
    }

    public void goLiteratureTeaching(){
        actionBot.clickByXpath(literatureTeaching);
    }

}
