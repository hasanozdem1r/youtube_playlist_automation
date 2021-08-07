package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class main {
    public static void main(String[] args) throws InterruptedException {
        Youtube obj=new Youtube();
        //obj.download_mp3("https://ytmp3.cc/downloader/");
        obj.get_playlist_links("https://www.youtube.com/playlist?list=PLoLjITz0dx2JUvvkPxjphRVEDZ3Oip5UL");
    }
}

