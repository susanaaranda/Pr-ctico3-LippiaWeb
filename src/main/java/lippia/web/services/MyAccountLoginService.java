package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MyAccountLoginConstant;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.click;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.MyAccountLoginConstant.*;

public class MyAccountLoginService extends ActionManager {
    private static final String INPUT_TEXT_USERNAME = "id:username";
    private static final String INPUT_TEXT_PASSWORD = "id:password";

    private static final String INPUT_TEXT_PASSWORD_REGISTER = "xpath://*[@id='reg_password']";
    private static final String TEXT_LOGOUT = "xpath://a[text()='Logout']";
    private static final String TEXT_MENSAJE = "xpath://*[contains(text(),'Hello')]";
    private static final String TEXT_MENSAJE_ERROR = "xpath://*[contains(text(),'Error')]";

    public static void clickBotonMyAccount(){

        click(MyAccountLoginConstant.BTN_MYACCOUNT);
    }

    public static void ingresarUsername(String usuario) {

        ActionManager.waitClickable(INPUT_TEXT_USERNAME).sendKeys(usuario);
    }

    public static void ingresarPassword(String clave){

        ActionManager.waitClickable(INPUT_TEXT_PASSWORD).sendKeys(clave);
    }

    public static void clickBotonLogin() {

        click(MyAccountLoginConstant.BTN_LOGIN);
    }

    public static void visualizaMensaje (String mensaje){

        Assert.assertTrue(TEXT_MENSAJE.contains(mensaje));
    }

    public static void visualizaError(String mensajeError){
        Assert.assertTrue(TEXT_MENSAJE_ERROR.contains(mensajeError));
    }

}
