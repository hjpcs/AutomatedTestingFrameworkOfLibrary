import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class search_test {
    public static void main(String[] args) {
        //创建一个浏览器驱动
        WebDriver driver = new ChromeDriver();
        //最大化浏览器窗口
        driver.manage().window().maximize();
        //打开百度首页
        driver.get("https://www.baidu.com/");
        //找到搜索框元素
        WebElement search_text = driver.findElement(By.id("kw"));
        //输入搜索关键字
        search_text.sendKeys("selenium");
        //找到搜索按钮
        WebElement search_button = driver.findElement(By.id("su"));
        //点击搜索按钮
        search_button.click();
        //关闭浏览器
        driver.close();
    }
}
