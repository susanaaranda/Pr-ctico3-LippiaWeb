package lippia.web.services;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.WebDriver;


public class HomeService {
    public static void cerrarDriver() {
        WebDriver driver = DriverManager.getDriverInstance();
        driver.close();
    }
}