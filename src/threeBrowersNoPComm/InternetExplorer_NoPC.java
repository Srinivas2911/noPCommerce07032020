package threeBrowersNoPComm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetExplorer_NoPC {                         // class

    public static void main(String[] args) {            // main method

        //setting up the url and the web driver
        String baseUrl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        // managing maximum view on screen, timeout and getting the url
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        // calling the title name and printing the title of the url page
        String title = driver.getTitle();
        System.out.println("Main page : " +title);
        System.out.println(driver.getTitle());

        driver.quit();          // exiting the url
    }
}
