package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Youtube {
    private WebDriver driver;

    //constructor
    public Youtube() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\bear_s_computer\\Desktop\\APPS\\Browser\\chromedriver.exe");
        this.driver=new ChromeDriver();

    }

    //download mp3
    public void download_mp3(String link) throws InterruptedException {
        this.driver.get(link);
        Thread.sleep(300);
        WebElement link_box=this.driver.findElement(By.id("input"));
        Thread.sleep(300);
        link_box.sendKeys("https://www.youtube.com/watch?v=eYGOFfWIb9c");
        Thread.sleep(300);
        WebElement convert_btn=this.driver.findElement(By.id("submit"));
        Thread.sleep(300);
        convert_btn.click();
        Thread.sleep(300);
        WebElement download_btn=this.driver.findElement(By.xpath("//*[@id=\"buttons\"]/a[1]"));
        Thread.sleep(300);
        download_btn.click();
        Thread.sleep(300);
        System.out.println("Successful");
    }

    public String[] get_playlist_links(String playlist_link) throws InterruptedException{
        this.driver.get(playlist_link);
        Thread.sleep(2000);
        List<WebElement> links_array=this.driver.findElements(By.className("yt-simple-endpoint style-scope ytd-playlist-video-renderer"));
        Thread.sleep(2000);
        int counter=links_array.size();
        System.out.println(counter);
        for (WebElement link : links_array){
            System.out.println(link.getAttribute("href"));
        }
        System.out.println("successful");
        return null;
    }
}

