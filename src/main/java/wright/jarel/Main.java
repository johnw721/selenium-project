package wright.jarel;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Grey\\Documents\\Software_Projects\\selenium project\\demo\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}