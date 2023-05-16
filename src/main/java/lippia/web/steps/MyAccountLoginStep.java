package lippia.web.steps;
import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
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

    @And("hago click en botón My Account del menu")
    public void hagoClickEnBotonMyAccountDelMenu() {
        MyAccountLoginService.clickBotonMyAccount();
    }

    @When("ingreso username (.*) valido")
    public void ingresoUsernameUsernameValido(String userName) {

        MyAccountLoginService.ingresarUsername(userName);
    }

    @And("ingreso password (.*) valido")
    public void ingresoPasswordPasswordValido(String password) {

        MyAccountLoginService.ingresarPassword(password);
    }

    @When("ingreso un username (.*) no valido")
    public void ingresoUsernameUsernameNoValido(String userNameNoValido) {
        MyAccountLoginService.ingresarUsername(userNameNoValido);
    }

    @And("ingreso un password (.*) no valido")
    public void ingresoPasswordPasswordNoValido(String passwordNoValido) {

        MyAccountLoginService.ingresarPassword(passwordNoValido);
    }


    @And("hago click en boton Login")
    public void hagoClickEnBoton() {

        MyAccountLoginService.clickBotonLogin();
    }

    @Then("se visualiza un mensaje(.*)")
    public void seVisualizaUnMensaje(String mensaje) {
        MyAccountLoginService.visualizaMensaje(mensaje);
            HomeService.cerrarDriver();

    }

    @Then("se visualiza un (.*) de error")
    public void seVisualizaUnMensajeDeError(String mensaje) {
        MyAccountLoginService.visualizaError(mensaje);
       // HomeService.cerrarDriver();

    }
}
