package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.MyAccountLoginService;


public class MyAccountLoginStep extends PageSteps {

    @And("hago click en botón My Account del menu")
    public void hagoClickEnBotonMyAccountDelMenu() {
        MyAccountLoginService.clickBotonMyAccount();
    }

    @When("ingreso username (.*) valido")
    public void ingresoUsernameValido(String userName) {
        MyAccountLoginService.ingresarUsername(userName);
    }

    @And("ingreso passwords (.*) valido")
    public void ingresoPasswordsValido(String password) {
        MyAccountLoginService.ingresarPasswords(password);
    }

    @When("ingreso un username (.*) no valido")
    public void ingresoUsernameNoValido(String userNameNoValido) {
        MyAccountLoginService.ingresarUsername(userNameNoValido);
    }

    @And("ingreso password (.*) no valido")
    public void ingresoPasswordNoValido(String passwordNoValido) {
        MyAccountLoginService.ingresarPasswordN(passwordNoValido);
    }

    @And("hago click en boton Login")
    public void hagoClickEnBoton() {
        MyAccountLoginService.clickBotonLogin();
    }

    @Then("se visualiza mensaje (.*)")
    public void seVisualizaMensaje(String mensaje) {
        MyAccountLoginService.visualizaMensaje(mensaje);

    }

    @Then("se visualiza un (.*) de error")
    public void seVisualizaUnMensajeDeError(String mensaje) {
        MyAccountLoginService.visualizaError(mensaje);

    }

    @When("hago click en el boton Sign Out")
    public void hagoClickEnElBotonSignOut() {
        MyAccountLoginService.clickBotonSignOut();
    }

    @And("se visualiza el Login")
    public void seVisualizaElLogin() {
        MyAccountLoginService.visualizaLogin();
    }

    @And("hago click en boton Retroceder de la pagina")
    public void hagoClickEnBotonRetrocederDeLaPagina() {
        MyAccountLoginService.clickBotonRetroceder();
    }
}
