package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Youtube {
    private WebDriver driver;

    //constructor
    public Youtube() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\bear_s_computer\\Desktop\\APPS\\Browser\\chromedriver.exe");
        this.driver=new ChromeDriver();

    }

    //download mp3
    public void download_mp3(String mp3_link) throws InterruptedException {
        /*
        @param mp3_link <String> : link of Youtube's video
        return void
        */
        this.driver.get("https://ytmp3.cc/downloader/");
        Thread.sleep(300);
        WebElement link_box=this.driver.findElement(By.id("input"));
        Thread.sleep(300);
        link_box.sendKeys(mp3_link);
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

    //download mp3 overwritten method
    public void download_mp3(List<String> mp3_link) throws InterruptedException{
        this.driver.get("https://ytmp3.cc/downloader/");
        for (String link:mp3_link){
            Thread.sleep(1000);
            WebElement link_box=this.driver.findElement(By.id("input"));
            Thread.sleep(1000);
            link_box.sendKeys(link);
            Thread.sleep(1000);
            WebElement convert_btn=this.driver.findElement(By.id("submit"));
            Thread.sleep(1000);
            convert_btn.click();
            Thread.sleep(1000);
            WebElement download_btn=this.driver.findElement(By.xpath("//*[@id=\"buttons\"]/a[1]"));
            Thread.sleep(1000);
            download_btn.click();
            Thread.sleep(1000);
            this.driver.get("https://ytmp3.cc/downloader/");
       }
    }

    //get links of playlist
    public List<String> get_playlist_links(String playlist_link) throws InterruptedException{
        /*
        @param playlist_link <String> : link of Youtube's playlist
        return mp3_links <List<String>> : retrieve all videos links from Youtube then return
        */
        System.out.println("STARTED");
        List<String> mp3_links=new ArrayList<String>();
        this.driver.get(playlist_link);
        Thread.sleep(2000);
            List<WebElement> links_array=this.driver.findElements(By.id("video-title"));
        Thread.sleep(2000);

        for (WebElement link : links_array){
            //System.out.println(link.getAttribute("href").toString());
            mp3_links.add(link.getAttribute("href").toString());
        }
        System.out.println("FINISHED");
        return mp3_links;
    }

}

