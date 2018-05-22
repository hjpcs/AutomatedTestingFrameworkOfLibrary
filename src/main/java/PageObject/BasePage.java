package PageObject;

import Utils.ActionBot;

public class BasePage {

    ActionBot actionBot = new ActionBot();

    String loginUrl = "http://lib.zjxu.edu.cn/User/Index/login?forward=/";
    String indexUrl = "http://lib.zjxu.edu.cn/";
}
