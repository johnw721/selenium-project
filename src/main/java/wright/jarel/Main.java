package wright.jarel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Grey\\Documents\\Software_Projects\\selenium project\\demo\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigates to the URL specified
        driver.get();
        String title = driver.getTitle();

        // Closes the browser window and stops the webdriver
        driver.stop();

        System.out.println("Hello world!");
    }
}