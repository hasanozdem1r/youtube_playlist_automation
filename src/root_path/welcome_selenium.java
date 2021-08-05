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
        driver.get("https://mp3-youtube.download/tr/faster-online-convert");
        Thread.sleep(500);
        WebElement link=driver.findElement(By.xpath("/html/body/main/section[2]/div/article/div/div/input"));
        Thread.sleep(500);
        link.sendKeys("https://www.youtube.com/watch?v=eYGOFfWIb9c");
        Thread.sleep(500);
        WebElement convert_btn=driver.findElement(By.xpath("//*[@id=\"app\"]/div/article/div/div/div/button"));
        Thread.sleep(500);
        convert_btn.click();
        Thread.sleep(15000);
        WebElement download_btn=driver.findElement(By.xpath("//*[@id=\"app\"]/div/article/div/p[2]/button"));
        download_btn.click();
        //driver.close();
    }
}
