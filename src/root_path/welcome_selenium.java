package root_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class welcome_selenium {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to Selenium Project");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\bear_s_computer\\Desktop\\APPS\\Browser\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://ytmp3.cc/downloader/");
        Thread.sleep(500);
        WebElement link_box=driver.findElement(By.id("input"));
        Thread.sleep(500);
        link_box.sendKeys("https://www.youtube.com/watch?v=eYGOFfWIb9c");
        Thread.sleep(500);
        WebElement convert_btn=driver.findElement(By.id("submit"));
        Thread.sleep(500);
        convert_btn.click();
        Thread.sleep(15000);
        WebElement download_btn=driver.findElement(By.xpath("//*[@id=\"buttons\"]/a[1]"));
        download_btn.click();
        //driver.close();
    }
}
