package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.MyAccountLoginConstant;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import static lippia.web.constants.MyAccountLoginConstant.*;


public class MyAccountLoginService extends ActionManager {

    public static void clickBotonMyAccount(){

        click(MyAccountLoginConstant.BTN_MYACCOUNT);
    }

    public static void ingresarUsername(String usuario) {

        ActionManager.waitClickable(INPUT_TEXT_USERNAME).sendKeys(usuario);
    }

    public static void ingresarPasswords(String clave){

        ActionManager.waitClickable(INPUT_TEXT_PASSWORD).sendKeys(clave);
    }

    public static void clickBotonLogin() {

        click(MyAccountLoginConstant.BTN_LOGIN);
    }

    public static void visualizaMensaje(String mensaje){

       Assert.assertTrue(TEXT_MENSAJE.contains(mensaje));
    }

    public static void visualizaError(String mensajeError){
        Assert.assertTrue(TEXT_MENSAJE_ERROR.contains(mensajeError));
    }

    public static void clickBotonSignOut() {

        click(BTN_SIGNOUT);
    }

    public static void clickBotonRetroceder() {
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        driver.navigate().back();
    }

    public static void ingresarPasswordN(String passwordNoValido) {
        ActionManager.waitClickable(INPUT_PASSWORD_N).sendKeys(passwordNoValido);
    }

    public static void visualizaLogin() {

        Assert.assertTrue(ActionManager.waitPresence(LOGIN_TITULO).isDisplayed());
    }
}
