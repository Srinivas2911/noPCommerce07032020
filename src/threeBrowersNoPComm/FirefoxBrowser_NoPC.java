package threeBrowersNoPComm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxBrowser_NoPC {                       // class

    public static void main(String[] args) {        // main method
        // defining the url
        String baseUrl = "https://www.nopcommerce.com/demo";
        // setting up the webdriver
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        /* setting up the window to maxximum size / wait timeout for the url to display
        and getting the base url */
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        // getting the Title for the ul page and printing in console
        String title = driver.getTitle();
        System.out.println("Main page : "+ title);
        System.out.println(driver.getTitle());

        driver.quit();              // exit the url after display
    }


}
