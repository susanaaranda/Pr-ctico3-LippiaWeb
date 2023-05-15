package lippia.web.steps;
import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.*;
import lippia.web.services.MyAccountLoginService;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

import static com.crowdar.core.actions.WebActionManager.click;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.SuperiorNavigationBarConstants.BTN_READMORE_ID;

public class MyAccountLoginStep extends PageSteps {

    @Given("estoy en la pagina Automationtesting")
    public void estoyEnLaPaginaAutomationtesting() {

        navigateTo(PropertyManager.getProperty("web.base.url"));

    }

    @And("^hago click en botón \"(.*)\" del menu$")
    public void hagoClickEnBotonMyAccountDelMenu(String myAccountButton) {
        MyAccountLoginService.clickBotonMyAccount();
    }

    @When("ingreso username (.*) valido")
    public void ingresoUsernameUsernameValido(String userName) {
        MyAccountLoginService.clickBotonUsername();

    }

    @And("ingreso password (.*) valido")
    public void ingresoPasswordPasswordValido(String password) {
        MyAccountLoginService.clickBotonPassword();
    }

    @And("^hago click en boton \"(.*)\"$")
    public void hagoClickEnBoton(String loginButton) {
        MyAccountLoginService.clickBotonLogin();
    }

    @Then("se visualiza el dashboard de la aplicacion")
    public void seVisualizaElDashboardDeLaAplicacion() {
    }

    @Then("se visualiza mensaje (.*) de error")
    public void seVisualizaMensajeMensajeDeError() {
    }
}
