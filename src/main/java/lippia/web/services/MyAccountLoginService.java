package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;

import static com.crowdar.core.actions.WebActionManager.click;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.MyAccountLoginConstant.*;

public class MyAccountLoginService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickBotonMyAccount(){
        click(BTN_MYACCOUNT);
    }

    public static void clickBotonUsername() {
        click(BTN_USERNAME);
    }

    public static void clickBotonPassword(){
        click(BTN_PASSWORD);
    }

    public static void clickBotonLogin() {
        click(BTN_LOGIN);
    }

}
