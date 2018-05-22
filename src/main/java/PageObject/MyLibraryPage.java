package PageObject;

public class MyLibraryPage extends BasePage{

    String myBorrow = "我的借阅";
    String borrowing = "借阅中";
    String borrowHistory = "//div[@class='tab-item fl cp clear']/div[1]";

    String myOrder = "我的预约";
    String book = "图书";
    String seat = "座位";
    String space = "空间";

    String myLent = "我的转借";
    String borrow = "借出";
    String lend = "借入";
    String borrowHistoryOut = "历史借出";
    String borrowHistoryIn = "历史借入";

    String myExperience = "我的阅历";

    String entrustmentRecord = "委托记录";
    String noveltySearch = "科技查新";
    String checkAndCheck = "查收查引";
    String informationService = "情报服务";
    String patentService = "专利服务";

    String userImg = "/html/body/div[1]/div/div[2]/div/div[2]/img";
    String accountAndInfo = "账号与资料";
    String exit = "//div[@class='info-item cp login-out-btn']";

    public void clickMyBorrow(){
        actionBot.clickByLinkText(myBorrow);
    }

    public void clickBorrowing(){
        actionBot.clickByLinkText(borrowing);
    }

    public void clickBorrowHistory(){
        actionBot.clickByXpath(borrowHistory);
    }

    public void clickMyOrder(){
        actionBot.clickByLinkText(myOrder);
    }

    public void clickBook(){
        actionBot.clickByLinkText(book);
    }

    public void clickSeat(){
        actionBot.clickByLinkText(seat);
    }

    public void clickSpace(){
        actionBot.clickByLinkText(space);
    }

    public void clickMyLent(){
        actionBot.clickByLinkText(myLent);
    }

    public void clickBorrow(){
        actionBot.clickByLinkText(borrow);
    }

    public void clickLend(){
        actionBot.clickByLinkText(lend);
    }

    public void clickBorrowHistoryOut(){
        actionBot.clickByLinkText(borrowHistoryOut);
    }

    public void clickBorrowHistoryIn(){
        actionBot.clickByLinkText(borrowHistoryIn);
    }

    public void clickMyExperience(){
        actionBot.clickByLinkText(myExperience);
    }

    public void clickEntrustmentRecord(){
        actionBot.clickByLinkText(entrustmentRecord);
    }

    public void clickNoveltySearch(){
        actionBot.clickByLinkText(noveltySearch);
    }

    public void clickCheckAndCheck(){
        actionBot.clickByLinkText(checkAndCheck);
    }

    public void clickInformationService(){
        actionBot.clickByLinkText(informationService);
    }

    public void clickPatentService(){
        actionBot.clickByLinkText(patentService);
    }

    public void moveToUserImg(){
        actionBot.moveToElementByXpath(userImg);
    }

    public void clickAccountAndInfo(){
        actionBot.clickByLinkText(accountAndInfo);
    }

    public void clickExit(){
        actionBot.clickByXpath(exit);
    }

}
