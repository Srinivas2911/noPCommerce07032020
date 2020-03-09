package threeBrowersNoPComm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowser_NoPC {

    public static void main(String[] args) {        // main method

        // setting up the url and the web driver
        String baseUrl = "https://www.nopcommerce.com/demo";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();      // driver for chrome defined

        driver.manage().window().maximize();  // this will maximize the window
        // setting the time for the browser to be open
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);   // getting the base url

        // getting title page
        String title = driver.getTitle();
        System.out.println("Main page : " + title);     // main page : With Title name
        System.out.println(driver.getTitle());          // getting the Title page

        driver.quit();     //quit the url after the time period.
    }
}