package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ActionBot{
    public static WebDriver driver;

    //打开网址
    public void Open(String url){
        driver = new ChromeDriver();
        driver.get(url);
    }

    //根据id获取元素
    public WebElement findElementById(String id){
        return driver.findElement(By.id(id));
    }

    //根据name获取元素
    public WebElement findElementByName(String name){
        return driver.findElement(By.name(name));
    }

    //根据class name获取元素
    public WebElement findElementByClassName(String className){
        return driver.findElement(By.className(className));
    }

    //根据tag name获取元素
    public WebElement findElementByTagName(String tagName){
        return driver.findElement(By.tagName(tagName));
    }

    //根据link text获取元素
    public WebElement findElementByLinkText(String linkText){
        return driver.findElement(By.linkText(linkText));
    }

    //根据partial text获取元素
    public WebElement findElementByPartialText(String partialText){
        return driver.findElement(By.partialLinkText(partialText));
    }

    //根据xpath获取元素
    public WebElement findElemetnByXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    //根据css selector获取元素
    public WebElement findElementByCssSelector(String cssSelector){
        return driver.findElement(By.cssSelector(cssSelector));
    }

    //设置浏览器最大化
    public void browserMaxsize(){
        driver.manage().window().maximize();
    }

    //浏览器前进
    public void browserForward(){
        driver.navigate().forward();
    }

    //浏览器后退
    public void browserBack(){
        driver.navigate().back();
    }

    //刷新页面
    public void Refresh(){
        driver.navigate().refresh();
    }

    //根据id获取元素并点击
    public void clickById(String id){
        findElementById(id).click();
    }

    //根据name获取元素并点击
    public void clickByName(String name){
        findElementByName(name).click();
    }

    //根据class name获取元素并点击
    public void clickByClassName(String className){
        findElementByClassName(className).click();
    }

    //根据tag name获取元素并点击
    public void clickByTagName(String tagName){
        findElementByTagName(tagName).click();
    }

    //根据link text获取元素并点击
    public void clickByLinkText(String linkText){
        findElementByLinkText(linkText).click();
    }

    //根据partial text获取元素并点击
    public void clickByPartialText(String partialText){
        findElementByPartialText(partialText).click();
    }

    //根据xpath获取元素并点击
    public void clickByXpath(String xpath){
        findElemetnByXpath(xpath).click();
    }

    //根据css selector获取元素并点击
    public void clickByCssSelector(String cssSelector){
        findElementByCssSelector(cssSelector).click();
    }

    //根据id获取元素并输入值
    public void sendkeysById(String id,String text){
        findElementById(id).clear();
        findElementById(id).sendKeys(text);
    }

    //根据name获取元素并输入值
    public void sendkeysByName(String name,String text){
        findElementByName(name).clear();
        findElementByName(name).sendKeys(text);
    }

    //根据class name获取元素并输入值
    public void sendkeysByClassName(String className,String text){
        findElementByClassName(className).clear();
        findElementByClassName(className).sendKeys(text);
    }

    //根据tag name获取元素并输入值
    public void sendkeysByTagName(String tagName,String text){
        findElementByTagName(tagName).clear();
        findElementByTagName(tagName).sendKeys(text);
    }

    //根据link text获取元素并输入值
    public void sendkeysByLinkText(String linkText,String text){
        findElementByLinkText(linkText).clear();
        findElementByLinkText(linkText).sendKeys(text);
    }

    //根据partial text获取元素并输入值
    public void sendkeysByPartialText(String partialText,String text){
        findElementByPartialText(partialText).clear();
        findElementByPartialText(partialText).sendKeys(text);
    }

    //根据xpath获取元素并输入值
    public void sendkeysByXpath(String xpath,String text){
        findElemetnByXpath(xpath).clear();
        findElemetnByXpath(xpath).sendKeys(text);
    }

    //根据css selector获取元素并输入值
    public void sendkeysByCssSelector(String cssSelector,String text){
        findElementByCssSelector(cssSelector).clear();
        findElementByCssSelector(cssSelector).sendKeys(text);
    }

    //获取元素文本内容
    public String getTextById(String id){
        return findElementById(id).getText();
    }

    public String getTextByName(String name){
        return findElementByName(name).getText();
    }

    public String getTextByClassName(String className){
        return findElementByClassName(className).getText();
    }

    public String getTextByXpath(String xpath){
        return findElemetnByXpath(xpath).getText();
    }

    public String getTextByLinkText(String linkText){
        return findElementByLinkText(linkText).getText();
    }

    //鼠标悬停操作
    public void moveToElementByXpath(String xpath){
        Actions action = new Actions(driver);
        action.clickAndHold(findElemetnByXpath(xpath)).perform();
    }

    public void moveToElementAndClick(String linkText){
        Actions action = new Actions(driver);
        action.click(findElementByLinkText(linkText)).perform();

    }

    //获取页面断言信息
    public String getTitle(){
        return driver.getTitle();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    //设置元素等待
    public void elementWait(int second){
        driver.manage().timeouts().implicitlyWait(second,TimeUnit.SECONDS);
    }

    //设置页面等待
    public void pageLoadWait(int second){
        driver.manage().timeouts().pageLoadTimeout(second,TimeUnit.SECONDS);
    }

    //获取一组元素
    public List<WebElement> findElementsById(String id){
        return driver.findElements(By.id(id));
    }

    public List<WebElement> findElementsByName(String name){
        return driver.findElements(By.name(name));
    }

    public List<WebElement> findElementsByClassName(String className){
        return driver.findElements(By.className(className));
    }

    public List<WebElement> findElementsByXpath(String xpath){
        return driver.findElements(By.xpath(xpath));
    }

    //获取系统当前时间
    public String getNow(){
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        return df.format(day);
    }

    //获取截图命名为当前时间
    public void screenShot() throws IOException{
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String file = "C:\\idea\\IdeaProjects\\AutomatedTestingFrameworkOfLibrary\\screenshot\\"+getNow()+".png";
        FileUtils.copyFile(srcFile,new File(file));
    }

    //线程休眠
    public void sleep(int milli) throws Exception{
        Thread.sleep(milli);
    }

    //关闭浏览器
    public void exit(){
        /*if (driver == null){
            return;
        }*/
        driver.quit();
        //
    }

    //获得当前窗口句柄
    public String getCurrentHandle(){
        return driver.getWindowHandle();
    }

    //窗口切换
    public void changeWindow(){
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles){
            if(handle.equals(getCurrentHandle())==false){
                driver.switchTo().window(handle);
            }
        }
    }

    //关闭当前窗口
    public void closeCurrentWindow(){
        driver.close();
    }

    //断言用例
    public void titleAssert (String title,String msg) throws Exception{
        try {
            Assert.assertEquals(getTitle(), title, msg);
        }catch (AssertionError e){
            screenShot();
            throw e;
        }
    }

    public void urlAssert (String url,String msg) throws Exception{
        try {
            Assert.assertEquals(getCurrentUrl(), url, msg);
        }catch (AssertionError e){
            screenShot();
            throw e;
        }
    }

    public void textAssert (String text0,String text1,String msg) throws Exception{
        try {
            Assert.assertEquals(text0, text1, msg);
        }catch (AssertionError e){
            screenShot();
            throw e;
        }
    }

}