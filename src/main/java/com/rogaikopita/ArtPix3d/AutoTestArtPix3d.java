package com.rogaikopita.ArtPix3d;

public class AutoTestArtPix3d {
    public static void AutoTestArtPix3d(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/romankliuchnyk/IdeaProjects/Autotests/src/main/sources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://artpix3d.com");

        WebElevent etSearchField = driver.findElement(By.xpath(".//*[@name='q']"));

        etSearchField.sendKays("Selenium");
        Thread.sleep(3000);

        etSearchField.submit();
        Thread.sleep(5000);

        System.out.println("Page title is: " +driver.getTitle());

        driver.quit();
    }
}
