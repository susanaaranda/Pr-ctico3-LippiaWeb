package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;
import static lippia.web.constants.MyAccountRegistratioConstant.*;

public class MyAccountRegistrationService extends ActionManager {

    public static void ingresarMail(String mail) {

        WebActionManager.waitClickable(BTN_MAIL).sendKeys(mail);
    }

    public static void ingresarUnPassword(String password) {
        WebActionManager.waitClickable(BTN_PASSWORD).sendKeys(password);
    }

    public static void clickRegister() {

        WebActionManager.waitClickable(BTN_REGISTER).click();
    }

    public static void visualizaUnError(String mensaje) {

        Assert.assertTrue(MENSAJE_ERROR.contains(mensaje));
    }


}
